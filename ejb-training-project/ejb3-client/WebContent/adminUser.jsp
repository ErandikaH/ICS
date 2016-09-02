<%-- 
    Document   : adminUser
    Created on : Dec 24, 2015, 1:35:07 PM
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
	        <a href="addItem.jsp">Add new item to the system</a><br />
	        <a href="getItemId">Search details about items</a><br />
	        <a href="getItemId">Update details of the items that already exist in the system</a><br />
	        <a href="getItemIdForPrice">Update price of an item when new parts added to an existing item</a><br />
	        <a href="getItemIdForRemark">Update remarks field after a repair of an asset.</a><br />      
	        <a href="getItemIdForDelete">Delete mistakenly added records about items</a><br />
	        <a href="allAssets">View reports about total assets</a><br />
	        <a href="YearForAssets.jsp">View assets that are older than given years</a><br />
	        <a href="employee.jsp">Rate Vendors</a><br />
	        <a href="missingItemsFromUser">View assets missing from user end</a><br />
	        
	        <a href="addUser.jsp">add details about users</a><br />
	        <a href="getName">update details about users</a><br />
	        <a href="getNameForDeleteUser">Delete details about users</a><br />
	        <a href="getName">Search details about users</a><br />
	        <a href="getName">Search details about users</a><br />
	        <a href="vendorRateType"> vendor rate details</a><br>
	         <a href="vendorRateType3"> vendor rate details2</a><br>
	        <a href="item">Item Details</a><br>
	        <a href="category">Category details</a>
        
  
    </body>
</html>
