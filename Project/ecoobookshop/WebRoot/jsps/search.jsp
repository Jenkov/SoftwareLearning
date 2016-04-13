<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>按图名查询</title>
    
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
		margin-top: 6px;
		margin-bottom: 0px;
		color: #404040;
		overflow:hidden;
	}
	input {
		width: 300px;
		left:100px;
		height: 30px;
		border-style:solid;
		margin:0px;
		border-color: #15B69A;
		color:#404040;
		text-indent:1em;
		font-family:"微软雅黑";
		font-size:10px;
	}
	a {
		text-transform:none;
		text-decoration:none;
		border-width: 0px;
	} 
	a:hover {
		text-decoration:underline;
		border-width: 0px;
	}
	span {
		margin: 0px;
	}
</style>
  </head>
  
  <body>
    <form action="<c:url value='/BookServlet'/>" method="get" target="body" id="form1">
    	<input type="hidden" name="method" value="findByBname"/>
    	<input type="text" name="bname"/>
    	<span>
    		<a href="javascript:document.getElementById('form1').submit();"><img align="top" border="0" src="../images/btn.bmp"/></a>
    		<a href="<c:url value='/jsps/gj.jsp'/>" style="font-family:'微软雅黑';font-size:15px; color: #404040;" target="body">高级搜索</a>
    	</span>
    	<hr />
    </form>
    
  </body>
</html>
