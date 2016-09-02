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
                <td>Price</td>
                <td>Count</td>
                <td>Category Name</td>
                
            </tr>
            
            <h3>View All Assets:</h3>  
	        <s:iterator  value="list">  
	        <tr>  
	            <td><s:property value="price"/></td> 
		        <td><s:property value="count"/></td> 
		        <td><s:property value="name"/></td>
		        
	        </tr>  
	        </s:iterator>  
        </table>
    </body>
</html>
