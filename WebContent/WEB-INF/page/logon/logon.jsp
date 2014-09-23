<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link charset="utf-8" rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/style/css/mainPage.css">
</head>
<body>
	<%-- <s:form action="logon" namespace="/">
	用户名： <input type="text" name="domain.user_name" />
	密码：      <input type="password" name="domain.password" />
		<input type="submit" />
	</s:form> --%>

	<div id="demo">
		<div id="indemo">
			<div id="demo1">
				<a href="#"><img alt="1"
					src="<%=request.getContextPath()%>/style/images/scroll/1.jpg"></a>
				<a href="#"><img alt="2"
					src="<%=request.getContextPath()%>/style/images/scroll/2.jpg"></a>
				<a href="#"><img alt="3"
					src="<%=request.getContextPath()%>/style/images/scroll/3.jpg"></a>
				<a href="#"><img alt="4"
					src="<%=request.getContextPath()%>/style/images/scroll/4.jpg"></a>
				<a href="#"><img alt="5"
					src="<%=request.getContextPath()%>/style/images/scroll/5.jpg"></a>
			</div>
			<div id="demo2"></div>
		</div>
	</div>
	
	
	<script type="text/javascript">
		var speed = 10;
		var tab = document.getElementById("demo");
		var tab1 = document.getElementById("demo1");
		var tab2 = document.getElementById("demo2");
		tab2.innerHTML = tab1.innerHTML;
		function Marquee() {
			if (tab2.offsetWidth - tab.scrollLeft <= 0)
				tab.scrollLeft -= tab1.offsetWidth
			else {
				tab.scrollLeft++;
			}
		}
		var MyMar = setInterval(Marquee, speed);
		tab.onmouseover = function() {
			clearInterval(MyMar)
		};
		tab.onmouseout = function() {
			MyMar = setInterval(Marquee, speed)
		};
	</script>
</body>