<%-- 
    Document   : viewAssets
    Created on : Dec 27, 2015, 4:14:35 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Vendor Rates</title>
<script>
      function loadPage() {
      	var x = document.getElementById("vendorId").value;
          
      	  var xhttp = new XMLHttpRequest();
      	  xhttp.onreadystatechange = function() {
      	    if (xhttp.readyState == 4 && xhttp.status == 200) {
      	      document.getElementById("demo").innerHTML = xhttp.responseText;
      	    }
      	  }
      	  xhttp.open("GET", "vendorRateType?vendorId="+x, true);
      	  xhttp.send();
      	}
</script> 
</head>
<body>

	<s:textfield label="vendorId" id="vendorId" name="vendorId"></s:textfield>
	<button type="button" onclick="loadPage()">Send data</button>
	<div id="demo">
	<table border="1">
            <tr>
                <td>Vendor Rate Type ID</td>
                <td>Date</td>
                <td>Vendor ID</td>
                <td>Rate Type ID</td>
                <td>Rate Level ID</td>
                <td>Remarks</td>
            </tr>
            
            <h3>View All Assets:</h3>  
	        <s:iterator  value="list">  
	        <tr>  
	            <td><s:property value="id"/></td> 
		        <td><s:property value="date"/></td> 
		        <td><s:property value="vendor.id"/></td>
		        <td><s:property value="rateType.id"/></td> 
		        <td><s:property value="rateLevel.id"/></td>
		        <td><s:property value="remarks"/></td>    
	       
	        </tr>  
	        </s:iterator>  
        </table></div>

</body>
</html>