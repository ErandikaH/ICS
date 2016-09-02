<%-- 
    Document   : myTable
    Created on : Jan 15, 2016, 4:38:04 PM
    Author     : dell
--%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Vendor Rate</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  
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
            var message = $('#edit');
            var tr = $('#tbl').find('tr');
            tr.bind('click', function(event) {
                var values = '';
                tr.removeClass('row-highlight');
                var $td = $(this).addClass('row-highlight').find('td');
                
                var user= $td.eq(0).text();  

                var pw= $td.eq(1).text();  

                var name= $td.eq(2).text();  
               
                document.getElementById("userEdit").value=user;
                document.getElementById("pwEdit").value=pw;
                document.getElementById("nameEdit").value=name;
                
                
                document.getElementById("userD").innerHTML=user;
                document.getElementById("pwD").innerHTML=pw;
                document.getElementById("nameD").innerHTML=name;
             
            
//                $.each(tds, function(index, item) {
//                    values = values + item.innerHTML + '<br/>';
//                });
//				message.html(values);
//                                document.getElementById("edit").innerHTML=values;

            });
        });
        

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
      
<button type="button" id="clickme" onclick="loadPage();">Click me</button>
      <input type = "button" name = "search" value = "Search">
		<input type = "button" name = "refresh" value = "Refresh"><br><br>
                
		</center>
    </div>
    

</div>

<div class="containerResult">
    <h2><center>Results</center></h2>
  

  <div class="tab-content">
   
	<div id="search" class="tab-pane fade in active">
      <br>
	  <center>
	  <table id="tbl" style="border: solid 1px black" border="1">
        <thead>
            <tr>
                <th>User</th>
                <th>Password</th>
                <th>Name</th>
              
              
            </tr>
        </thead>
		<tbody>
          
             <s:iterator  value="list">  
        <tr>  
            <td><s:property value="user"/></td> 
            <td><s:property value="password"/></td> 
            <td><s:property value="name"/></td>  
       
        </tr>  
        </s:iterator>   
            
            <tr>
                <td>Airi Satou</td>
                <td>Accountant</td>
                <td>Tokyo</td>
               
              
            </tr>
			</tbody>
    </table>
	<br />
    <div id="message">
    </div>
		</center>
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
	  User:<input type = "text" id = "user" value="user"><br><br>
	  Password:<input type = "text" id = "pw" value="pw"><br><br>
	  Name:<input type = "text" id = "name" value="name"><br><br>
	  
	  <input type = "button" name = "add" value = "Add"><br><br>
	 
    </div>
	<div id="edit" class="tab-pane fade in active">
      <h3>Edit</h3>
	  <p>Edit your vendor rate.. </p><br>
    
	  User:<input type = "text" id = "userEdit" value="user"><br><br>
	  Password:<input type = "text" id = "pwEdit" value="pw"><br><br>
	  Name:<input type = "text" id = "nameEdit" value="name"><br><br>
	  
	  <input type = "button" name = "edit" value = "Edit"><br><br>
    </div>
    <div id="delete" class="tab-pane fade">
      <h3>Delete</h3>
      <p>Delete your vendor rate..</p>
            User:<label for="user" id="userD"></label><br><br>
	  Password:<label for="pw" id="pwD"></label><br><br>
	  Name:<label for="name" id="nameD"></label><br><br>
	  <input type = "button" name = "delete" value = "Delete"><br><br>
    </div>
    
  </div>
</div>

</body>
</html>
