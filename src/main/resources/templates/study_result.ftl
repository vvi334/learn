<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
  </head>
  <body style="background-image: linear-gradient(to right,#ee9ca7,#a7bfe8);">
  <div>
  <ul class="breadcrumb" style="background-color:white;opacity:0.4;">
    <li><a href="/study/add">增加</a></li>
    <li><a href="/study/search">返回</a></li>
</ul>
<div style="margin-left:150px;width:1000px;background-color:white;opacity:0.4;box-shadow: 10px 10px 5px #888888;">
       <table class="table table-hover">
        <tr>
           <td>教室</td><td>时间</td><td>删除</td><td>修改</td>
        </tr>
         <#list studys as studys>
        <tr>
          <td>${studys.classroom}</td><td>${studys.time}</td>
          <td><a href="/study/delete/${studys.id}">删除</a></td>
          <td><a href="/study/modify/${studys.id}">修改</a></td>
        </tr>
        </#list>
        </table>
       
       </div>
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
  </body>
</html>
