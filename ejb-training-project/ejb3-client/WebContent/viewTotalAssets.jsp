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
        <h1>View Total Assets Details</h1>
        
        <table border="1">
            <tr>
                <td>Item ID</td>
                <td>Asset Number</td>
                <td>Serial Number</td>
                <td>Description</td>
                <td>Warranty Start Date</td>
                <td>Warranty End Date</td>
                <td>Price</td>
                <td>Remarks</td>
                <td>Status Id</td>
                <td>Invoice Id</td>
                <td>Department Id</td>
                <td>Manufacturer Id</td>
                <td>Category ID</td>
                
            </tr>
             
	        <s:iterator  value="list">  
	        <tr>  
	            <td><s:property value="id"/></td> 
		        <td><s:property value="assetNumber"/></td> 
		        <td><s:property value="serialNumber"/></td>
		        <td><s:property value="description"/></td> 
		        <td><s:property value="warrantyStartDate"/></td> 
		        <td><s:property value="warrantyEndDate"/></td>
		        <td><s:property value="price"/></td> 
		        <td><s:property value="remarks"/></td> 
		        <td><s:property value="status.id"/></td> 
		        <td><s:property value="invoice.id"/></td> 
		        <td><s:property value="department.id"/></td> 
		        <td><s:property value="manufacturerdetails.id"/></td>    
		        <td><s:property value="category.categoryId"/></td> 
	       
	        </tr>  
	        </s:iterator>  
        </table>
    </body>
</html>
