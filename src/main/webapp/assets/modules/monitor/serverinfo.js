/**
 * Created by dennisit.pu on 2015/10/20.
 */

/** load for server info */
$(function(){
    $.ajax({
        type : "POST",
        url : rootPath + '/monitor/serverInfo',
        async : false,
        dataType: 'jsonp',
        jsonp: 'callback',
        success : function(json) {
            var html = juicer(tpl_monitor_serverInfo, json);
            $("#serverInf-tpl").html(html);

        }
    });
});