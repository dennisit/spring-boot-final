<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]>
<html lang="zh-cn" class="ie8">
<![endif]-->
<!--[if !IE]>
<html lang="zh-cn">
<!--<![endif]-->
<head>
  <meta charset="utf-8" />
  <title>音悦台后台</title>
  <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
  <meta content="" name="description" />
  <meta content="" name="author" />

  <!-- ================== BEGIN BASE CSS STYLE ================== -->
  <!--
  <link href="http://fonts.useso.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet" />
  -->

  <link href="/assets/plugins/jquery-ui/themes/base/minified/jquery-ui.min.css" rel="stylesheet" />
  <link href="/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
  <link href="/assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" />
  <link href="/assets/css/animate.min.css" rel="stylesheet" />
  <link href="/assets/css/style.min.css" rel="stylesheet" />
  <link href="/assets/css/style-responsive.min.css" rel="stylesheet" />
  <link href="/assets/css/theme/default.css" rel="stylesheet" id="theme" />
  <!-- ================== END BASE CSS STYLE ================== -->

  <!-- ================== BEGIN PAGE LEVEL STYLE ================== -->
  <link href="/assets/plugins/jquery-jvectormap/jquery-jvectormap-1.2.2.css" rel="stylesheet" />
  <link href="/assets/plugins/bootstrap-datepicker/css/datepicker.css" rel="stylesheet" />
  <link href="/assets/plugins/bootstrap-datepicker/css/datepicker3.css" rel="stylesheet" />
  <link href="/assets/plugins/gritter/css/jquery.gritter.css" rel="stylesheet" />
  <!-- ================== END PAGE LEVEL STYLE ================== -->

  <!-- ================== BEGIN BASE JS ================== -->
  <script type="text/javascript" src="/assets/plugins/pace/pace.min.js"></script>
  <!-- ================== END BASE JS ================== -->

</head>
<body>
<!-- begin #page-loader -->
<div id="page-loader" class="fade in"><span class="spinner"></span></div>
<!-- end #page-loader -->

