$(function() {
	// <!--Step:1 为ECharts准备一个具备大小（宽高）的Dom-->
	// Step:3 echarts & zrender as a Global Interface by the echarts-plain.js.
	// Step:3 echarts和zrender被echarts-plain.js写入为全局接口
	onloadurl();
	var myChart = echarts.init(document.getElementById('main'));
	var now = new Date();
	var res = [];
	var len = 20;
	while (len--) {
		var time = now.toLocaleTimeString().replace(/^\D*/, '');
		time = time.substr(time.indexOf(":") + 1);
		res.unshift(time);
		now = new Date(now - 1000);
	}
	option = {
		legend : {
			data : [ 'jvm内存使用率', '物理内存使用率', 'cpu使用率' ]
		},
		grid : {
			x : 40,
			y : 30,
			x2 : 10,
			y2 : 35,
			borderWidth : 0,
			borderColor : "#FFFFFF"
		},
		xAxis : [ {
			axisLabel : {
				rotate : 40
			},
			type : 'category',// 坐标轴类型，横轴默认为类目型'category'，纵轴默认为数值型'value'
			data : res
		} ],
		yAxis : [ {
			min : 0,
			max : 100,
			axisLabel : {
				formatter : '{value}%'
			}
		} ],
		series : [
				{
					name : 'jvm内存使用率',
					type : 'line',
					data : [ 12, 25, 31, 11, 45, 50, 11, 09, 28, 35, 40, 24,
							28, 39, 23, 31, 14, 18, 08, 36 ]
				},
				{
					name : '物理内存使用率',
					type : 'line',
					data : [ 55, 41, 10, 23, 15, 44, 29, 41, 27, 05, 12, 25,
							31, 11, 45, 50, 11, 09, 28, 35 ]
				},
				{
					name : 'cpu使用率',
					type : 'line',
					data : [ 40, 24, 28, 39, 23, 31, 14, 18, 08, 36, 55, 41,
							10, 23, 15, 44, 29, 41, 27, 05 ]
				} ]
	};
	myChart.setOption(option);
	var axisData;
	clearInterval(timeTicket);
	var timeTicket = setInterval(function() {
		axisData = (new Date()).toLocaleTimeString().replace(/^\D*/, '');
		axisData = axisData.substr(axisData.indexOf(":") + 1);
		var jvm = [];
		var ram = [];
		var cpu = [];
		$.ajax({
			type : "POST",
			url : rootPath + '/monitor/usage',
			async : false,
			dataType : 'json',
			success : function(json) {
				$("#td_jvmUsage").html(json.jvmUsage);
				$("#td_serverUsage").html(json.ramUsage);
				$("#td_cpuUsage").html(json.cpuUsage);
				
				
				jvm.push(json.jvmUsage);
				ram.push(json.ramUsage);
				cpu.push(json.cpuUsage);
				// 动态数据接口 addData
				myChart.addData([ [ 0, // 系列索引
				jvm, // 新增数据
				false, // 新增数据是否从队列头部插入
				false, // 是否增加队列长度，false则自定删除原有数据，队头插入删队尾，队尾插入删队头
				], [ 1, // 系列索引
				ram, // 新增数据
				false, // 新增数据是否从队列头部插入
				false, // 是否增加队列长度，false则自定删除原有数据，队头插入删队尾，队尾插入删队头
				], [ 2, // 系列索引
				cpu, // 新增数据
				false, // 新增数据是否从队列头部插入
				false, // 是否增加队列长度，false则自定删除原有数据，队头插入删队尾，队尾插入删队头
				axisData // 坐标轴标签
				] ]);

			}
		});
	}, 3000);
	
});