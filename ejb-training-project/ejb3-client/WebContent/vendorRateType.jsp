<%-- 
    Document   : myTable
    Created on : Jan 15, 2016, 4:38:04 PM
    Author     : dell
--%>
<%@page import="org.apache.struts2.ServletActionContext"%>
<%@page import="se.cambio.ics.controller.VendorControllerImpl"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Vendor Rate</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <link rel="stylesheet" href="css/jquery.dataTables.min.css" type="text/css" media="screen, projection"/>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <style>
* {
    box-sizing: border-box;
}
.row:after {
    content: "";
    clear: both;
    display: block;
}
[class*="col-"] {
    float: left;
    padding: 15px;
}
html {
    font-family: "Lucida Sans", sans-serif;
}
.header {
    background-color: #9933cc;
    color: #ffffff;
    padding: 15px;
}
div.containerSearch{
	
	border: 2px solid #a1a1a1;
	border-radius: 5px;
	width: 90%;
	height: auto;
	margin-top: 80px;
	margin:50px auto;
	float:center;
	font-family: 'Droid Serif', serif;
	border: 15px white;
	box-shadow: 0 0 5px;
	position:relative;
	
}

div.containerResult{
	
	border: 2px solid #a1a1a1;
	border-radius: 5px;
	width: 90%;
	height: auto;
	margin-top: 80px;
	margin:50px auto;
	float:center;
	font-family: 'Droid Serif', serif;
	border: 15px white;
	box-shadow: 0 0 5px;
	position:relative;
	display: none;
}
div.conResult2{
	width: 80%;
	height: auto;
	margin-top: 80px;
	margin:50px auto;
	float:center;
	font-family: 'Droid Serif', serif;
	
	position:relative;

}
div.container{
	
	border: 2px solid #a1a1a1;
	border-radius: 5px;
	width: 90%;
	height: auto;
	margin-top: 80px;
	margin:50px auto;
	float:center;
	font-family: 'Droid Serif', serif;
	border: 15px white;
	box-shadow: 0 0 5px;
	position:relative;
	
}
.menu ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
}
.menu li {
    padding: 8px;
    margin-bottom: 7px;
    background-color :#33b5e5;
    color: #ffffff;
    box-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);
}
.menu li:hover {
    background-color: #0099cc;
}
.aside {
    background-color: #33b5e5;
    padding: 15px;
    color: #ffffff;
    text-align: center;
    font-size: 14px;
    box-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);
}
.footer {
    background-color: #0099cc;
    color: #ffffff;
    text-align: center;
    font-size: 12px;
    padding: 15px;
}
/* For mobile phones: */
[class*="col-"] {
    width: 100%;
}
@media only screen and (min-width: 600px) {
    /* For tablets: */
    .col-m-1 {width: 8.33%;}
    .col-m-2 {width: 16.66%;}
    .col-m-3 {width: 25%;}
    .col-m-4 {width: 33.33%;}
    .col-m-5 {width: 41.66%;}
    .col-m-6 {width: 50%;}
    .col-m-7 {width: 58.33%;}
    .col-m-8 {width: 66.66%;}
    .col-m-9 {width: 75%;}
    .col-m-10 {width: 83.33%;}
    .col-m-11 {width: 91.66%;}
    .col-m-12 {width: 100%;}
}
@media only screen and (min-width: 768px) {
    /* For desktop: */
    .col-1 {width: 8.33%;}
    .col-2 {width: 16.66%;}
    .col-3 {width: 25%;}
    .col-4 {width: 33.33%;}
    .col-5 {width: 41.66%;}
    .col-6 {width: 50%;}
    .col-7 {width: 58.33%;}
    .col-8 {width: 66.66%;}
    .col-9 {width: 75%;}
    .col-10 {width: 83.33%;}
    .col-11 {width: 91.66%;}
    .col-12 {width: 100%;}
}

.row-highlight
        {
            background-color: Yellow;
        }
 

</style>