<!-- begin #page-container -->
<div id="page-container" class="fade page-sidebar-fixed page-header-fixed">
  <!-- begin #header -->
  <div id="header" class="header navbar navbar-default navbar-fixed-top">
    <!-- begin container-fluid -->
    <div class="container-fluid">
      <!-- begin mobile sidebar expand / collapse button -->
      <div class="navbar-header">
        <a href="index.html" class="navbar-brand"><span class="navbar-logo"></span> 后台管理</a>
        <button type="button" class="navbar-toggle" data-click="sidebar-toggled">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
      </div>
      <!-- end mobile sidebar expand / collapse button -->

      <!-- begin header navigation right -->
      <ul class="nav navbar-nav navbar-right">
        <li>
          <form class="navbar-form full-width">
            <div class="form-group">
              <input type="text" class="form-control" placeholder="输入查询关键词" />
              <button type="submit" class="btn btn-search"><i class="fa fa-search"></i></button>
            </div>
          </form>
        </li>
        <li class="dropdown hidden-xs">
          <a href="javascript:;" data-toggle="dropdown" class="dropdown-toggle f-s-14">
            <i class="fa fa-bell-o"></i>
            <span class="label">3</span>
          </a>
          <ul class="dropdown-menu media-list pull-right animated fadeInDown">
            <li class="dropdown-header">系统通知 (3)</li>
            <li class="media">
              <a href="javascript:;">
                <div class="media-left"><i class="fa fa-bug media-object bg-red"></i></div>
                <div class="media-body">
                  <h6 class="media-heading">Server Error Reports</h6>
                  <div class="text-muted f-s-11">3 minutes ago</div>
                </div>
              </a>
            </li>
            <li class="media">
              <a href="javascript:;">
                <div class="media-left"><img src="../../../assets/img/user-2.jpg" class="media-object" alt="" /></div>
                <div class="media-body">
                  <h6 class="media-heading">荆天明</h6>
                  <p>烧鸡腿,炸鸡腿.</p>
                  <div class="text-muted f-s-11">35 分钟前</div>
                </div>
              </a>
            </li>
            <li class="media">
              <a href="javascript:;">
                <div class="media-left"><i class="fa fa-envelope media-object bg-blue"></i></div>
                <div class="media-body">
                  <h6 class="media-heading"> New Email From John</h6>
                  <div class="text-muted f-s-11">2 小时前</div>
                </div>
              </a>
            </li>
            <li class="dropdown-footer text-center">
              <a href="javascript:;">查看更多</a>
            </li>
          </ul>
        </li>
        <li class="dropdown navbar-user">
          <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
            <img src="../../../assets/img/user-13.jpg" alt="" />
            <span class="hidden-xs">蒲东平</span> <b class="caret"></b>
          </a>
          <ul class="dropdown-menu animated fadeInLeft">
            <li class="arrow"></li>
            <li><a href="javascript:;">编辑资料</a></li>
            <li><a href="javascript:;"><span class="badge badge-danger pull-right">2</span> 收件箱</a></li>
            <li><a href="javascript:;">系统设置</a></li>
            <li class="divider"></li>
            <li><a href="javascript:;">退出系统</a></li>
          </ul>
        </li>
      </ul>
      <!-- end header navigation right -->
    </div>
    <!-- end container-fluid -->
  </div>
  <!-- end #header -->

  <!-- begin #sidebar -->
  <div id="sidebar" class="sidebar">
    <!-- begin sidebar scrollbar -->
    <div data-scrollbar="true" data-height="100%">
      <!-- begin sidebar user -->
      <ul class="nav">
        <li class="nav-profile">
          <div class="image">
            <a href="javascript:;"><img src="../../../assets/img/user-13.jpg" alt="" /></a>
          </div>
          <div class="info">
            苏若年<small>系统管理员</small>
          </div>
        </li>
      </ul>
      <!-- end sidebar user -->
      <!-- begin sidebar nav -->
      <ul class="nav">
        <li class="nav-header">导航菜单</li>
        <li class="has-sub active">
          <a href="javascript:;">
            <b class="caret pull-right"></b>
            <i class="fa fa-laptop"></i>
            <span>快捷面板</span>
          </a>
          <ul class="sub-menu">
            <li class="active"><a href="index.html">数据分析</a></li>
            <li><a href="index_v2.html">系统设置</a></li>
          </ul>
        </li>
        <li class="has-sub">
          <a href="javascript:;">
            <b class="caret pull-right"></b>
            <i class="fa fa-medkit"></i>
            <span>帮助文档</span>
          </a>
          <ul class="sub-menu">
            <li><a href="helper_css.html">系统帮助</a></li>
          </ul>
        </li>
        <!-- begin sidebar minify button -->
        <li><a href="javascript:;" class="sidebar-minify-btn" data-click="sidebar-minify"><i class="fa fa-angle-double-left"></i></a></li>
        <!-- end sidebar minify button -->
      </ul>
      <!-- end sidebar nav -->
    </div>
    <!-- end sidebar scrollbar -->
  </div>
  <div class="sidebar-bg"></div>
  <!-- end #sidebar -->

  <!-- begin #content -->
  <div id="content" class="content">
    <!-- begin breadcrumb -->
    <ol class="breadcrumb pull-right">
      <li><a href="javascript:;">首页</a></li>
      <li class="active">快捷面板</li>
    </ol>
    <!-- end breadcrumb -->
    <!-- begin page-header -->
    <h1 class="page-header">快捷面板 <small>系统后台</small></h1>
    <!-- end page-header -->

    <!-- begin row -->
    <div class="row">
      <!-- begin col-3 -->
      <div class="col-md-3 col-sm-6">
        <div class="widget widget-stats bg-green">
          <div class="stats-icon"><i class="fa fa-desktop"></i></div>
          <div class="stats-info">
            <h4>TOTAL VISITORS</h4>
            <p>3,291,922</p>
          </div>
          <div class="stats-link">
            <a href="javascript:;">View Detail <i class="fa fa-arrow-circle-o-right"></i></a>
          </div>
        </div>
      </div>
      <!-- end col-3 -->
      <!-- begin col-3 -->
      <div class="col-md-3 col-sm-6">
        <div class="widget widget-stats bg-blue">
          <div class="stats-icon"><i class="fa fa-chain-broken"></i></div>
          <div class="stats-info">
            <h4>BOUNCE RATE</h4>
            <p>20.44%</p>
          </div>
          <div class="stats-link">
            <a href="javascript:;">View Detail <i class="fa fa-arrow-circle-o-right"></i></a>
          </div>
        </div>
      </div>
      <!-- end col-3 -->
      <!-- begin col-3 -->
      <div class="col-md-3 col-sm-6">
        <div class="widget widget-stats bg-purple">
          <div class="stats-icon"><i class="fa fa-users"></i></div>
          <div class="stats-info">
            <h4>UNIQUE VISITORS</h4>
            <p>1,291,922</p>
          </div>
          <div class="stats-link">
            <a href="javascript:;">View Detail <i class="fa fa-arrow-circle-o-right"></i></a>
          </div>
        </div>
      </div>
      <!-- end col-3 -->
      <!-- begin col-3 -->
      <div class="col-md-3 col-sm-6">
        <div class="widget widget-stats bg-red">
          <div class="stats-icon"><i class="fa fa-clock-o"></i></div>
          <div class="stats-info">
            <h4>AVG TIME ON SITE</h4>
            <p>00:12:23</p>
          </div>
          <div class="stats-link">
            <a href="javascript:;">View Detail <i class="fa fa-arrow-circle-o-right"></i></a>
          </div>
        </div>
      </div>
      <!-- end col-3 -->

    </div>
    <!-- end row -->

    <!-- begin row -->
    <div class="row">
      <!-- begin col-8 -->
      <div class="col-md-7">

        <div class="panel panel-inverse" data-sortable-id="index-1">
          <div class="panel-heading">
            <div class="panel-heading-btn">
              <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
              <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
              <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
              <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
            </div>
            <h4 class="panel-title">实时监控 (最近20分钟内)</h4>
          </div>
          <div class="panel-body">
              <div id="main" style="height: 400px;"></div>
            <%--<div id="interactive-chart" class="height-sm"></div>--%>
          </div>
        </div>

        <div class="panel panel-inverse" data-sortable-id="index-1">
          <div class="panel-heading">
            <div class="panel-heading-btn">
              <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
              <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
              <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
              <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
            </div>
            <h4 class="panel-title">阀值报警</h4>
          </div>
          <div class="panel-body panel-form" id="valveFit-tpl">

          </div>

        </div>

      </div>


      <!-- end col-8 -->

      <!-- begin col-4 -->
      <div class="col-md-5">

        <div class="panel panel-inverse" data-sortable-id="index-7">
          <div class="panel-heading">
            <div class="panel-heading-btn">
              <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
              <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
              <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
              <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
            </div>
            <h4 class="panel-title">服务器信息</h4>
          </div>
          <div class="panel-body">
            <table class="table table-striped">
              <thead>
              <tr>
                <th>参数名</th>
                <th>参数值</th>
              </tr>
              </thead>
              <tbody id="serverInf-tpl">
                <td colspan="2" class="text-center">没有相关记录</td>
              </tbody>
            </table>
          </div>
        </div>


        <div class="panel panel-inverse" data-sortable-id="index-7">
          <div class="panel-heading">
            <div class="panel-heading-btn">
              <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
              <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
              <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
              <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
            </div>
            <h4 class="panel-title">磁盘信息</h4>
          </div>
          <div class="panel-body">
            <!--diskinfo template -->
              <table class="table table-striped">
                <thead>
                  <tr>
                      <th>盘符</th>
                      <th>类型</th>
                      <th>总大小</th>
                      <th>已使用</th>
                      <th>剩余</th>
                      <th>使用率</th>
                  </tr>
                </thead>
                <tbody id="diskInf-tpl">
                  <tr>
                    <td colspan="6" class="text-center">没有相关记录</td>
                  </tr>
                </tbody>
              </table>
          </div>
        </div>

      </div>
      <!-- end col-4 -->
    </div>
    <!-- end row -->
  </div>
  <!-- end #content -->

  <!-- begin theme-panel -->
  <div class="theme-panel">
    <a href="javascript:;" data-click="theme-panel-expand" class="theme-collapse-btn"><i class="fa fa-cog"></i></a>
    <div class="theme-panel-content">
      <h5 class="m-t-0">Color Theme</h5>
      <ul class="theme-list clearfix">
        <li class="active"><a href="javascript:;" class="bg-green" data-theme="default" data-click="theme-selector" data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Default">&nbsp;</a></li>
        <li><a href="javascript:;" class="bg-red" data-theme="red" data-click="theme-selector" data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Red">&nbsp;</a></li>
        <li><a href="javascript:;" class="bg-blue" data-theme="blue" data-click="theme-selector" data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Blue">&nbsp;</a></li>
        <li><a href="javascript:;" class="bg-purple" data-theme="purple" data-click="theme-selector" data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Purple">&nbsp;</a></li>
        <li><a href="javascript:;" class="bg-orange" data-theme="orange" data-click="theme-selector" data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Orange">&nbsp;</a></li>
        <li><a href="javascript:;" class="bg-black" data-theme="black" data-click="theme-selector" data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Black">&nbsp;</a></li>
      </ul>
      <div class="divider"></div>
      <div class="row m-t-10">
        <div class="col-md-5 control-label double-line">Header Styling</div>
        <div class="col-md-7">
          <select name="header-styling" class="form-control input-sm">
            <option value="1">default</option>
            <option value="2">inverse</option>
          </select>
        </div>
      </div>
      <div class="row m-t-10">
        <div class="col-md-5 control-label">Header</div>
        <div class="col-md-7">
          <select name="header-fixed" class="form-control input-sm">
            <option value="1">fixed</option>
            <option value="2">default</option>
          </select>
        </div>
      </div>
      <div class="row m-t-10">
        <div class="col-md-5 control-label double-line">Sidebar Styling</div>
        <div class="col-md-7">
          <select name="sidebar-styling" class="form-control input-sm">
            <option value="1">default</option>
            <option value="2">grid</option>
          </select>
        </div>
      </div>
      <div class="row m-t-10">
        <div class="col-md-5 control-label">Sidebar</div>
        <div class="col-md-7">
          <select name="sidebar-fixed" class="form-control input-sm">
            <option value="1">fixed</option>
            <option value="2">default</option>
          </select>
        </div>
      </div>
      <div class="row m-t-10">
        <div class="col-md-5 control-label double-line">Sidebar Gradient</div>
        <div class="col-md-7">
          <select name="content-gradient" class="form-control input-sm">
            <option value="1">disabled</option>
            <option value="2">enabled</option>
          </select>
        </div>
      </div>
      <div class="row m-t-10">
        <div class="col-md-5 control-label double-line">Content Styling</div>
        <div class="col-md-7">
          <select name="content-styling" class="form-control input-sm">
            <option value="1">default</option>
            <option value="2">black</option>
          </select>
        </div>
      </div>
      <div class="row m-t-10">
        <div class="col-md-12">
          <a href="#" class="btn btn-inverse btn-block btn-sm" data-click="reset-local-storage"><i class="fa fa-refresh m-r-3"></i> Reset Local Storage</a>
        </div>
      </div>
    </div>
  </div>
  <!-- end theme-panel -->

  <!-- begin scroll to top btn -->
  <a href="javascript:;" class="btn btn-icon btn-circle btn-success btn-scroll-to-top fade" data-click="scroll-top"><i class="fa fa-angle-up"></i></a>
  <!-- end scroll to top btn -->
