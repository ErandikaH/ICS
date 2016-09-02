<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Assets</title>
    </head>
    <body>
        <h1>View Assets Details</h1>
       <form action="updateUser" method="post"> 
         
        <table>
        <s:iterator  value="list"> 
		   <tr>
	    	<td><s:textfield label="First Name" name="firstName" class="easyui-textbox"/></td>
		    </tr>
		    <tr>
		    	<td><s:textfield label="Last Name" name="lastName" class="easyui-textbox"/></td>
		    </tr>
		    <tr>
		    	<td><s:textfield label="User Name" name="loginName" class="easyui-textbox"/></td>
		    </tr>
		   
		    <tr>
		    	<td><s:textfield label="E-mail" name="email" class="easyui-textbox"/></td>
		    </tr>
		 </s:iterator>  	
		<s:iterator  value="roleName">  
		    <tr>
		    	<td><s:textfield label="Role Name" name="roleName" class="easyui-textbox"/></td>
		    </tr>
             
		 </s:iterator>  	
	  </table><br> 
	    <s:submit label="submit" style="float:left; margin-right:12px;"></s:submit></form>
    </body>
</html>
