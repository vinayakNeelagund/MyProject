$(function() {
  // Initialize form validation on the registration form.
 
  $("#expensedetails").validate({
  
    rules: {
      
      
      title: "required",
      clientname: {
        required: true,
        
        email: true
      },
      amount: {
        required: true,
        minlength: 1
      },
      descpp: "required",
    },
   
    messages: {
      clientname: "Please enter your firstname",
      title: "Please enter your lastname",
      amount: {
        required: "Please provide a amount",
        
      },
      email: "Please enter a valid email address"
    },
  
    submitHandler: function(form) {
      form.submit();
    }
  });
});

$(document).ready( function () {
    $('#myTable').DataTable();
} );
