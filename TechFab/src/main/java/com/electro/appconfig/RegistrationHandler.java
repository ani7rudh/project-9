package com.electro.appconfig;

import javax.persistence.Cacheable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.electro.model.BillingAddress;
import com.electro.model.ShippingAddress;
import com.electro.model.UserDetails;
import com.electro.service.UserDetailsService;
@Component
public class RegistrationHandler {
	@Autowired
	BillingAddress billingAddress;
	
	@Autowired
	ShippingAddress shippingAddress;
	@Autowired
	UserDetailsService userDetailsService;
	
	
	public UserDetails initFlow()
	{
		return new UserDetails();
	}
	
	
	public String validateDetails(UserDetails userDetails,MessageContext messageContext){
		String status = "success";
		if(userDetails.getUserName().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"userName").defaultText("*Field cannot be Empty").build());
			status = "failure";
		}
		
		
		if(userDetails.getPassword().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"password").defaultText("*Field cannot be Empty").build());
			status = "failure";
		}
		
		
		if(userDetails.getFname().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"fname").defaultText("*Field cannot be Empty").build());
			status = "failure";
		}
		
		if(userDetails.getLname().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"lname").defaultText("*Field cannot be Empty").build());
			status = "failure";
		}
		
		if(userDetails.getContact().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"contact").defaultText("*Field cannot be Empty").build());
			status = "failure";
		}
		
		if(userDetails.getEmail().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"email").defaultText("*Field cannot be Empty").build());
			status = "failure";
		}
		
		
		
		
		
		
		return status;
		
	}
	
	public String addBillingAddress(BillingAddress billingAddress)
	{
		billingAddress.setBillingAdddressId(billingAddress.getBillingAdddressId());
		billingAddress.setStreetAddress(billingAddress.getStreetAddress());
		billingAddress.setFlatNo(billingAddress.getFlatNo());
	    billingAddress.setCity(billingAddress.getCity());
		billingAddress.setState(billingAddress.getState());
		billingAddress.setPostalCode(billingAddress.getPostalCode());
		
		
		this.billingAddress.setBillingAdddressId(billingAddress.getBillingAdddressId());
		this.billingAddress.setStreetAddress(billingAddress.getStreetAddress());
		this.billingAddress.setFlatNo(billingAddress.getFlatNo());
		this.billingAddress.setCity(billingAddress.getCity());
		this.billingAddress.setState(billingAddress.getState());
		this.billingAddress.setPostalCode(billingAddress.getPostalCode());
		
		
		return "submit";
		
		
		
	}
	
	public String addShippingAddress(ShippingAddress shippingAddress)

	{
		this.shippingAddress.setShippingAddressId((shippingAddress.getShippingAddressId()));
		this.shippingAddress.setStreetAddress((shippingAddress.getStreetAddress()));
		this.shippingAddress.setFlatNo((shippingAddress.getFlatNo()));
		this.shippingAddress.setCity((shippingAddress.getCity()));
		this.shippingAddress.setState((shippingAddress.getState()));
		this.shippingAddress.setPostalCode(shippingAddress.getPostalCode());




		
		
		return "submit";
		
	}
	
	
	public String addDetails(UserDetails userDetails,BillingAddress billingAddress,ShippingAddress shippingAddres)
	{
		userDetailsService.addUserDetails(userDetails);
		shippingAddress.setUserDetails(userDetails);
		userDetails.setShippingAddress(shippingAddress);;
		this.shippingAddress.setUserDetails(userDetails);
		
		billingAddress.setUserDetails(userDetails);
		userDetails.setBillingAddress(billingAddress);;
		this.billingAddress.setUserDetails(userDetails);
		
		userDetails.getBillingAddress().setUserDetails(userDetails);
		userDetails.getShippingAddress().setUserDetails(userDetails);
userDetailsService.addBillingAddress(billingAddress);

userDetailsService.addShippingAddress(shippingAddress);

userDetailsService.addUserDetails(userDetails);

		
		
		
		return "success";
		
	}
	
	
	
	
		
	
	
}
