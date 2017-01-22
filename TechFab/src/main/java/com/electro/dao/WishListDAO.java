package com.electro.dao;

import java.util.List;

import com.electro.model.WishList;

public interface WishListDAO {
	
	public void addWishList(WishList wishList);
	public List<WishList> getWishList();
	public void deleteWishListById(int wishListId);



}
