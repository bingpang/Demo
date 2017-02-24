<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.demo--label{margin:20px 20px 0 0;display:inline-block}
	.demo--radio{display:none}
	.demo--radioInput{background-color:#fff; border:1px solid rgba(0,0,0,0.15);border-radius:100%;display:inline-block;height:10px;margin-right:10px;margin-top:-1px;vertical-align:middle;width:10px;line-height:1}
	.demo--radio:checked + .demo--radioInput:after{background-color:#57ad68;border-radius:100%;content:"";display:inline-block;height:8px;margin:1px;width:8px}
	.demo--checkbox.demo--radioInput,.demo--radio:checked + .demo--checkbox.demo--radioInput:after{border-radius:0}
</style>
<script type="text/javascript" language="javascript">
	function checkLoad(){
		event.returnValue="确定离开当前页面吗？"
	}

</script>

</head>
<body onbeforeunload="checkLoad()">
	<div>
    <p style="font-size:18px;margin-top:30px;color:rgba(0,0,0,0.44)">约吗?</p>
    <label class="demo--label">
        <input class="demo--radio" type="radio" name="demo-radio">
        <span class="demo--radioInput"></span>约
    </label>
    <label class="demo--label">
        <input class="demo--radio" type="radio" name="demo-radio">
        <span class="demo--radioInput"></span>不约，叔叔我们不约
    </label>
</div>
<div>
    <p style="font-size:18px;margin-top:30px;color:rgba(0,0,0,0.44)">你喜欢的电影明星是？</p>
    <label class="demo--label"><input class="demo--radio" type="checkbox" name="demo-checkbox1">
        <span class="demo--checkbox demo--radioInput"></span>123
    </label>
    <label class="demo--label">
        <input class="demo--radio" type="checkbox" name="demo-checkbox2">
        <span class="demo--checkbox demo--radioInput"></span>456
    </label>
    <label class="demo--label">
        <input class="demo--radio" type="checkbox" name="demo-checkbox3">
        <span class="demo--checkbox demo--radioInput"></span>789
    </label>
</div>


</body>
</html>