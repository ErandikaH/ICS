<%-- 
    Document   : generalManager
    Created on : Dec 24, 2015, 1:34:26 PM
    Author     : PC
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
       
        <title>Welcome to Cambio Inventory Control System Page!! </title>
    
    </head>
    <body>
    <h1>Welcome to Cambio Inventory Control System Page!! </h1><br>
        You have logged in as a <s:iterator value="roleName"/>
         <s:iterator  value="list">  
	        
	            <s:property value="roleName"/>
		        
	        </s:iterator>
	        
	        <h2>Now you can access these list.. </h2>
        
        <a href="totalAmount">Total Amount of All Assets </a><br />
        <a href="categoryName">Total Amount and Quantity each Asset.. </a><br />
  
    </body>
</html>
