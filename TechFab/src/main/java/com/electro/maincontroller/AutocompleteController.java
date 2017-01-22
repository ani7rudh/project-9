package com.electro.maincontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.electro.model.Product;
import com.electro.service.ProductService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Controller
public class AutocompleteController {
	
	@Autowired
	ProductService productService;
		
	
	
	@RequestMapping(value = "/getproducts", method = RequestMethod.GET)
	public @ResponseBody
	String getProducts(@RequestParam String productName) {

		return simulateSearchResult(productName);

	}

	private String simulateSearchResult(String productName) {

		List<Product> result=new ArrayList<Product>();
		List<Product> search = productService.getProductList();
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
       String data=null;
		
		// iterate a list and filter by tagName
		for (Product product : search) {
			if (product.getProductName().contains(productName)) {
				result.add(product);
				data=gson.toJson(result);
			}
		}

		return data;
	}

}


