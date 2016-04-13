<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>信息板</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	body {
		font-size: 10pt;
		color: #404040;
		font-family:"微软雅黑";
	}
	#main-top{
	position:absolute;top:0px;left:0px;width:100%;
	height:105px;
}
	.divBody {
		margin-left: 18%;
		margin-top: 130px;
	}
	
	.divTitle {
		text-align:left;
		width: 900px;
		height: 25px;
		line-height: 25px;
		background-color: #15B69A;
		border: 5px solid #15B69A;
		color:#fff;
		font-size:20px;
	}
	.divContent {
		width: 900px;
		height: 230px;
		border: 5px solid #15B69A;
		margin-right:20px; 
		margin-bottom:20px;
	}
	.spanTitle {
		margin-top: 10px;
		margin-left:10px;
		height:25px;
		font-weight: 900;
	}
a {color:#15B69A;text-decoration: underline;font-size:16px}
a:visited {color: #15B69A;}
a:hover {color:#FF6600;text-decoration: underline; }
}
</style>

  </head>
  
  <body>
   <div id="main-top">
		<iframe frameborder="0" src="<c:url value='/jsps/top.jsp'/>" name="top"
		style="width:100%;height:100%;"></iframe>
  </div>
  <c:choose>
  	<c:when test="${code eq 'success' }"><%--如果code是功能，它显示对号图片 --%>
  		<c:set var="img" value="/images/duihao.jpg"/>
  		<c:set var="title" value="成&nbsp;&nbsp;&nbsp;&nbsp;功"/>
  	</c:when>
  	<c:when test="${code eq 'error' }"><%--如果code是功能，它显示错号图片 --%>
  		<c:set var="img" value="/images/cuohao.png"/>
  		<c:set var="title" value="失&nbsp;&nbsp;&nbsp;&nbsp;败"/>
  	</c:when>
  	
  </c:choose>
<div class="divBody">
	<div class="divTitle">
		<span class="spanTitle">${title }</span>
	</div>
	<div class="divContent">
	  <div style="margin: 20px;">
		<img style="float: left; margin-right: 30px;" src="<c:url value='${img }'/>" width="150"/>
		<span style="font-size: 30px; color: #c30; font-weight: 500;">${msg }</span>
		<br/>
		<br/>
		<br/>
		<br/>
		<span style="margin-left: 150px;"><a target="_top" href="<c:url value='/jsps/user/login.jsp'/>">登&nbsp;&nbsp;&nbsp;&nbsp;录</a></span>
		<span style="margin-left: 150px;"><a target="_top" href="<c:url value='/index.jsp'/>">主&nbsp;&nbsp;&nbsp;&nbsp;页</a></span>
	  </div>
	</div>
</div>


  </body>
</html>
