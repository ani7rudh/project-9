package com.electro.dao;

import java.util.List;

import org.hibernate.Session;

import com.electro.model.CartItem;
import com.electro.model.Category;
import com.electro.model.WishList;

public interface CartItemDAO {
	public void addCartItem(CartItem cartItem);
	public List<CartItem> getCartList(int userId) ;
	public void deleteCartItemById(int cartItemId);
		
}



