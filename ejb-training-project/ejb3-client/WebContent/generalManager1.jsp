<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	
	<title>Cambio Inventory Control System</title>
	
	<link rel="stylesheet" href="css/style.css" type="text/css" media="screen, projection"/>
	<!--[if lte IE 7]>
        <link rel="stylesheet" type="text/css" href="css/ie.css" media="screen" />
    <![endif]-->
	<link rel="stylesheet" type="text/css" href="easyui.css"/>

	<script type="text/javascript" src="jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/jquery-1.3.1.min.js"></script>	
	<script type="text/javascript" language="javascript" src="js/jquery.dropdownPlain.js"></script>
	<script>
		function displayPage(obj) {
			$('#content').load('index.jsp');
			
			var page=obj.id;
			//alert(page);
			$('#content').load(page+'.jsp');
			return false;
		}
	</script>
	
	<script>
		function displayList(obj) {
			//$('#content').load('index.jsp');
			
			var page=obj.id;
			//alert(page);
			$('#content').load(page);
			return false;
		}
	</script>
</head>

<body>

	<div id="page-wrap">
	<h1>Welcome to the Cambio Inventory Control System...</h1><br>
        <alt="Simple jQuery Dropdowns" />
	   	   	   
      You have logged in as a <s:iterator value="roleName"/>
         <s:iterator  value="list">  
	        
	            <s:property value="roleName"/>
		        
	        </s:iterator>
	        
	        <h2>Now you can access these list.. </h2><br>
        
        
  	<a id="totalAmount" onclick="displayList(this)"><u>Total Amount of All Assets  </u></a><br></br>
  	<a id="categoryName" onclick="displayList(this)"><u>Total Amount and Quantity each Asset.. </u></a>
       
        <br><br><br>
		<div id="content"></div>
	</div>


<div id="copyright">&copy; 2015-2016 </div>
</body>

</html>