</div>
<!-- end page container -->

<!-- ================== BEGIN BASE JS ================== -->
<script src="/assets/plugins/jquery/jquery-1.9.1.min.js"></script>
<script src="/assets/plugins/jquery/jquery-migrate-1.1.0.min.js"></script>
<script src="/assets/plugins/jquery-ui/ui/minified/jquery-ui.min.js"></script>
<script src="/assets/plugins/bootstrap/js/bootstrap.min.js"></script>
<!--[if lt IE 9]>
<script src="/assets/crossbrowserjs/html5shiv.js"></script>
<script src="/assets/crossbrowserjs/respond.min.js"></script>
<script src="/assets/crossbrowserjs/excanvas.min.js"></script>
<![endif]-->
<script src="/assets/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script src="/assets/plugins/jquery-cookie/jquery.cookie.js"></script>
<script src="/assets/plugins/echarts/esl/esl.js"></script>
<script src="/assets/plugins/echarts/echarts-all.js"></script>
<script src="/assets/plugins/juicer/juicer-min.js"></script>
<%--<script src="http://res.layui.com/lay/lib/laytpl/laytpl.js"></script>--%>
<!-- ================== END BASE JS ================== -->

<!-- ================== BEGIN PAGE LEVEL JS ================== -->
<script src="/assets/plugins/gritter/js/jquery.gritter.js"></script>
<script src="/assets/plugins/flot/jquery.flot.min.js"></script>
<script src="/assets/plugins/flot/jquery.flot.time.min.js"></script>
<script src="/assets/plugins/flot/jquery.flot.resize.min.js"></script>
<script src="/assets/plugins/flot/jquery.flot.pie.min.js"></script>
<script src="/assets/plugins/sparkline/jquery.sparkline.js"></script>
<script src="/assets/plugins/jquery-jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="/assets/plugins/jquery-jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="/assets/plugins/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
<script src="/assets/js/dashboard.min.js"></script>
<script src="/assets/js/apps.min.js"></script>
<!-- ================== END PAGE LEVEL JS ================== -->
<script src="/assets/modules/template/Tpl.js"></script>
<script src="/assets/plugins/parsley/dist/parsley.js"></script>

<script>

  $(document).ready(function() {
    App.init();
    /**Dashboard.init();*/
  });

  var rootPath = "${pageContext.request.contextPath}";

  function onloadurl(){
    $("[data-url]").each(function () {
      var tb = $(this);
      //tb.html(CommnUtil.loadingImg());
      tb.load(rootPath+tb.attr("data-url"));
    });
  }

</script>
<script type="text/javascript" src="/assets/modules/monitor/serverinfo.js"></script>
<script type="text/javascript" src="/assets/modules/monitor/systemInfo.js"></script>
<script type="text/javascript" src="/assets/modules/monitor/diskInfo.js"></script>
<script type="text/javascript" src="/assets/modules/monitor/valveFit.js"></script>


</body>
</html>
