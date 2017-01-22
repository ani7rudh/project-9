package com.electro.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

@Entity
public class Category {
	
	@Id
	@Expose
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryId;
	
	
	@NotNull
	@Pattern(regexp = "^[A-Za-z+]+[0-9+]*$", message = "Name should not start with number")
	@Expose
	private String categoryName;
	
	@NotEmpty
	@Expose
	private String categoryDescription;
	
	
	@OneToMany(mappedBy = "category",fetch=FetchType.EAGER)
	@Expose
    	 private Set<SubCategory> subCategory;


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getCategoryName() {
		return categoryName;
	}

	
	 public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public String getCategoryDescription() {
		return categoryDescription;
	}


	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}


	public Set<SubCategory> getSubCategory() {
		return subCategory;
	}


	public void setSubCategory(Set<SubCategory> subCategory) {
		this.subCategory = subCategory;
	}


		

}
