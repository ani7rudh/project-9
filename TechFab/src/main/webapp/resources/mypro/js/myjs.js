 <!-- 					autocomplete script	start		 -->

    	
     	$(document).ready(function() {

    		$('#w-input-search').autocomplete({
     			serviceUrl: 'http://localhost:8084/TechFab/getproducts',
     			paramName: "productName",
     			delimiter: ",",
     		   transformResult: function(response) {

     			return {
     			  //must convert json to javascript object before process
     			  suggestions: $.map($.parseJSON(response), function(item) {

     			      return { value: item.productName, data: item.productId };
     			   })

     			 };

     	            }

     		 });

     	  });
    	
    	
    	
     	 


<!-- autocomplete end -->

