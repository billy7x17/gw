<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link charset="utf-8" rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/style/css/mainPage.css">
<%-- <s:form action="logon" namespace="/">
	用户名： <input type="text" name="domain.user_name" />
	密码：      <input type="password" name="domain.password" />
		<input type="submit" />
	</s:form> --%>

<%-- <div id="demo">
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
	</div> --%>

<script language="javascript">
	function flashBoxCtrl(o) {
		this.obj = document.getElementById(o);
		//这个私有方法虽然写了，但暂时没用到
		function addListener(ele, eventName, functionBody) {
			if (ele.attachEvent) {
				ele.attachEvent("on" + eventName, functionBody);
			} else if (ele.addEventListener) {
				ele.addEventListener("on" + eventName, functionBody, false);
			} else {
				return false;
			}
		}
		//初始化
		this.init = function() {
			var objImg = this.obj.getElementsByTagName("img");
			var tagLength = objImg.length;
			if (tagLength > 0) {
				var oUl = document.createElement("ul");
				oUl.setAttribute("id", o + "numTag");
				for ( var i = 0; i < tagLength; i++) {
					var oLi = oUl.appendChild(document.createElement("li"));
					if (i == 0) {
						oLi.setAttribute("class", "hover"); //初始化时把第一个设置为高亮
						oLi.setAttribute("className", "hover");
					}
					//设置标签的数字
					oLi.appendChild(document.createTextNode((i + 1)));
				}
				this.obj.appendChild(oUl);
				objImg[0].style.display = "block";
				//设置标签事件
				var oTag = this.obj.getElementsByTagName("li");
				for ( var i = 0; i < oTag.length; i++) {
					oTag[i].onclick = function() {
						for (j = 0; j < oTag.length; j++) {
							oTag[j].className = "";
							objImg[j].style.display = "none";
						}
						this.className = "hover";
						objImg[this.innerHTML - 1].style.display = "block";
					}
				}
			}
		};
		//自动滚动的方法还没写
		this.imgRoll = function() {
		};
		//生成对象时自动加载init()方法以初始化对象
		this.init();
		
		//最新捡漏滚动
		setInterval('rollUp()',10000);
	}
	
	function rollUp(){
		var list = $('#shopping .shoppingContent ul').children('li');
		var l1 = $(list[0]);
		
		l1.animate({'height':'0px','padding-top':'0px'},500,'linear',function(){l1.remove();});
	}
</script>
<style type="text/css">
<!--
#flashBox {
	width: 265px;
	height: 190px;
	margin: 0 10px 0 10px;
	position: relative;
}

#flashBox img {
	display: none;
	border: none;
}

#flashBox ul {
	position: absolute;
	right: 0px;
	bottom: 20px;
	font: 9px tahoma;
}

* html #flashBox ul {
	position: absolute;
	right: 0px;
	bottom: 30px;
	font: 9px tahoma;
}

*+html #flashBox ul {
	position: absolute;
	right: 0px;
	bottom: 30px;
	font: 9px tahoma;
}

#flashBox ul li {
	display: block;
	float: left;
	width: 12px;
	height: 12px;
	line-height: 12px;
	margin-right: 3px;
	border: 1px solid #999;
	background: #F0F0F0;
	text-align: center;
	cursor: pointer;
}

#flashBox ul li.hover {
	border-color: red;
	background: #FFE1E1;
	color: red;
}

