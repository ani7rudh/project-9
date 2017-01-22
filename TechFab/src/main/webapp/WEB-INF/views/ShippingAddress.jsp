<%@ include file="header.jsp" %>
   
  
  <div align="center"><h2>Shipping Address</h2></div>
  
<!--       <div class="container"> -->
         	  <div class="wrap">	
      
  
    <form:form method="POST" modelAttribute="shippingAddress">

     <div class="form-group row">
        <form:label path="streetAddress" class="col-sm-2 col-form-label">Street Address</form:label>
              <div class="col-sm-10">
        <form:input path="streetAddress"  class="form-control" placeholder="Street Address"/>
                <form:errors path="streetAddress"  class="form-control" cssClass="errors"></form:errors>
        
              </div>
              </div>
           
              
       <div class="form-group row">
        <form:label path="flatNo" class="col-sm-2 col-form-label">FlatNO</form:label>
              <div class="col-sm-10">
        <form:input path="flatNo"  class="form-control" placeholder="Flatno"/>
                        <form:errors path="flatNo"  class="form-control" cssClass="errors"></form:errors>
        
              </div>
              </div>
            
              
              
        <div class="form-group row">
        <form:label path="city" class="col-sm-2 col-form-label">city</form:label>
              <div class="col-sm-10">
        <form:input path="city"  class="form-control" placeholder="city"/>
                                <form:errors path="city"  class="form-control" cssClass="errors"></form:errors>
        
              </div>
              </div>
             
              
              <div class="form-group row">
        <form:label path="state" class="col-sm-2 col-form-label">State</form:label>
              <div class="col-sm-10">
        <form:input path="state"  class="form-control" placeholder="State"/>
                                        <form:errors path="state"  class="form-control" cssClass="errors"></form:errors>
        
              </div>
              </div>
              
              
              
              
              <div class="form-group row">
        <form:label path="postalCode" class="col-sm-2 col-form-label">postal code</form:label>
              <div class="col-sm-10">
        <form:input path="postalCode"  class="form-control" placeholder="postal code"/>
                                                <form:errors path="postalCode"  class="form-control" cssClass="errors"></form:errors>
        
              </div>
              </div>
    
    
     <div class="form-group row">
      <div class="offset-sm-2 col-sm-10">
                  <input type="submit" value="submit" class="btn btn-primary"  name="_eventId_submit"/>
      
      </div>
    </div>
    
    </form:form>
    
  </div>
  
 <%@ include file="footer.jsp" %>
    