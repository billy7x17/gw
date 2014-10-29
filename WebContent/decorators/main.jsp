<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- javaScript嵌入 -->
<!-- css嵌入 -->
<title>艾格捡漏网</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/public/jquery-1.11.0.min.js"></script>
<link charset="utf-8" rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/style/css/main.css">

<decorator:head />
<%
	response.setContentType("application/String; charset=utf-8");
	response.setHeader("pragma", "no-cache");
	response.setHeader("cache-control", "no-cache");
%>
</head>

<body onselectstart="return false">
	<div id="headInfoDiv">
		<ul>
			<li>您好，欢迎来捡漏</li>
			<li><a href="logon();">[登陆]</a></li>
			<li><a href="register();">[注册]</a></li>
		</ul>
	</div>
	<div id="tabs">
		<ul style="margin-left: 100px;">
			<li class="tab" onclick="location.href='<%=request.getContextPath()%>'"><span>首页</span></li>
			<li class="tab"><span>最新捡漏</span></li>
			<li class="tab"><span>往期漏宝</span></li>
			<li class="tab"><span>捡漏城</span></li>
			<li class="tab"><span>捡漏论坛</span></li>
		</ul>
	</div>
	<div class="mainDiv">
		<decorator:body />
	</div>
</body>
</html>