#flashBox {
	width: 1000px;
	height: 300px;
	margin: 30px 0px 0px 10px;
}
-->
</style>
</head>
<body>
	<div id="flashBox">
		<img src="<%=request.getContextPath()%>/style/images/scroll/1.jpg"
			_fcksavedurl="<%=request.getContextPath()%>/style/images/scroll/1.jpg" />
		<img src="<%=request.getContextPath()%>/style/images/scroll/2.jpg"
			_fcksavedurl="<%=request.getContextPath()%>/style/images/scroll/2.jpg" />
		<img src="<%=request.getContextPath()%>/style/images/scroll/3.jpg"
			_fcksavedurl="<%=request.getContextPath()%>/style/images/scroll/3.jpg" />
		<img src="<%=request.getContextPath()%>/style/images/scroll/4.jpg"
			_fcksavedurl="<%=request.getContextPath()%>/style/images/scroll/4.jpg" />
		<img src="<%=request.getContextPath()%>/style/images/scroll/5.jpg"
			_fcksavedurl="<%=request.getContextPath()%>/style/images/scroll/5.jpg" />
	</div>

	<div id="shopping" style="float: right;width: 15%;height: 260px;border: 1px #000000;margin-left: 20px;overflow: hidden;">
		<div class="head"><span>正在捡漏</span></div>
		<div class="shoppingContent">
			<ul>
				<li>
					<a href="<%=request.getContextPath()%>/goods/show.shtml">
						<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
						<span>商品名称</span>
						<br>
						<span>捡漏人</span>
					</a>
				</li>
				<li>
					<a href="<%=request.getContextPath()%>/goods/show.shtml">
						<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
						<span>商品名称</span>
						<br>
						<span>捡漏人</span>
					</a>
				</li>
				<li>
					<a href="<%=request.getContextPath()%>/goods/show.shtml">
						<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
						<span>商品名称</span>
						<br>
						<span>捡漏人</span>
					</a>
				</li>
				<li>
					<a href="<%=request.getContextPath()%>/goods/show.shtml">
						<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
						<span>商品名称</span>
						<br>
						<span>捡漏人</span>
					</a>
				</li>
				<li>
					<a href="<%=request.getContextPath()%>/goods/show.shtml">
						<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
						<span>商品名称</span>
						<br>
						<span>捡漏人</span>
					</a>
				</li>
				<li>
					<a href="<%=request.getContextPath()%>/goods/show.shtml">
						<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
						<span>商品名称</span>
						<br>
						<span>捡漏人</span>
					</a>
				</li>
				<li>
					<a href="<%=request.getContextPath()%>/goods/show.shtml">
						<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
						<span>商品名称</span>
						<br>
						<span>捡漏人</span>
					</a>
				</li>
				<li>
					<a href="<%=request.getContextPath()%>/goods/show.shtml">
						<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
						<span>商品名称</span>
						<br>
						<span>捡漏人</span>
					</a>
				</li>
				<li>
					<a href="<%=request.getContextPath()%>/goods/show.shtml">
						<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
						<span>商品名称</span>
						<br>
						<span>捡漏人</span>
					</a>
				</li>
			</ul>
		</div>		
	</div>

	<div id="today" style="width: 80%;">
		<div class="head"><span>今日捡漏</span></div>
		<div class="more"><a href="#">更多&gt;&gt;</a></div>
		<div class="content">
			<a href="<%=request.getContextPath()%>/goods/show.shtml">
				<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
				<span>xxxx</span>
			</a>
			<a href="<%=request.getContextPath()%>/goods/show.shtml">
				<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/2.jpg">
				<span>xxxx</span>
			</a>
			<a href="<%=request.getContextPath()%>/goods/show.shtml">
				<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/3.jpg">
				<span>xxxx</span>
			</a>
		</div>
	</div>
	
	<div id="shoppingFirst" style="float: right;width: 15%;height: 260px;border: 1px #000000;margin-left: 20px;overflow: hidden;">
		<div class="head"><span>捡漏排行榜</span></div>
		<div class="shoppingContent">
			<ul>
				<li>
					<a href="#">
						<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
						<span>艾书尧</span>
						<br>
						<span>捡漏记录：100</span>
					</a>
				</li>
				<li>
					<a href="#">
						<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
						<span>艾书尧</span>
						<br>
						<span>捡漏记录：100</span>
					</a>
				</li>
				<li>
					<a href="#">
						<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
						<span>艾书尧</span>
						<br>
						<span>捡漏记录：100</span>
					</a>
				</li>
				<li>
					<a href="#">
						<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
						<span>艾书尧</span>
						<br>
						<span>捡漏记录：100</span>
					</a>
				</li>
			</ul>
		</div>		
	</div>	
	
	<div id="past" style="width: 80%;">
		<div class="head"><span>往期漏宝</span></div>
		<div class="more"><a href="#">更多&gt;&gt;</a></div>
		<div class="content">
			<a href="<%=request.getContextPath()%>/goods/show.shtml">
				<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/1.jpg">
				<span>xxxx</span>
			</a>
			<a href="<%=request.getContextPath()%>/goods/show.shtml">
				<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/2.jpg">
				<span>xxxx</span>
			</a>
			<a href="<%=request.getContextPath()%>/goods/show.shtml">
				<img alt="1" src="<%=request.getContextPath()%>/style/images/scroll/3.jpg">
				<span>xxxx</span>
			</a>
		</div>
	</div>

	<script type="text/javascript">
		new flashBoxCtrl("flashBox");
	</script>

</body>
</html>