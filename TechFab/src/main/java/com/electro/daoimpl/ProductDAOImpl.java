package com.electro.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.electro.dao.ProductDAO;
import com.electro.model.Product;
import com.electro.model.ViewProduct;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ProductDAOImpl implements ProductDAO{
	@Autowired
	SessionFactory sessionFactory;

	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	

	public void addProduct(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		
	}

	public List<Product> getProductList() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Product";
		@SuppressWarnings("unchecked")
		List<Product> plist=session.createQuery(hql).list();
		return plist;	}

	public Product getProductById(int productId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Product where productId="+productId;
		@SuppressWarnings("unchecked")
		List<Product> plist=session.createQuery(hql).list();
		return plist.get(0);

	}


	public void deleteProduct(int productId) {
		Product producttodelete=new Product();
		producttodelete.setProductId(productId);
		sessionFactory.getCurrentSession().delete(producttodelete);
	}


	public String getJsonList() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from Product";
		@SuppressWarnings("unchecked")
		List<Product> plist=session.createQuery(hql).list();
//		Gson gson=new Gson();
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

		String jsonList=gson.toJson(plist);
		
		return jsonList;
		
	}
	
	public ViewProduct getViewProductById(int productId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from ViewProduct where productId="+productId;
		@SuppressWarnings("unchecked")
		List<ViewProduct> vplist=session.createQuery(hql).list();
		return vplist.get(0);

	}

		
	public void updateQuantity1(int productId,int quantity)
	{
		
		String hql="update Product set productQuantity=productQuantity-"+quantity+" where productId="+productId;
		System.out.println(productId+""+quantity);
		sessionFactory.getCurrentSession().createQuery(hql).executeUpdate();

	}


	
	

}
