<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="/struts-tags" prefix="s"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/default/easyui.css">
<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.1.min.js"></script>
<script type="text/javascript" src="http://www.jeasyui.com/easyui/jquery.easyui.min.js"></script>
<script>
(function($){
	
	var combobox = $.fn.combobox.defaults.onChange;
	$.fn.combobox.defaults.onChange = function(newValue, oldValue){
		$(this).closest('form').trigger('change');
		combobox.call(this, newValue, oldValue);
	};
})(jQuery);
</script>

<script>
      function loadPage() {
      	var x = document.getElementById("dropdown").value;
      	var xhttp = new XMLHttpRequest();
    	  xhttp.onreadystatechange = function() {
    	    if (xhttp.readyState == 4 && xhttp.status == 200) {
    	      document.getElementById("demo").innerHTML = xhttp.responseText;
    	    }
    	  }
    	  xhttp.open("GET", "totalAmountQty?selectedCategoryName="+x, true);
    	  xhttp.send();
    	}
</script>
<title>Category Name...</title>
</head>
<body>
<s:form action="totalAmountQty" method="post">
	
		 <s:select id="dropdown" label="Select Category Name" 
	                        headerKey="-1" headerValue="--Select--"
	                        list="categoryNameList" name="selectedCategoryName" /> 
	 
		<br>
		
        <button type="button" onclick="loadPage()">Send data</button></s:form>  
       
        <div id="demo"></div>
</body>
</html>