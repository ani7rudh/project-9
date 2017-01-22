package com.electro.dao;

import com.electro.model.BillingAddress;
import com.electro.model.ShippingAddress;
import com.electro.model.UserDetails;

public interface UserDetailsDAO {

public void addUserDetails(UserDetails userDetails);
	public void addBillingAddress(BillingAddress billingAddress);
	public void addShippingAddress(ShippingAddress shippingAddress);

}