<script>
 
	function loadPage(){

            $(".containerResult").slideToggle("slow");
           
		
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


    <script type="text/javascript">
        $(function() {
        	$( "#date" ).datepicker();
        	$( "#dateE" ).datepicker();
            var message = $('#edit');
            var tr = $('#tbl').find('tr');
            tr.bind('click', function(event) {
                var values = '';
                tr.removeClass('row-highlight');
                var $td = $(this).addClass('row-highlight').find('td');
                
                var id= $td.eq(0).text();  

                var date= $td.eq(1).text();  

                var vendorId= $td.eq(2).text();  
                
                var rateTypeId= $td.eq(3).text();  
                
                var rateLevelId= $td.eq(4).text();
                
                var remark= $td.eq(5).text();
                
               
                document.getElementById("rateIdE2").innerHTML=id;
                document.getElementById("rateIdE").value=id;
                document.getElementById("vendorEdit").value=vendorId;
                
                
                document.getElementById("rateTypeEdit").value=rateTypeId;
                document.getElementById("rateLevelEdit").value=rateLevelId;
                document.getElementById("dateE").value=date;
                document.getElementById("remarkE").value=remark;
                
                document.getElementById("rateIdD2").innerHTML=id;
                document.getElementById("rateIdD").value=id;
                document.getElementById("vendorD").innerHTML=vendorId;
                document.getElementById("rateTypeD").innerHTML=rateTypeId;
                document.getElementById("rateLevelD").innerHTML=rateLevelId;
                document.getElementById("dateD").innerHTML=date;
                document.getElementById("remarkD").innerHTML=remark;
            
//                $.each(tds, function(index, item) {
//                    values = values + item.innerHTML + '<br/>';
//                });
//				message.html(values);
//                                document.getElementById("edit").innerHTML=values;

            });
        });
        
        $(document).ready(function() {
            $('#tbl').DataTable( {
                "pagingType": "full_numbers"
            } );
        } );

    </script>
    
</head>
<body>
<center>
    <br>
    <h1 style="color:blue;font-size:300%;"><b>Cambio Inventory Control System</b></h1>
</center>
<div class="containerSearch">
    
   
<h3 style="font-size:200%;"><center>Search</center></h3>
   
	<div id="search" class="tab-pane fade in active">
      <br>
	  <center>
	  Vendor ID:<input type = "text" name = "vendorId" value="vendorId">
	  Rate type ID:<input type = "text" name = "rateTypeId" value="rateTypeId"><br><br>
      
<button type="button" id="clickme" onclick="loadPage();">Search</button>
   
		<input type = "button" name = "refresh" value = "Refresh"><br><br>
                
		</center>
    </div>
    

</div>

<div class="containerResult">
<div class="conResult2">
    <h2><center>Results</center></h2>
  

  <div class="tab-content">
   
	<div id="search" class="tab-pane fade in active">
      <br>
	  <center>
	  <table id="tbl" class="display" cellspacing="0" width="100%">
        <thead>
            <tr>
                <tr>
                <td>Vendor Rate Type ID</td>
                <td>Date</td>
                <td>Vendor Name</td>
                <td>Rate Type Name</td>
                <td>Rate Level Name</td>
                <td>Remarks</td>
            </tr>
            </tr>
        </thead>
        <tfoot>
            <tr>
                <tr>
                <td>Vendor Rate Type ID</td>
                <td>Date</td>
                <td>Vendor Name</td>
                <td>Rate Type Name</td>
                <td>Rate Level Name</td>
                <td>Remarks</td>
            </tr>
            </tr>
        </tfoot>
            
		<tbody>
          
             <s:iterator  value="list">  
        <tr>  
            <td><s:property value="id"/></td> 
	        <td><s:property value="date"/></td> 
	        <td><s:property value="vendor.lastName"/></td>
	        <td><s:property value="rateType.typeName"/></td> 
	        <td><s:property value="rateLevel.rateLevelName"/></td>
	        <td><s:property value="remarks"/></td>    
	       
       
        </tr>  
        </s:iterator>   
            
            
			</tbody>
    </table>
	<br />
    <div id="message">
    </div>
		</center>
    </div>
 </div>   
  </div>
</div>

<div class="container">
  <h2><center>Information</center></h2>
  <ul class="nav nav-tabs">
	<li><a data-toggle="tab" href="#add">Add</a></li>
    <li class="active"><a data-toggle="tab" href="#edit">Edit</a></li>
    <li><a data-toggle="tab" href="#delete">Delete</a></li>
    
  </ul>

  <div class="tab-content">
   
    <div id="add" class="tab-pane fade">
      <h3>Add</h3>
      <p>Rate your vendor.. </p><br>
      <form action="addVendorRateType" method="post">
      <table>
      <tr>
      <td>Vendor: <br></td>
      <td><s:select id="dropdown" label="Vendor" 
                        headerKey="-1" headerValue="Select Vendor Name"
                        list="vendorNameList" name="selectedVendorName"/> </td>
      </tr>
      <tr></tr>
      <tr>
      <td>RateType: <br></td>
      <td><s:select id="dropdown1" label="Rate type" 
                        headerKey="-1" headerValue="Select Rate Type"
                        list="rateTypeNameList" name="selectedRateTypeName"/></td>
      </tr>
      <tr></tr>
      <tr>
      <td>Rate Level: <br></td>
      <td><s:select id="dropdown2" label="Rate Level" 
	                        headerKey="-1" headerValue="Select Rate Level"
	                        list="rateLevelNameList" name="selectedRateLevelName"/></td>
      </tr>
      <tr></tr>
      
      <tr>
      <td>Date:</td>
      <td><input type="text" id="date" name="date" value="currentDate"></td>
      </tr>
      <tr></tr>
		<tr>
      <td>Remark: </td>
      <td><textarea rows="4" cols="50" id="remark" name="remark"></textarea> <br></td>
      </tr>
      <tr></tr>
		<tr>
      <td></td>
      <td><s:submit label="submit" value="Add"></s:submit></td>
      </tr>
	  
	  </table>
	  </form><br><br>
	 
    </div>
	<div id="edit" class="tab-pane fade in active">
      <h3>Edit</h3>
	  <p>Edit your vendor rate.. </p><br>
	  <form action="updateVendorRateType" method="post">
    	ID:<label for="rateId" id="rateIdE2"></label>
    	<input type="hidden" id="rateIdE" name="rateIdE"><br>
	  Vendor:<input type = "text" id = "vendorEdit" name="vendorEdit" value="vendor"><br><br>
	 Rate Type:<input type = "text" id = "rateTypeEdit" name="rateTypeEdit" value="rate type"><br><br>
	  Rate Level:<input type = "text" id = "rateLevelEdit" name="rateLevelEdit" value="rate level"><br><br>
	  Date:<input type="text" id="dateE" name="dateE" value="currentDate"><br><br>
	  Remark: <textarea rows="4" cols="50" id="remarkE" name="remarkE"></textarea><br><br>
	  
	  <s:submit label="submit" value="Edit"></s:submit></form><br><br>
    </div>
    <div id="delete" class="tab-pane fade">
      <h3>Delete</h3>
      <p>Delete your vendor rate..</p>
       <form action="deleteVendorRateType" method="post">
      ID:<label for="rateId" id="rateIdD2"></label>
      <input type="hidden" id="rateIdD" name="rateIdD"> <br>
            Vendor:<label for="vendor" id="vendorD"></label><br><br>
	  Rate Type:<label for="rateType" id="rateTypeD"></label><br><br>
	  Rate Level:<label for="rateLevel" id="rateLevelD"></label><br><br>
	  Date:<label for="date" id="dateD"></label><br><br>
	  Remark: <label for="remark" id="remarkD"></label><br><br>
	  <s:submit label="submit" value="Delete"></s:submit></form><br><br>
    </div>
    
  </div>
</div>

</body>
</html>
