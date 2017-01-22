package com.electro.maincontroller;


import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.electro.model.CartItem;
import com.electro.model.Product;
import com.electro.service.CartItemService;
import com.electro.service.ProductService;
import com.electro.service.UserDetailsService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Controller

public class CartItemController {
	
	@Autowired
	CartItemService cartItemService;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	ProductService productService;
	
	
	
	@RequestMapping(value = "buynow-{productId}")
	   public String buyNow(@PathVariable("productId") int productId,@ModelAttribute("cartItem") CartItem cartItem,Model model,@RequestParam("userId")int userId,HttpSession httpSession)
	{
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		String userName=auth.getName();
		userId=userDetailsService.getUserByName(userName).getUserId();
		cartItem.setCartId(userId);
		cartItem.setUserId(userId);
		cartItem.setProductId(productId);
		
		String productName=productService.getProductById(productId).getProductName();
		cartItem.setProductName(productName);
		String productDescription=productService.getProductById(productId).getProductDescription();
		cartItem.setProductDescription(productDescription);
		
		
		float productPrice=productService.getProductById(productId).getProductPrice();
		cartItem.setProductPrice(productPrice);
		
		int productDiscount=productService.getProductById(productId).getProductDiscount();
		cartItem.setProductDiscount(productDiscount);;
		
		cartItem.setFlag(false);
		cartItem.setProductQuantity(1);
		cartItemService.addCartItem(cartItem);
		productService.updateQuantity1(productId, cartItem.getProductQuantity());

		httpSession.setAttribute("cartItemId", cartItem.getCartItemId());
		int cartItemId=(Integer)httpSession.getAttribute("cartItemId");

	      return "redirect:/cartlist-"+cartItemId;

	}
	   
	
	@RequestMapping(value = "cartlist-{cartItemId}")
	   public String cartList(Model model,HttpSession httpSession)
	{
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		String userName=auth.getName();
      
      int userId=userDetailsService.getUserByName(userName).getUserId();
      httpSession.setAttribute("userId", userId);
		int cartItemId=(Integer)httpSession.getAttribute("cartItemId");

      
		   Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		   String cartList=gson.toJson(cartItemService.getCartListById(cartItemId));
		   model.addAttribute("cartList", cartList);
		  
	
	
	
            return "CartList";
}
	
	@RequestMapping(value = "checkout")
	public String checkout(@RequestParam("userId")int userId,HttpSession httpSession,Model model)
	
	{
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		String userName=auth.getName();
		userId=userDetailsService.getUserByName(userName).getUserId();
		httpSession.setAttribute("userId", userId);
      
	
	return "redirect:/cart?userId="+userId;
	
}
	
	
	
	
	@RequestMapping(value = "addtocart-{productId}")
	   public String addToCart(@PathVariable("productId") int productId,@ModelAttribute("cartItem") CartItem cartItem,Model model,@RequestParam("userId")int userId,HttpSession httpSession)
	{
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		String userName=auth.getName();
		userId=userDetailsService.getUserByName(userName).getUserId();
		cartItem.setCartId(userId);
		cartItem.setUserId(userId);
		cartItem.setProductId(productId);
		
		String productName=productService.getProductById(productId).getProductName();
		cartItem.setProductName(productName);
		String productDescription=productService.getProductById(productId).getProductDescription();
		cartItem.setProductDescription(productDescription);
		
		
		float productPrice=productService.getProductById(productId).getProductPrice();
		cartItem.setProductPrice(productPrice);
		
		int productDiscount=productService.getProductById(productId).getProductDiscount();
		cartItem.setProductDiscount(productDiscount);;
		
		cartItem.setFlag(false);
		System.out.println(cartItem.getCartItemId());
		
		cartItemService.addCartItem(cartItem);
		productService.updateQuantity1(productId, cartItem.getProductQuantity());

		httpSession.setAttribute("cartItemId", cartItem.getCartItemId());
		int cartItemId=(Integer)httpSession.getAttribute("cartItemId");

	      return "redirect:/addcart-"+cartItemId;

	}
	   
	
	@RequestMapping(value = "addcart-{cartItemId}")
	   public String addToCartList(Model model,HttpSession httpSession)
	{
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		String userName=auth.getName();
   
   int userId=userDetailsService.getUserByName(userName).getUserId();
   httpSession.setAttribute("userId", userId);
		int cartItemId=(Integer)httpSession.getAttribute("cartItemId");

   
		   Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		   String cartList=gson.toJson(cartItemService.getCartList(userId));
		   model.addAttribute("cartList", cartList);
		  
	
	
	
         return "Addtocart";
}

	
	 @RequestMapping(value="deleteCartItem-{cartItemId}")
	   public String deleteCategory(@PathVariable("cartItemId") int cartItemId)
	   {
		   cartItemService.deleteCartItemById(cartItemId);
		   return "redirect:/addcart-"+cartItemId;
	   }	
	
	
	
	
	
	
	

}