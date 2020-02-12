
	
$(function(){
	  $('.info_link').click(function(){
	    alert($(this).attr('href'));
	    // or alert($(this).hash();
	  });
	});

$(document).ready(function(){
	$('#expensedetails').submit(function(event){
		event.preventDefault();
		ajaxpost();

	});

	function ajaxpost(){
		var formdata={
				clientname: $('#clientname').val(),
				title :$('#title').val(),
				amount :$('#amount').val(),
				descpp :$('#descpp').val(),
				currency :$('#currency').val(),
				

		}
		
		$.ajax({
			
			type:'POST',
			contentType:'application/json',
			url:'expenses',
			data :JSON.stringify(formdata),
			dataType:"json",
			success: function(result){
				if(result){
					$('#msg').html("<p style='color:green'>Success fully inserted</p>");
					
				}else{
					
					$('#msg').html("<p style='color:green'>Error while  inserting Data</p>");
				}
				console.log("Data is :"+result.status);
			},
			error: function(e){
				alert("Error while Requesting");
				
			}
			
			
		});
		
		

	}

})


	$(document).ready(function(){
		
	
	
	
	$.ajax({
		
		type : "GET",
		url :'/allexpenses',
		//data :JSON.stringify(formdata),
		dataType:"json",
		success: function(result){
			
			if(result){
				var addtable="<table id='example' class='table table-striped table-hover dt-responsive '> <tr class='text-center'><th>SL.No</th><th>Cleint Name</th></tr> ";
				var slno=1;
				 for (i = 0; i <result.length; i++) {
					 
					 addtable+="<tr><td>"+(slno++)+"</td><td ><a class='info_link'  href='/getexpense/"+result[i]+"'>"+result[i]+"</a></td></tr>";
                     //console.log("Client Name :"+item.clientname+"Id:"+item.expid);
                 }
				 addtable+="</table>";
				 $("#ListofExpense").html(addtable);
			}else{
				
				$('#ListofExpense').html("<p style='color:green'>Error while  displaying  Data</p>");
			}
			//console.log("Data is :"+result[0].clientname.value);
		},
		error: function(e){
			alert("Error while displaying");
			
		}
		
		
	});
	});

// Yo