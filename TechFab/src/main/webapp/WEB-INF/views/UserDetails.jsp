<%@ include file="header.jsp" %>
   
  
  <div align="center"><h2>Registration</h2></div>
  
<!--       <div class="container"> -->
         	  <div class="wrap">	
      
  
    <form:form method="POST" modelAttribute="userDetails">
  
  <div class="form-group row">
        <form:label  path="userId" class="col-sm-2 col-form-label">User Id</form:label>
              <div class="col-sm-10">
        <form:input type="hidden" path="userId" class="form-control"/>
        </div>
    </div>
  
  
  <div class="form-group row">
        <form:label path="userName" class="col-sm-2 col-form-label">user Name</form:label>
              <div class="col-sm-10">
        <form:input path="userName" class="form-control" placeholder="User Name"/>
        <form:errors path="userName"  class="form-control" cssClass="error"></form:errors>
        
              </div>
              </div>
    
  
  <div class="form-group row">
        <form:label path="password" class="col-sm-2 col-form-label">Password</form:label>
              <div class="col-sm-10">
        <form:input path="password" type="password" class="form-control" placeholder="Password"/>
        <form:errors path="password"  class="form-control" cssClass="error"></form:errors>
        
              </div>
              </div>
  
  
  <div class="form-group row">
        <form:label path="fname" class="col-sm-2 col-form-label">First Name</form:label>
              <div class="col-sm-10">
        <form:input path="fname" class="form-control" placeholder="first Name"/>
        <form:errors path="fname"  class="form-control" cssClass="error"></form:errors>
        
              </div>
              </div>
  
  
  <div class="form-group row">
        <form:label path="lname" class="col-sm-2 col-form-label">last Name</form:label>
              <div class="col-sm-10">
        <form:input path="lname" class="form-control" placeholder="last Name"/>
        <form:errors path="lname"  class="form-control" cssClass="error"></form:errors>
        
              </div>
              </div>
  
  
  <div class="form-group row">
        <form:label path="contact" class="col-sm-2 col-form-label">contact</form:label>
              <div class="col-sm-10">
        <form:input path="contact" class="form-control" placeholder="contact"/>
        <form:errors path="contact"  class="form-control" cssClass="error"></form:errors>
        
              </div>
              </div>
  
  
  <div class="form-group row">
        <form:label path="email" class="col-sm-2 col-form-label">email</form:label>
              <div class="col-sm-10">
        <form:input path="email" type="email" class="form-control" placeholder="email"/>
        <form:errors path="email"  class="form-control" cssClass="error"></form:errors>
        
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
