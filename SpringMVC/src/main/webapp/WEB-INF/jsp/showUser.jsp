<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <meta name="description" content="test">
    <meta name="author" content="zwj">
<link rel="icon" href="../favicon.ico">
  <link href="../css/starter-template.css" rel="stylesheet">
<title>Bootstrap</title>
</head>
<link href="../css/bootstrap-theme.min.css" rel="stylesheet">
<link rel="stylesheet" href="../css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
 <div class="container">
 <div class="navbar-header">
 <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
 <span class="sr-only">Toggle navigation</span>
 <span class="icon-bar"></span>
<span class="icon-bar"></span>
<span class="icon-bar"></span>
 </button>
 <a href="#" class="navbar-brand">Project me</a>
 </div>
 <div id="navbar" class="collapse navbar-collapse">
 <ul class="nav navbar-nav">
 <li class="active"><a href="#">${user.yc_flowno}</a></li>
 <li><a href="#about">${user.yc_crytype}</a></li>
 <li><a href="#contact">${user.yc_createddate}</a></li>
 </ul>
 </div>
 </div>
</nav>
<div class="container">
<div class="starter-template">
        <h1>Bootstrap starter template</h1>
                <p class="lead">Use this document as a way to quickly start any new project.<br> All you get is this text and a mostly barebones HTML document.</p>
        
</div>
</div>

<script src="${pageContext.request.contextPath}/jquery/jquery-3.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="../js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
