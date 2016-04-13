<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/jsps/css/user/login.css'/>">
	<script type="text/javascript" src="<c:url value='/jquery/jquery-1.5.1.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/jsps/js/user/login.js'/>"></script>
	<script src="<c:url value='/js/common.js'/>"></script>
<style>
body {background-color: f5f5f5; width:100%;}
.main{text-align:center;margin-left:33%; margin-top: 130px;
	font-family:"微软雅黑";
}
#main-top{
	position:absolute;top:0px;left:0px;width:100%;
	height:105px;
}
.login1{width: 440px; height: 370px; border: 1px solid #d1d1cf;background-color: #f4f4f4;}
.login2{width:436px; height:366px; margin: 2px; background-color: #ffffff;}
.loginTopDiv {padding: 30px;}
.loginTop {color: #696969; font-size: 30px; font-weight: 500;}

table {margin-left: 30px;font-size: 10pt;color: #404040;}
.input {width: 235px;height: 26px;border: 1px solid #d9d9d9;padding-top: 4px;padding-left: 8px;}
.yzm {width: 90px;height: 26px;border: 1px solid #d9d9d9;vertical-align: middle; margin-right: 30px;padding-top: 4px;padding-left: 8px;}
label.error {color:#cc3300;font-weight: 900;}
#vCode {margin-right: 30px; vertical-align: middle;width: 70px;height: 26px;border: 1px solid #000;}
.loginBtn {
	border: 0px; width: 100px; height: 30px; background-color:#15B69A;color:#fff;	
	
	font-size:16px;
	font-family:"微软雅黑";
	float:right;
}
.loginBtn:hover{
	cursor:pointer;
}
.registBtn {
	display: inline-block;
	height: 24px;
	width: 100px;
	margin-top:5px;
	margin-left:10px;	
	color:#15B69A;
}
table input[type=password]{
	margin-left:10px;
	width:300px;
	height:35px;
	line-height:5px;
	color:#404040;
}
#loginname{
margin-left:10px;
	width:300px;
	height:35px;
	line-height:5px;
	color:#404040;
	font-family:"微软雅黑";
}
#verifyCode{
margin-left:10px;
	width:100px;
	height:35px;
	color:#404040;
}
</style>
<script type="text/javascript">
	$(function() {/*Map<String(Cookie名称),Cookie(Cookie本身)>*/
		// 获取cookie中的用户名
		var loginname = window.decodeURI("${cookie.loginname.value}");
		if("${requestScope.user.loginname}") {
			loginname = "${requestScope.user.loginname}";
		}
		$("#loginname").val(loginname);
	});
</script>
  </head>
  
  <body>
  <div id="main-top">
		<iframe frameborder="0" src="<c:url value='/jsps/top.jsp'/>" name="top"
		style="width:100%;height:100%;"></iframe>
  </div>
	<div class="main">
	  
	  <div>
        <div class="login1">
	      <div class="login2">
            <div class="loginTopDiv">
              <span class="loginTop">登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录</span>
              
            </div>
            <div >
              <form target="_top" action="<c:url value='/UserServlet'/>" method="post" id="loginForm">
                <input type="hidden" name="method" value="login" />
                  <table style="font-size:15px;">
                    <tr>
                      <td width="50"></td>
                      <td><label class="error" id="msg">${msg }</label></td>
                    </tr>
                    <tr>
                      <td width="50">用户名</td>
                      <td><input class="input" type="text" name="loginname" id="loginname"/></td>
                    </tr>
                    <tr>
                      <td height="20">&nbsp;</td>
                      <td><label id="loginnameError" class="error"></label></td>
                    </tr>
                    <tr>
                      <td>密　码</td>
                      <td><input class="input" type="password" name="loginpass" id="loginpass" value="${user.loginpass }"/></td>
                    </tr>
                    <tr>
                      <td height="20">&nbsp;</td>
                      <td><label id="loginpassError" class="error"></label></td>
                    </tr>
                    <tr>
                      <td>验证码</td>
                      <td>
                        <input class="input yzm" type="text" name="verifyCode" id="verifyCode" value="${user.verifyCode }"/>
                        <img id="vCode" src="<c:url value='/VerifyCodeServlet'/>"/>
                        <a id="verifyCode" href="javascript:_change()">换张图</a>
                      </td>
                    </tr>
                    <tr>
                      <td height="20px">&nbsp;</td>
                      <td><label id="verifyCodeError" class="error"></label></td>
                    </tr>
                    <tr>
                      <td><a href="<c:url value='/jsps/user/regist.jsp'/>" class="rigistBtn">立即注册</a></td>
                      <td align="right">
                        
                       	
                			<input type="submit" id="submit" value="登&nbsp;&nbsp;录"  class="loginBtn"/>
              			
                      </td>
                    </tr>																				
                 </table>
              </form>
            </div>
          </div>
        </div>
      </div>
	</div>
	<script>
	$(function(){
		$(".loginBtn").bind("mouseover",function(){
			$(this).css("cursor","pointer");
		});
		
	});
	
	</script>
  </body>
</html>
	