package com.electro.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electro.dao.CartItemDAO;
import com.electro.model.CartItem;
import com.electro.model.Category;
import com.electro.model.WishList;

@Repository

public class CartItemDAOImpl implements CartItemDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public CartItemDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}


	public void addCartItem(CartItem cartItem) {
		sessionFactory.getCurrentSession().saveOrUpdate(cartItem);

	}
	
public CartItem getCartListById(int cartItemId) {
		
		Session session=sessionFactory.getCurrentSession();
		String hql="from CartItem where cartItemId="+cartItemId;
		@SuppressWarnings("unchecked")
		List<CartItem> cilist=session.createQuery(hql).list();
		return cilist.get(0);
	}
	
	
public void updateFlag(int cartItemId)
{
	
	String hql="update CartItem set flag=true where cartItemId="+cartItemId;
	
	sessionFactory.getCurrentSession().createQuery(hql).executeUpdate();

}




public List<CartItem> getCartList(int userId) 
{
	Session session=sessionFactory.getCurrentSession();
	String hql="from CartItem where userId="+userId;
	@SuppressWarnings("unchecked")
	List<CartItem> clist=session.createQuery(hql).list();
	return clist;	
	}


public void deleteCartItemById(int cartItemId) {
	
		CartItem cartitemtodelete=new CartItem();
		cartitemtodelete.setCartItemId(cartItemId);
		sessionFactory.getCurrentSession().delete(cartitemtodelete);
		
}


}


	



