<%@ include file="header.jsp" %>
   
  
  <div align="center"><h2>Confirm Registration Details</h2></div>
  
<!--       <div class="container"> -->
         	  <div class="wrap">	

         	  
         	   <form:form method="POST" modelAttribute="userDetails">
  
  <div class="form-group row">
        <form:label  path="userId" class="col-sm-2 col-form-label">User Id</form:label>
              
    </div>
  
  
  <div class="form-group row">
        <form:label path="userName" class="col-sm-2 col-form-label">user Name</form:label>     
          <div class="col-sm-10">
        ${userDetails.userName}
        </div>
                    </div>
    
  
  <div class="form-group row">
        <form:label path="password" class="col-sm-2 col-form-label">Password</form:label>
                  <div class="col-sm-10">
        ${userDetails.password}
        </div>
                    </div>
  
  
  <div class="form-group row">
        <form:label path="fname" class="col-sm-2 col-form-label">First Name</form:label>
                  <div class="col-sm-10">
        ${userDetails.fname}
                   </div></div>
  
  
  <div class="form-group row">
        <form:label path="lname" class="col-sm-2 col-form-label">last Name</form:label>
                  <div class="col-sm-10">
        ${userDetails.lname}
        </div>
                    </div>
  
  
  <div class="form-group row">
        <form:label path="contact" class="col-sm-2 col-form-label">contact</form:label>
                  <div class="col-sm-10">
        
        ${userDetails.contact}
        </div>
                   </div>
  
  
  <div class="form-group row">
        <form:label path="email" class="col-sm-2 col-form-label">email</form:label>
                  <div class="col-sm-10">
        ${userDetails.email}
        </div>
                    </div>
  
  
  
  
  
   
  
  
   <div class="form-group row">
      <div class="offset-sm-2 col-sm-10">
        <input name="_eventId_edit" type="submit" value="Edit" class="btn btn-primary"/> 
      
                  <input type="submit" value="submit" class="btn btn-primary"  name="_eventId_submit"/>
      
      </div>
    </div>
    
    </form:form>
    
    
  </div>
  
 <%@ include file="footer.jsp" %>
         	  