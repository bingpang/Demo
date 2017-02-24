<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style>
      body {
        margin: 0px;
        padding: 0px;
      }
      #myCanvas {
        border: 1px solid #9C9898;
      }
    </style>
</head>
<body>
	<!--  <canvas id="myCanvas" width="578" height="200"></canvas>-->
	
	<ul class="level-1">
  <li class="item-i">I</li>
  <li class="item-ii">II
    <ul class="level-2">
      <li class="item-a">A</li>
      <li class="item-b">B
        <ul class="level-3">
          <li class="item-1">1</li>
          <li class="item-2">2</li>
          <li class="item-3">3</li>
        </ul>
      </li>
      <li class="item-c">C</li>
    </ul>
  </li>
  <li class="item-iii">III</li>
</ul>
	
	<script>
      var canvas = document.getElementById('myCanvas');
      var context = canvas.getContext('2d');
 
      context.fillRect(0,0,150,75);
      
      context.beginPath();
      context.moveTo(100, 150);
      context.lineTo(450, 50);
      context.lineWidth = 15;
      context.stroke();
    </script>
	
</body>
</html>