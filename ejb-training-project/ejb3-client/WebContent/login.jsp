<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="/struts-tags" prefix="s"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cambio Inventory Control System</title>
    <meta name="robots" content="noindex, nofollow">
	
	<!-- include css file here-->
   <link rel="stylesheet" href="style.css"/>
   <link rel="stylesheet" href="demo.css"/>
   
	<!-- include JavaScript file here-->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script type="text/javascript" src="login.js"></script>
  
  <script>
function validLogin(){
if (document.form.userName.value == ""){
alert ( "Please enter Login Name." );
document.loginform.userName.focus();
return false;
}
if (document.form.userId.value == ""){
alert ( "Please enter password." );
document.userform.userId.focus();
return false;
}
alert ( "Welcome User" );
return true;
}
</script>

</head>
<body>

<form action="login" method="post">
 <div  class="form">
	<div class="container">
		<h2>Cambio Inventory Control System</h2><hr/>
	</div>
	
	<div class="panel">
	
	<div class="fieldPanel">
		
			<s:textfield label="User Id" name="userId" /><br>
			<s:password label="Password" name="userName" />
			
	<br><br>
	</div>
	
	<div class="buttonPanel">	

			<s:submit name="submit" label="Submit" value="Login" align="center" />
		
	</div>
	
	</div>
	</div>
	</form>
</body>
</html>
	