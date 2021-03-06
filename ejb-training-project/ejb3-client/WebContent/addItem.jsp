<%-- 
    Document   : addItem
    Created on : Dec 25, 2015, 9:16:13 PM
    Author     : PC
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="easyui.css">
<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.1.min.js"></script>
<script type="text/javascript" src="jquery.easyui.min.js"></script>
<script>
(function($){
	var datebox = $.fn.datebox.defaults.onChange;
	$.fn.datebox.defaults.onChange = function(newValue, oldValue){
		$(this).closest('form').trigger('change');
		datebox.call(this, newValue, oldValue);
	};
	
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
<title>Add Item</title>

</head>
    <body>
    
    <h1>Add Item...</h1>
    <center>
    <form action="addItem" method="post">
    <table>
	    <tr>
	    	<td><s:textfield label="Asset Number" name="assetNumber" class="easyui-textbox"/></td>
	    </tr>
	    <tr>
	    	<td><s:textfield label="Serial Number" name="serialNumber" class="easyui-textbox"/></td>
	    </tr>
	    <tr>
	    	<td><s:textfield label="Description" name="description" class="easyui-textbox"/></td>
	    </tr>
	    <tr>
	    	<td><s:textfield label="Warranty Start Date" name="warrantyStartDate" class="easyui-datebox"/></td>
	    </tr>
	    <tr>
	    	<td><s:textfield label="Warranty End Date" name="warrantyEndDate" class="easyui-datebox"/></td>
	    </tr>
	    <tr>
	    	<td><s:textfield label="Price" name="price" class="easyui-textbox"/></td>
	    </tr>
	    <tr>
	    	<td><s:textfield label="Remarks" name="remarks" class="easyui-textbox"/></td>
	    </tr>
	    <tr>
	    	<td><s:textfield label="Category Id" name="categoryId" class="easyui-textbox"/></td>
	    </tr>
	    <tr>
	    	<td><s:textfield label="Status Id" name="statusId" class="easyui-textbox"/></td>    
	    </tr>
	    <tr>
	    	<td><s:textfield label="Invoice Id" name="invoiceId" class="easyui-textbox"/></td>
	    </tr>
	    <tr>
	    	<td><s:textfield label="Department Id" name="departmentId" class="easyui-textbox"/></td>
	    </tr>
	    <tr>
	    	<td><s:textfield label="Manufacturer Id" name="manufacturerId" class="easyui-textbox"/></td>
	    </tr>
    </table> <br><br>
	<s:submit label="submit" value="Add" style="float:left; margin-center:12px;"></s:submit></form>
      </center>
    </body>
</html>
