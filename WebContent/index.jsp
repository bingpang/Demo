<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" language="">
		function geoFindMe() {
			  var output = document.getElementById("out");
			  
			  if (!navigator.geolocation){
			    output.innerHTML = "<p>您的浏览器不支持地理位置</p>";
			    return;
			  }
		
			  function success(position) {
			    var latitude  = position.coords.latitude;
			    var longitude = position.coords.longitude;
			    
			    output.innerHTML = '<div >Latitude is ' + latitude + '°  <br> Longitude is ' + longitude + '°</div>';
		
			    var img = new Image();
			    img.src = "http://maps.googleapis.com/maps/api/staticmap?center=" + latitude + "," + longitude + "&zoom=13&size=300x300&sensor=false";
			    output.appendChild(img);
			  };
		
			  function error() {
			    output.innerHTML = "无法获取您的位置";
			  };
		
			  output.innerHTML = "<p>Locating…</p>";
		
			  navigator.geolocation.getCurrentPosition(success, error);
			}
</script>
</head>
<body>
	<p><button onclick="geoFindMe()">Show my location</button></p>
	<div  id = "out"></div>
</body>
</html>