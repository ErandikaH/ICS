<%-- 
    Document   : viewAssets
    Created on : Dec 27, 2015, 4:14:35 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Assets</title>
    </head>
    <body>
        <h1>View Assets Details</h1>
        
        <table border="1">
            <tr>
                <td>Item ID</td>
                <td>Asset No</td>
                <td>Serial No</td>
                <td>Warranty Start Date</td>
                <td>Warranty End Date</td>
            </tr>
            
            <h3>View All Assets:</h3>  
	        <s:iterator  value="list">  
	        <tr>  
	            <td><s:property value="id"/></td> 
		        <td><s:property value="assetNumber"/></td> 
		        <td><s:property value="serialNumber"/></td>
		        <td><s:property value="warrantyStartDate"/></td> 
		        <td><s:property value="warrantyEndDate"/></td>   
	       
	        </tr>  
	        </s:iterator>  
        </table>
    </body>
</html>
