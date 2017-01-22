  <%@ include file="header.jsp" %>

                <div class="creditCardForm">
            <div class="heading">
                <h1>Confirm Purchase</h1>
            </div>
            <div class="payment">
                 <form:form method="POST" modelAttribute="cartItem">
                
                    <div class="form-group owner">
                        <label for="owner">Owner</label>
                        <input type="text" class="form-control" id="owner">
                    </div>
                    <div class="form-group CVV">
                        <label for="cvv">CVV</label>
                        <input type="text" class="form-control" id="cvv">
                    </div>
                    <div class="form-group" id="card-number-field">
                        <label for="cardNumber">Card Number</label>
                        <input type="text" class="form-control" id="cardNumber">
                    </div>
                    <div class="form-group" id="expiration-date">
                        <label>Expiration Date</label>
                        <select>
                            <option value="01">January</option>
                            <option value="02">February </option>
                            <option value="03">March</option>
                            <option value="04">April</option>
                            <option value="05">May</option>
                            <option value="06">June</option>
                            <option value="07">July</option>
                            <option value="08">August</option>
                            <option value="09">September</option>
                            <option value="10">October</option>
                            <option value="11">November</option>
                            <option value="12">December</option>
                        </select>
                        <select>
                            <option value="16"> 2016</option>
                            <option value="17"> 2017</option>
                            <option value="18"> 2018</option>
                            <option value="19"> 2019</option>
                            <option value="20"> 2020</option>
                            <option value="21"> 2021</option>
                        </select>
                    </div>
                    <div class="form-group" id="credit_cards">
                        <img src="resources/mypro/images/visa.jpg" id="visa">
                        <img src="resources/mypro/images/mastercard.jpg" id="mastercard">
                        <img src="resources/mypro/images/amex.jpg" id="amex">
                    </div>
                    <div class="form-group" id="pay-now">
          <input type="submit" value="payment" name="_eventId_submit"/>
                    </div>
                </form:form>
            </div>
        </div>
        
        <script src="resources/mypro/js/jquery.payform.min.js" charset="utf-8"></script>
    <script src="resources/mypro/js/script.js"></script>
    


  <%@ include file="footer.jsp" %>
