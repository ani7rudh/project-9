package com.electro.appconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.electro.model.BillingAddress;
import com.electro.model.MainClass;
import com.electro.model.ShippingAddress;
import com.electro.model.UserDetails;

@Component
public class CartHandler {

	@Autowired
	BillingAddress billingAddress;
	
	@Autowired
	ShippingAddress shippingAddress;
	
	
	public MainClass initFlow()
	{
		return new MainClass();
	}
	
	
	public String validateBillingAddress(BillingAddress billingAddress,MessageContext messageContext){
		
		String status = "success";
		if(billingAddress.getStreetAddress().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"streetAddress").defaultText("*Field cannot be Empty").build());
			status = "failure";
		}
		
		
		if(billingAddress.getFlatNo().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"flatNo").defaultText("*Field cannot be Empty").build());
			status = "failure";
		}
		
		
		if(billingAddress.getCity().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"city").defaultText("*Field cannot be Empty").build());
			status = "failure";
		}
		
		if(billingAddress.getState().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"state").defaultText("*Field cannot be Empty").build());
			status = "failure";
		}
		
		if(billingAddress.getPostalCode().length()!=6){
			messageContext.addMessage(new MessageBuilder().error().source(
					"postalCode").defaultText("*Field should be minimum 6 digit").build());
			status = "failure";
		}
		else if(billingAddress.getPostalCode().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"postalCode").defaultText("*Field cannot be Empty").build());
			status = "failure";
		}
		
		
		return status;
	
		
	}
	
	
	
	
	public String validateShippingAddress(ShippingAddress shippingAddress,MessageContext messageContext){
		
		String status = "success";
		if(shippingAddress.getStreetAddress().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"streetAddress").defaultText("*Field cannot be Empty").build());
			status = "failure";
		}
		
		
		if(shippingAddress.getFlatNo().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"flatNo").defaultText("*Field cannot be Empty").build());
			status = "failure";
		}
		
		
		if(shippingAddress.getCity().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"city").defaultText("*Field cannot be Empty").build());
			status = "failure";
		}
		
		if(shippingAddress.getState().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"state").defaultText("*Field cannot be Empty").build());
			status = "failure";
		}
		
		if(shippingAddress.getPostalCode().length()!=6){
			messageContext.addMessage(new MessageBuilder().error().source(
					"postalCode").defaultText("*Field should be minimum 6 digit").build());
			status = "failure";
		}
		else if(shippingAddress.getPostalCode().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"postalCode").defaultText("*Field cannot be Empty").build());
			status = "failure";
		}
		
		
		return status;
	
		
	}
	
	
	
	
	

	
	
	
	
}
