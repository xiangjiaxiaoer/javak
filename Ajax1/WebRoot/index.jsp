<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript"  src="js/createXHR.js"></script>
	<script type="text/javascript"  src="js/check.js"></script>
	<script type="text/javascript"  src="js/test.js"></script>
  </head>
  
  <body>
    <form name="form1">
           用户名：<input type="text" name="username"><br>
           密&nbsp;&nbsp;码:<input type="password" name="pwd"><br>
   <input type="button" value="登录" onclick="checkLogin()">
   <span id="msg" style="color:red"></span><br>
 
      用户名：<input type="text" name="username1" onblur="checkTest()"><br>   
   <span id="msg2" ></span> 
  </form>
  </body>
</html>
