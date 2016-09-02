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
         <br></br>
        <ul class="dropdown">
        	<li><a href="#">Item</a>
        		<ul class="sub_menu">
        			 <li><a id="addItem" onclick="displayPage(this)">Add Item</a></li>
        			 <li>
        				<a href="#">Update Item</a>
        				<ul>
        					<li><a id="getItemIdForPrice" onclick="displayList(this)">Price</a></li>
        					<li><a id="getItemIdForRemark" onclick="displayList(this)">Remark</a></li>
							<li><a id="getItemId" onclick="displayList(this)">All</a></li>
        				</ul>
        			 </li>
        			 <li><a id="getItemIdForDelete" onclick="displayList(this)">Delete Item</a></li>
        			 <li><a id="getItemId" onclick="displayList(this)">Search Item</a></li>
        			 <li><a id="YearForAssets" onclick="displayPage(this)">View assets that are older than given years</a></li>
        			 <li><a id="missingItemsFromUser" onclick="displayList(this)">View assets missing from user end</a></li>
        			 <li><a id="allAssets" onclick="displayList(this)">VIEW ALL</a></li>
        			
        		</ul>
        	</li>
        	<li><a href="#">Users</a>
        		<ul class="sub_menu">
        			<li><a id="addUser" onclick="displayPage(this)">Add User</a></li>
        			<li><a id="getName" onclick="displayList(this)">Update User</a></li>
        			 <li><a id="getNameForDeleteUser" onclick="displayList(this)">Delete User</a></li>
        			 <li><a id="getName" onclick="displayList(this)">Search User</a></li>
					 <li><a href="#">VIEW ALL</a></li>
        			 
        		</ul>
        	</li>
        	<li><a href="#">Vendors</a>
        		<ul class="sub_menu">
        			 <li><a href="#">Rank Vendors</a> </li>
        			 <li><a href="#">Search Vendor</a></li>
        			 
        		</ul>
        	</li>
        	
        </ul>
        <br><br><br>
		<div id="content"></div>
	</div>


<div id="copyright">&copy; 2015-2016 </div>
</body>

</html>
