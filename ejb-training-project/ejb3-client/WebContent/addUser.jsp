<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="easyui.css">
<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.1.min.js"></script>
<script type="text/javascript" src="jquery.easyui.min.js"></script>
<script>
(function($){
	
	var textbox=$.fn.textbox.defaults.onChange;
	$.fn.textbox.defaults.onChange = function(newValue, oldValue){
		$(this).closest('form').trigger('change');
		textbox.call(this, newValue, oldValue);
	};
	
})(jQuery);
</script>

<head>
<%@ taglib uri="/struts-tags" prefix="s"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>

</head>
    <body>
    
    <h1>Add User...</h1>
    <form action="addUser" method="post">
    <table>
	    <tr>
	    	<td><s:textfield label="First Name" name="firstName" class="easyui-textbox"/></td>
	    </tr>
	    <tr>
	    	<td><s:textfield label="Last Name" name="lastName" class="easyui-textbox"/></td>
	    </tr>
	    <tr>
	    	<td><s:textfield label="User Name" name="userName" class="easyui-textbox"/></td>
	    </tr>
	   
	    <tr>
	    	<td><s:textfield label="E-mail" name="email" class="easyui-textbox"/></td>
	    </tr>
	    <tr>
	    	<td><s:textfield label="Role Name" name="roleName" class="easyui-textbox"/></td>
	    </tr>
	    
    </table> <br>
	<s:submit label="submit" value="Add" style="float:left; margin-right:12px;"></s:submit></form>
      
    </body>
</html>