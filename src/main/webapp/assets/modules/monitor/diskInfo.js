/**
 * Created by dennisit.pu on 2015/10/20.
 */

/** load for server info */
$(function(){
    $(function(){
        $.ajax({
            type : "POST",
            url : rootPath + '/monitor/diskInfo',
            async : false,
            dataType: 'json',
            //jsonp: 'callback',
            success : function(json) {
                var html = juicer(tpl_monitor_sidkInfo, json);
                //alert(html);
                //$("#diskInf-tpl").innerHTML = html;
                $("#diskInf-tpl").html(html);
            }
        });
    });
});