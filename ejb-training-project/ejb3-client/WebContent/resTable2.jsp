<%@page import="se.cambio.ics.action.VendorRateTypePM"%>
<!doctype html>
<html lang="en">
<head>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js" type="text/javascript"></script>
<script type = "text/javascript">
function loadPage() {
	var vId=$('#vendorId').val() ;
    $.ajax({
        type: 'GET',
        url: '/rateTypeList',
        data: '{vendorId: "' +vId + '" }',
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data, textStatus, jqXHR) {
            alert(data.length);
           
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert('Error in loding  : ' + errorThrown);
           
        }
    });
}

</script>
</head>
<body>
 
<input type="text" id="vendorId" name="vendorId"><br>
 <button type="button" id="clickme" onclick="loadPage();">Search</button>
 
</body>
</html>