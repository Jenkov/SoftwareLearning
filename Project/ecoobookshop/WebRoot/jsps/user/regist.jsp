<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>注册页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/jsps/css/user/regist.css'/>">

	<script type="text/javascript" src="<c:url value='/jquery/jquery-1.5.1.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/jsps/js/user/regist.js'/>"></script>

<style>
#reg-top{
	position:absolute;top:0px;left:0px;width:100%;
	height:105px;
}
#divMain {margin-left: 240px;margin-top: 130px;}
#divTitle {line-height: 30px; width: 880px; height: 30px; border: 1px solid #d0d0d0; background: url(/ecoobookshop/images/bg_btns.png) repeat-x 0px -132px;}
#spanTitle {margin-left: 18px; font-weight: 500;
	font-family:"微软雅黑";
	font-size:20px;
	color:#404040;
}
#divBody {width: 880px; height: 400px; border-left: 1px solid #d0d0d0;border-bottom: 1px solid #d0d0d0;border-right: 1px solid #d0d0d0;
	font-family:"微软雅黑";
	font-size:16px;
	color:#404040;
}
.tdText {width: 280px; text-align: right;}
.tdInput{width: 280px; text-align: right;}
.tdError {width: 300px;}
#tableForm {line-height: 50px;}
.inputClass {width: 240px; height: 30px; border: 1px solid #7f9db9; line-height: 30px; padding-left: 10px;}
#imgVerifyCode {width: 100%;height:100%;}
#divVerifyCode {text-align: center; border: 1px solid #e2e2e2;width: 100px;
	height:30px;margin-left:40px;
	float:left;
	margin-top:5px;
}
.errorClass {background: url(/ecoobookshop/images/error.png) no-repeat; color: #f40000; font-size: 10pt; border:1px solid #ffb8b8; background-color: #fef2f2; padding: 8px 8px 8px 35px;}

#submitBtn{
	border: 0px; width: 100px; height: 30px; background-color:#15B69A;color:#fff;	
	cursor:pointer;
	font-size:16px;
	font-family:"微软雅黑";
	float:right;
}
</style>
  </head>
  
  <body>
  <div id="reg-top">
		<iframe frameborder="0" src="<c:url value='/jsps/top.jsp'/>" name="top"
		style="width:100%;height:100%;"></iframe>
  </div>
<div id="divMain">
  <div id="divTitle">
    <span id="spanTitle">新用户注册</span>
  </div>
  <div id="divBody">
<form action="<c:url value='/UserServlet'/>" method="post" id="registForm">
	<input type="hidden" name="method" value="regist"/>  
    <table id="tableForm">
      <tr>
        <td class="tdText">用户名：</td>
        <td class="tdInput">
          <input class="inputClass" type="text" name="loginname" id="loginname" value="${form.loginname }"/>
        </td>
        <td class="tdError">
          <label class="errorClass" id="loginnameError">${errors.loginname }</label>
        </td>
      </tr>
      <tr>
        <td class="tdText">登录密码：</td>
        <td class="tdInput">
          <input class="inputClass" type="password" name="loginpass" id="loginpass" value="${form.loginpass }"/>
        </td>
        <td>
          <label class="errorClass" id="loginpassError">${errors.loginpass }</label>
        </td>
      </tr>
      <tr>
        <td class="tdText">确认密码：</td>
        <td class="tdInput">
          <input class="inputClass" type="password" name="reloginpass" id="reloginpass" value="${form.reloginpass }"/>
        </td>
        <td>
          <label class="errorClass" id="reloginpassError">${errors.reloginpass}</label>
        </td>
      </tr>
      <tr>
        <td class="tdText">Email：</td>
        <td class="tdInput">
          <input class="inputClass" type="text" name="email" id="email" value="${form.email }"/>
        </td>
        <td>
          <label class="errorClass" id="emailError">${errors.email}</label>
        </td>
      </tr>
      <tr>
        <td class="tdText">验证码：</td>
        <td class="tdInput">
          <input class="inputClass" type="text" name="verifyCode" id="verifyCode" value="${form.verifyCode }"/>
        </td>
        <td>
          <label class="errorClass" id="verifyCodeError">${errors.verifyCode}</label>
        </td>
      </tr>
      <tr>
        <td></td>
        <td>
          <div id="divVerifyCode"><img id="imgVerifyCode" src="<c:url value='/VerifyCodeServlet'/>"/>
          	
          </div>
        	<a href="javascript:_hyz()" style="float:right;">换一张</a>
        </td>
      </tr>
      <tr>
        <td></td>
        <td>
          <input type="submit"  id="submitBtn" value="注&nbsp;&nbsp;册"/>
        </td>
        <td>
          <label></label>
        </td>
      </tr>
    </table>
</form>    
  </div>
</div>
  </body>
</html>
