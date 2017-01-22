package com.electro.service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.electro.daoimpl.UserDetailsDAOImpl;
import com.electro.model.BillingAddress;
import com.electro.model.ShippingAddress;
import com.electro.model.UserDetails;

@Service
@Transactional

public class UserDetailsService {
	
	@Autowired
    UserDetailsDAOImpl userDetailsDAOImpl;
	
	public void addUserDetails(UserDetails userDetails)
	{
		userDetailsDAOImpl.addUserDetails(userDetails);
	}

	public void addBillingAddress(BillingAddress billingAddress) {
		
		userDetailsDAOImpl.addBillingAddress(billingAddress);
	}
	
	public void addShippingAddress(ShippingAddress shippingAddress) {
userDetailsDAOImpl.addShippingAddress(shippingAddress);
	}
	
	public UserDetails getUserByName(String userName)
	{
		return userDetailsDAOImpl.getUserByName(userName);
		
	}

public UserDetails getUserById(int userId) {
	return userDetailsDAOImpl.getUserById(userId);

		
			}

public ShippingAddress getShippingAddressById(int userId) {
	return userDetailsDAOImpl.getShippingAddressById(userId);

	
}


public BillingAddress getBillingAddressById(int userId) {
	return userDetailsDAOImpl.getBillingAddressById(userId);

	}

	
	
	
}
