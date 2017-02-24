<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
  
<!DOCTYPE html>
<html>
<head lang="en">

<link rel=”apple-touch-startup-image” href="gogo1.jpg" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">
<!-- <meta http-equiv="Expires" CONTENT="-1">
<meta http-equiv="Cache-Control" CONTENT="no-cache">
<meta http-equiv="Pragma" CONTENT="no-cache"> -->
<script type="text/javascript"  src="TouchSlide.1.1.js"></script>
<title></title>
<style type="text/css">

	*{
    margin: 0;
    padding: 0;
}
html {
    /* 防止横屏时的文字缩放 */
    -webkit-text-size-adjust: 100%;
}
body{
    min-width: 320px;
    max-width: 640px;
    margin: 0 auto;
    line-height: 1;
    font-size: 12px;
    font-family: "Microsoft YaHei",Arial,Helvetica,sans-serif;
}
/*去掉有的安卓下点击出现边框*/
*{
    -webkit-tap-highlight-color: rgba(0, 0, 0, 0);
}
	

	.slideBox{
		width: 100%;
		height: 100%;
		position: relative;
	}
	.slideBox ul{
		text-decoration: none;
		list-style: none;
	}
.slideBox .bd {
	position: relative;
	z-index: 0;
}

.slideBox .bd li {
	position: relative;
	text-align: center;
	width: 33%;
	float: left;
}

.slideBox .bd li img {
	background: url(images/loading.gif) center center no-repeat;
	vertical-align: top;
	width: 100%;
	border-radius:50%;
	height: 100%;
	width: 100%;
	/*图片宽度100%，达到自适应效果*/
}
</style>
</head>
<body scroll="no" >
<div style="margin-bottom: 49px; ">
	<div id="slideBox" class="slideBox" style="margin-bottom: 0px;">
		<div id="bd" class="bd">
		 <ul>
					<li class="pic_li">
							<a class="pic" href=""><img
								src="gogo1.jpg" /></a>
					</li>
					<li class="pic_li"> 
							<a class="pic"
								href=""> <img
								src="gogo1.jpg" /></a>
						</li>
				
					<li class="pic_li">
							<a class="pic" href=""><img
								src="gogo1.jpg" /></a>
						 </li>
				</ul>
				<ul>
					<li class="pic_li"> 
							<a class="pic"
								href=""><img
								src="gogo1.jpg" /></a>
					</li>
					<li class="pic_li"> 
							<a class="pic"
								href=""><img
								src="gogo1.jpg" /></a>
					</li>
					<li class="pic_li"> 
							<a class="pic"
								href=""><img
								src="gogo1.jpg" /></a>
					</li>
			</ul> 
			<ul>
					<li class="pic_li"> 
							<a class="pic"
								href=""><img
								src="gogo1.jpg" /></a>
					</li>
					<li class="pic_li"> 
							<a class="pic"
								href=""><img
								src="gogo1.jpg" /></a>
					</li>
					<li class="pic_li"> 
							<a class="pic"
								href=""><img
								src="gogo1.jpg" /></a>
					</li>
			</ul> 
			
		</div>
		<div class="hd" style="display: none">
						<span class="next"></span>
						<ul></ul>
						<span class="prev"></span>
						<h3>多图滑动</h3>
				</div>
	</div>
</div>
<script type="text/javascript">
	TouchSlide({ 
		slideCell:"#slideBox",
		titCell:".hd ul", //开启自动分页 autoPage:true ，此时设置 titCell 为导航元素包裹层
		autoPage:true, //自动分页
		pnLoop:"true", // 前后按钮不循环
		switchLoad:"_src" //切换加载，真实图片路径为"_src" 
	});
	
</script>

</body>
</html>
