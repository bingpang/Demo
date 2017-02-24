<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="jquery-3.0.0.js"></script> 
<script type="text/javascript" src="jquery.cityselect.js"></script> 
</head>
<body>
	<div id="city"> 
        <select class="prov"></select>  
	    <select class="city" disabled="disabled"></select> 
	    <select class="dist" disabled="disabled"></select> 
	    <button onclick="save();">保存</button>
	</div> 
</body>
<script type="text/javascript">
	$("#city").citySelect({  
	    url:"city.min.js",  
	    prov:"北京", //省份 
	    city:"东城区", //城市 
	    dist:"", //区县 
	    nodata:"none" //当子集无数据时，隐藏select 
	});  
	
	/**自定义
	$("#city").citySelect({ 
	    url:{"citylist":[ 
	        {"p":"前端技术","c":[{"n":"HTML"},{"n":"CSS","a":[{"s":"CSS2.0"},{"s":"CSS3.0"}]}, 
	        {"n":"JAVASCIPT"}]}, 
	        {"p":"编程语言","c":[{"n":"C"},{"n":"C++"},{"n":"PHP"},{"n":"JAVA"}]}, 
	        {"p":"数据库","c":[{"n":"Mysql"},{"n":"SqlServer"},{"n":"Oracle"}]}, 
	    ]}, 
	    prov:"", 
	    city:"", 
	    dist:"", 
	    nodata:"none" 
	});
	**/
	
	function save(){
		alert($(".prov").val());
	}
</script>
</html>