package com.electro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.electro.daoimpl.ProductDAOImpl;
import com.electro.model.Product;
import com.electro.model.ViewProduct;
@Service
@Transactional

public class ProductService {
	@Autowired
	ProductDAOImpl productDAOImpl;
	
	public void addProduct(Product product)
	{
		productDAOImpl.addProduct(product);
	}
	public List<Product> getProductList()
	{
		return productDAOImpl.getProductList();
	}
	public Product getProductById(int productId)
	{
		return productDAOImpl.getProductById(productId);
	}
	
	public void deleteProduct(int productId)
	{
		productDAOImpl.deleteProduct(productId);
	}

	public String getJsonList()
	{
		return productDAOImpl.getJsonList();
	}

	public ViewProduct getViewProductById(int productId) {
		
		return productDAOImpl.getViewProductById(productId);
	}
	
	

	public void updateQuantity1(int productId,int quantity)
	{
		productDAOImpl.updateQuantity1(productId, quantity);
	}
}
