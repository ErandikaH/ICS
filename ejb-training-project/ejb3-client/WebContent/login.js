$(document).ready(function(){

$("#submit").click(function(){

	var userId = $("#userId").val();
	var userName = $("#userName").val();
	
	//checking for blank fields
	if( userId =='' || userName =='')
		{
		  $('input[type="text"]').css("border","2px solid red");
		  $('input[type="text"]').css("box-shadow","0 0 3px red");
		  alert("Please fill all fields...!!!!!!");
		}	
	
	});

});
