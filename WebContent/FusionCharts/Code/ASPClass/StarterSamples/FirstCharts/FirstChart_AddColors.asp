<%@LANGUAGE="VBSCRIPT"%>
<%
  ' Include FusionCharts ASP Class
%>  
<!--#include file="../Class/FusionCharts_Gen.asp"-->
<%
  
  dim FC
  ' Create FusionCharts ASP class object
  set FC = new FusionCharts
  ' Set chart type to Column3D
  Call FC.setChartType("column3D")
  ' Set chart size 
  Call FC.setSize("300","250")
    
  ' set the relative path of the swf file
  Call FC.setSWFPath("../FusionCharts/")

  dim strParam
  ' Define chart attributes
  strParam="caption=Weekly Sales;xAxisName=Week;yAxisName=Revenue;numberPrefix=$"
  
  ' Set chart attributes
  Call FC.setChartParams(strParam)
  
  ' Add Color set
  Call FC.addColors("FF0000;00FF00;0000FF;FFFF00")
  
  ' Add chart values and category names
  Call FC.addChartData("40800","label=Week 1","")
  Call FC.addChartData("31400","label=Week 2","")
  Call FC.addChartData("26700","label=Week 3","")
  Call FC.addChartData("54400","label=Week 4","")

%>
<html>
  <head>
    <title>First Chart - Add Colors : Using FusionCharts ASP Class</title>
    <script language='javascript' src='../FusionCharts/FusionCharts.js'></script>
  </head>
  <body>

  <%
    ' Render Chart with JS Embedded Method
    Call FC.renderChart(false)
  %>

  </body>
</html>

