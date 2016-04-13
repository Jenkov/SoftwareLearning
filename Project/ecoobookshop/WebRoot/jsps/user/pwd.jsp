<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>pwd.jsp</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/css/css.css'/>">
	<link rel="stylesheet" type="text/css" href="<c:url value='/jsps/css/user/pwd.css'/>">
	<script type="text/javascript" src="<c:url value='/jquery/jquery-1.5.1.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/jsps/js/user/pwd.js'/>"></script>
	<script src="<c:url value='/js/common.js'/>"></script>
	<style>
	body {
	font-size: 10pt;
	color: #404040;
	font-family: "微软雅黑";
}


.div1 {
	width: 500px;
	margin-left: 10px;
	margin-top: 20px;
	margin-bottom: 0px;
	font-size: 12px;
	border: 1px solid #15B69A;
	background-color: #fff;;
	border-radius:0px 0px 50px 0px;
	-webkit-border-radius:0px 0px 50px 0px;
	-moz-border-radius:0px 0px 50px 0px;
	font-size:16px;
	font-family:"微软雅黑";
}

table {
	font-size: 10pt;
	color: #404040;
	font-family: Arial;
	margin-left: 20px;
	margin-top: 20px;
}
table td{
	height:40px;
}
input[type=password]{
	width:250px;
}
input[type=text]{
	width:150px;
}
.input {
	border: 1px solid #DADADA;
	height: 30px;
	margin-left: 15px;
	padding-left:10px;
}

.bc {
	width: 80px;
	height: 20px;
	margin-left: 15px;
}

#vCode {
	margin-left: 15px;
}

#verifyCode {
	width: 150px;
}

label.error {
	color: #cc3300;
}
#submit{
	border: 0px; width: 100px; height: 30px; background-color:#15B69A;color:#fff;	
	font-size:16px;
	font-family:"微软雅黑";
	cursor:pointer;
}
	</style>
  </head>
  
  <body>

	<div class="div1">
		<form action="<c:url value='/UserServlet'/>" method="post" target="_top">
			<input type="hidden" name="method" value="updatePassword"/>
		<table>
			<tr>
				<td><label class="error">${msg }</label></td>
				<td colspan="2">&nbsp;</td>
			</tr>
			<tr>
				<td align="right">原密码:</td>
				<td><input class="input" type="password" name="loginpass" id="loginpass" value="${user.loginpass }"/></td>
				<td><label id="loginpassError" class="error"></label></td>
			</tr>
			<tr>
				<td align="right">新密码:</td>
				<td><input class="input" type="password" name="newpass" id="newpass" value="${user.newpass }""/></td>
				<td><label id="newpassError" class="error"></label></td>
			</tr>
			<tr>
				<td align="right">确认密码:</td>
				<td><input class="input" type="password" name="reloginpass" id="reloginpass" value="${user.reloginpass }""/></td>
				<td><label id="reloginpassError" class="error"></label></td>
			</tr>
			<tr>
				<td align="right"></td>
				<td>
				  <img id="vCode" src="<c:url value='/VerifyCodeServlet'/>" border="1"/>
		    	  <a href="javascript:_change();">看不清，换一张</a>
				</td>
			</tr>
			<tr>
				<td align="right">验证码:</td>
				<td>
				  <input class="input" type="text" name="verifyCode" id="verifyCode" value="${user.verifyCode }""/>
				</td>
				<td><label id="verifyCodeError" class="error"></label></td>
			</tr>
			<tr>
				<td align="right"></td>
				<td><input id="submit" type="submit" value="修改密码" style="float:right;"/></td>
			</tr>
		</table>
		</form>
	</div>
  </body>
</html>
