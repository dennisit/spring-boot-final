/**
 * Created by dennisit.pu on 2015/10/20.
 */

/** 磁盘信息-模板 */
var tpl_monitor_sidkInfo = [
        '{@each data as it,index}',
        '<tr>',
        '<td>${it.diskName}</td>',
        '<td>${it.diskType}</td>',
        '<td>${it.diskTotal}</td>',
        '<td>${it.diskUse}</td>',
        '<td>${it.diskFree}</td>',
        '<td>${it.diskUsage}%</td>',
        '</tr>',
        '{@/each}'
].join('');

/** 服务器信息-模板 */
var tpl_monitor_serverInfo = [
        '<tr><td>服务器IP</td> <td>${hostIp}</td></tr>',
        '<tr><td>主机名</td> <td>${hostName}</td></tr>',
        '<tr><td>操作系统名称</td> <td>${osName}</td></tr>',
        '<tr><td>操作系统版本</td> <td>${osVersion}</td></tr>',
        '<tr><td>操作系统架构</td> <td>${arch}</td></tr>',
        '<tr><td>处理器个数</td> <td>${processors}</td></tr>',
        '<tr><td>java运行环境版本</td> <td>${javaVersion}</td></tr>',
        '<tr><td>java安装路径</td> <td>${javaHome}</td></tr>',
        '<tr><td>默认的临时路径</td> <td>${tmpDir}</td></tr>',
].join('');


/** 阀值报警-模板 */
var tpl_settgings_valveFit = [
        '<form class="form-horizontal form-bordered" data-parsley-validate="true" action="/monitor/setValveFit" method="POST">',
        '{@each data as it,index}',
        '       <div class="form-group">',
        '               <label class="control-label col-md-4 col-sm-4">${it.valveTitle}* :</label>',
        '               <div class="col-md-6 col-sm-6">',
        '                       <input type="hidden" id="${it.valveTitle}"/>',
        '                       <input class="form-control parsley-validated" type="text" id="${it.valveTitle}" name="${it.valveTitle}"  value="${it.valveValue}" placeholder="${it.depict}" data-parsley-pattern="#[A-Fa-f0-9]{6}" data-parsley-required="true" />',
        '               </div>',
        '       </div>',
        '{@/each}',
        '       <div class="form-group">',
        '               <label class="control-label col-md-4 col-sm-4"></label>',
        '               <div class="col-md-6 col-sm-6">',
        '                       <button type="submit" class="btn btn-danger">设置</button>',
        '               </div>',
        '       </div>',
        '</form>'
].join('');






