<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Amount of Assets</title>
    </head>
    <body>
        <h1>All Amount of Assets</h1>
        
        <table border="1">
            <tr>
                <td>Amount</td>
            
            </tr>
            
           
	        <s:iterator  value="list">  
	        <tr>  
	            <td><s:property value="amount"/></td> 
		      
		        
	        </tr>  
	        </s:iterator>  
        </table>
    </body>
</html>
