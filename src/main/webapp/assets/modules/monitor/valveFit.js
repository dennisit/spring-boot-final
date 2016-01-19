/**
 * Created by dennisit.pu on 2015/10/20.
 */

/** load for server info */
$(function(){
    $(function(){
        $.ajax({
            type : "POST",
            url : rootPath + '/monitor/valveFit',
            async : false,
            dataType: 'json',
            //jsonp: 'callback',
            success : function(json) {
                var html = juicer(tpl_settgings_valveFit, json);
                //alert(html);
                //$("#diskInf-tpl").innerHTML = html;
                $("#valveFit-tpl").html(html);
            }
        });
    });
});