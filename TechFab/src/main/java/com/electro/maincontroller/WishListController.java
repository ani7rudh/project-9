package com.electro.maincontroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.electro.model.WishList;
import com.electro.service.ProductService;
import com.electro.service.UserDetailsService;
import com.electro.service.WishListService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Controller
public class WishListController {
	
	@Autowired
	WishListService wishListService;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	ProductService productService;
	
	
	
	@RequestMapping(value = "wishlist-{productId}")
	   public String wishlist(@PathVariable("productId") int productId,@ModelAttribute("wishList") WishList wishList,Model model,@RequestParam("userId")int userId,HttpSession httpSession)
	{
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		String userName=auth.getName();
		userId=userDetailsService.getUserByName(userName).getUserId();
		wishList.setCartId(userId);
		wishList.setUserId(userId);
		wishList.setProductId(productId);
		
		String productName=productService.getProductById(productId).getProductName();
		wishList.setProductName(productName);
		String productDescription=productService.getProductById(productId).getProductDescription();
		wishList.setProductDescription(productDescription);
		
		
		float productPrice=productService.getProductById(productId).getProductPrice();
		wishList.setProductPrice(productPrice);
		
		int productDiscount=productService.getProductById(productId).getProductDiscount();
		wishList.setProductDiscount(productDiscount);;
		
		wishListService.addWishList(wishList);

		
	      return "redirect:/wishlist";

	}
	
	@RequestMapping(value = "wishlist")
	   public String wishList(Model model,HttpSession httpSession)
	{
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		String userName=auth.getName();
		userDetailsService.getUserByName(userName);
   int userId=userDetailsService.getUserByName(userName).getUserId();
   httpSession.setAttribute("userId", userId);

   
		   Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		   String wishList=gson.toJson(wishListService.getWishList());
		   model.addAttribute("wishList", wishList);
		  
	
	
	
         return "WishList";
}

	@RequestMapping(value="deletewishList-{wishListId}")
	   public String deleteWishList(@PathVariable("wishListId") int wishListId)
	   {
		   wishListService.deleteWishListById(wishListId);
		   return "redirect:/wishlist";
	   }	
	
	
	

	

}
