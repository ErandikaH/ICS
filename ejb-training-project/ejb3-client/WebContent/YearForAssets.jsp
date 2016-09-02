<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="/struts-tags" prefix="s"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Type Year</title>
 <script>
      function loadPage() {
		var x = document.getElementById("year").value;
          
      	  var xhttp = new XMLHttpRequest();
      	  xhttp.onreadystatechange = function() {
      	    if (xhttp.readyState == 4 && xhttp.status == 200) {
      	      document.getElementById("demo").innerHTML = xhttp.responseText;
      	    }
      	  }
      	  xhttp.open("GET", "olderAssets?year="+x, true);
      	  xhttp.send();
      	}
</script> 
</head>
<body>
<s:form action="olderAssets">
	
	
	<s:textfield label="Year:" id="year" name="year" /><br><br>
        <button type="button" onclick="loadPage()">Send data</button></s:form>  
       
        <div id="demo"></div>
</body>
</html>