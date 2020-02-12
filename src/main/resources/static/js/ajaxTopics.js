$(document).ready(function(){
	$('#topicform').submit(function(event){
		event.preventDefault();
		ajaxpost();

	});

	function ajaxpost(){
		var formdata={
				name: $('#name').val(),
				description :$('#description').val()

		}
		
		$.ajax({
			type:'POST',
			contentType:'application/json',
			url:'topics',
			data :JSON.stringify(formdata),
			dataType:"json",
			success: function(result){
				if(result){
					$('#dataresult').html("<p>Success fully inserted</p>");
					
				}else{
					
					$('#dataresult').html("<p>Error</p>");
				}
				console.log("Data is :"+result.status);
			},
			error: function(e){
				alert("Error");
				console.log(">>>>>Error:"+e);
			}
			
			
		});

	}

})
// Yo