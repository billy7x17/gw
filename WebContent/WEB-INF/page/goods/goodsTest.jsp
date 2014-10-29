<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/style/css/goods.css">
</head>
<body>

	<div id='goodsInfo' class='goodsInfoDiv'>
		<div id="goodsPhotos" class="photoDiv">
			<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
			<ul class="photoIndex">
				<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
				<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
				<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
				<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
			</ul>
		</div>
		<div class="infoDiv">
			<h1><span>商品名称</span></h1>
			<span>价值：</span><span>10,000元</span>
			<p title="已完成4.56%">
				<span style="width: 31.008px;display: ;"></span>
			</p>
			<ul>
				<li><em>2</em>已参与人次</li>
				<li><em id="CodeQuantity">59</em>总需人次</li>
				<li><em id="CodeLift">57</em>剩余人次</li>
			</ul>
		</div>
	</div>



</body>
</html>