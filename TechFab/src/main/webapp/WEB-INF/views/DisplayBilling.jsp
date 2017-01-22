<%@ include file="header.jsp" %>
<br><br>

 <div align="center"><h2>Confirm Billing Address</h2></div>
  
<!--       <div class="container"> -->
         	  <div class="wrap">	

         	  
  
     <form:form method="POST" modelAttribute="billingAddress">
 
  
          <div class="col-sm-10">
        Street Address  :   ${billingAddress.streetAddress}
        </div>
                    
    
  
                  <div class="col-sm-10">
       FlatNo  :   ${billingAddress.flatNo}
        </div>
                   
  
  
                  <div class="col-sm-10">
              City  :  ${billingAddress.city}
        
                   </div>
  
  
                  <div class="col-sm-10">
              State  :  ${billingAddress.state}
        
        </div>
                    
  
  
                  <div class="col-sm-10">
        
               PostalCode  : ${billingAddress.postalCode}
        
        </div>
                   
  
  
                  
      <div class="offset-sm-2 col-sm-10">
        <input name="_eventId_edit" type="submit" value="Edit" class="btn btn-primary"/> 
      
                  <input type="submit" value="submit" class="btn btn-primary"  name="_eventId_submit"/>
      
      </div>
    
    
    
    </form:form>
    
  </div>
    
  
  
  
  <br><br>
  <%@ include file="footer.jsp" %>
  
  