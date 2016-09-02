<%-- 
    Document   : deleteItem
    Created on : Dec 27, 2015, 12:21:17 AM
    Author     : PC
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="/struts-tags" prefix="s"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete User..</title>
</head>
<body>
<h1>Delete User...</h1>
<form action="deleteUser" method="post">

<s:select id="dropdown" label="Select User Name" 
                        headerKey="-1" headerValue="Select User Name"
                        list="userNameList" name="selectedName"/> 
 
	<br>
<s:submit label="submit"></s:submit></form>
</body>
</html>