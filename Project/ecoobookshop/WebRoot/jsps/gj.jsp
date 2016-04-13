<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>组合查询</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	table {
		position:absolute;
		top:5px;
		left:5px;
		color: #404040;
	}
	table td{
		height:30px;
		line-height:30px;
		font-family:"微软雅黑";
		font-size:15px;
		
	}
	table input[type=text]{
		height:30px;
		width:350px;
		color:#404040;
		text-indent:1em;
		font-family:"微软雅黑";
		font-size:10px;
	}
	input[type=submit]{
		float:right;
		height:30px;
		width:100px;
		color:#fff;
		background-color:#15B69A;
		border:1px solid #15B69A;
		font-family:"微软雅黑";
		font-size:15px;
		cursor:pointer;
	}
	input[type=reset]{
		height:30px;
		width:100px;
		color:#404040;
		background-color:#fff;
		border:1px solid #999;
		font-family:"微软雅黑";
		font-size:15px;
		cursor:pointer;
	}
</style>
  </head>
  
  <body>
  <form action="<c:url value='/BookServlet'/>" method="get">
  	<input type="hidden" name="method" value="findByCombination"/>
<table align="center" CELLSPACING="10">
	<tr>
		<td>书名：</td>
		<td><input type="text" name="bname"/></td>
	</tr>
	<tr>
		<td>作者：</td>
		<td><input type="text" name="author"/></td>
	</tr>
	<tr>
		<td>出版社：</td>
		<td><input type="text" name="press"/></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>
			<input type="submit" value="搜　　索"/>
			<input type="reset" value="重新填写"/>
		</td>
	</tr>
</table>
	</form>
  </body>
</html>
