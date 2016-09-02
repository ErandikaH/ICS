<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="easyui.css">
<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.1.min.js"></script>
<script type="text/javascript" src="jquery.easyui.min.js"></script>
<script>
(function($){
	//var datebox = $.fn.datebox.defaults.onChange;
	$.fn.datebox.defaults.formatter = function(date){
		var y = date.getFullYear()+100;
		var m = date.getMonth()+1;
		var d = date.getDate();
		return m+'/'+d+'/'+y;
	};
	
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
        <form action="updateItem" method="post">
        <s:iterator  value="list">  
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
            
		 </s:iterator>  	
		 <s:iterator  value="listId">
			<tr>
	    		<td><s:textfield label="Category Id" name="catId" class="easyui-textbox"/></td>
		    </tr>
		    <tr>
		    	<td><s:textfield label="Status Id" name="statusId" class="easyui-textbox"/></td>    
		    </tr>
		    <tr>
		    	<td><s:textfield label="Invoice Id" name="invoiceId" class="easyui-textbox"/></td>
		    </tr>
		    <tr>
		    	<td><s:textfield label="Department Id" name="depId" class="easyui-textbox"/></td>
		    </tr>
		    <tr>
		    	<td><s:textfield label="Manufacturer Id" name="manuId" class="easyui-textbox"/></td>
		    </tr>
	    
	    </s:iterator>  
	    </table><br>
	    <s:submit label="submit" style="float:left; margin-right:12px;"></s:submit></form>
    </body>
</html>
