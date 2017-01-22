<%@ include file="header.jsp" %>


 <div align="center"><h2>Confirm Shipping Address</h2></div>
  
<!--       <div class="container"> -->
         	  <div class="wrap">	

         	  
  
      <form:form method="POST" modelAttribute="shippingAddress">
 
  
          <div class="col-sm-10">
       streetAddress : ${shippingAddress.streetAddress}
        </div>
                    
    
  
                  <div class="col-sm-10">
       flatNo  :  ${shippingAddress.flatNo}
        </div>
                   
  
  
                  <div class="col-sm-10">
                City  :${shippingAddress.city}
        
                   </div>
  
  
                  <div class="col-sm-10">
              State  :  ${shippingAddress.state}
        
        </div>
                    
  
  
                  <div class="col-sm-10">
        
             Postalcode :   ${shippingAddress.postalCode}
        
        </div>
                   
  
  
                  
      <div class="offset-sm-2 col-sm-10">
        <input name="_eventId_edit" type="submit" value="Edit" class="btn btn-primary"/> 
      
                  <input type="submit" value="submit" class="btn btn-primary"  name="_eventId_submit"/>
      
      </div>
    
    
    
 </form:form>   
    
  </div>
   
  
  
  
  
  <%@ include file="footer.jsp" %>
  
  