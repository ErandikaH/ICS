<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Missing Assets</title>
    </head>
    <body>
        <h1>View assets missing from user end</h1>
        
        <table border="1">
            <tr>
                <td>User Id</td>
                <td>First Name</td>
                <td>Item Id</td>
                <td>Asset Number</td>
                
            </tr>
            
            <h3>View All Assets:</h3>  
	        <s:iterator  value="details">  
	        <tr>  
	            <td><s:property value="userId"/></td>
	            <td><s:property value="firstName"/></td> 
	            <td><s:property value="itemId"/></td> 
	            <td><s:property value="assetNo"/></td>  
		        
	        </tr>  
	        </s:iterator>  
        </table>
    </body>
</html>
