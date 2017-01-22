package com.electro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.electro.daoimpl.WishListDAOImpl;
import com.electro.model.WishList;

@Service
@Transactional

public class WishListService {
	
	@Autowired
	WishListDAOImpl wishListDAOImpl;
	
	public void addWishList(WishList wishList) {
wishListDAOImpl.addWishList(wishList);
	}
	
	public List<WishList> getWishList() {
		return wishListDAOImpl.getWishList();
	}
	
	public void deleteWishListById(int wishListId) {
		wishListDAOImpl.deleteWishListById(wishListId);
	}
	
	}



