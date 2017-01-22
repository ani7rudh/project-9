package com.electro.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class ProductDetails {
	
	@Id
	private int productId;
	private String productName;

	private String productDescription;
	private int productQuantity;
	private float productPrice;
    private int productDiscount;
    @Transient
    MultipartFile productImage1;
    @Transient
    MultipartFile productImage2;
    @Transient
    MultipartFile productImage3;
    @Transient
    MultipartFile productImage4;
    
    
    @OneToOne
	@JoinColumn(name="productId",updatable=false,insertable=false,nullable=false)
	private Product product;


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public int getProductQuantity() {
		return productQuantity;
	}


	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}


	public float getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}


	public int getProductDiscount() {
		return productDiscount;
	}


	public void setProductDiscount(int productDiscount) {
		this.productDiscount = productDiscount;
	}


	public MultipartFile getProductImage1() {
		return productImage1;
	}


	public void setProductImage1(MultipartFile productImage1) {
		this.productImage1 = productImage1;
	}


	public MultipartFile getProductImage2() {
		return productImage2;
	}


	public void setProductImage2(MultipartFile productImage2) {
		this.productImage2 = productImage2;
	}


	public MultipartFile getProductImage3() {
		return productImage3;
	}


	public void setProductImage3(MultipartFile productImage3) {
		this.productImage3 = productImage3;
	}


	public MultipartFile getProductImage4() {
		return productImage4;
	}


	public void setProductImage4(MultipartFile productImage4) {
		this.productImage4 = productImage4;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}
    
	   
    
	    
   

}
