package com.electro.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electro.dao.WishListDAO;
import com.electro.model.CartItem;
import com.electro.model.WishList;

@Repository
public class WishListDAOImpl implements WishListDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public WishListDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

	
	public void addWishList(WishList wishList) {
		sessionFactory.getCurrentSession().saveOrUpdate(wishList);

		
	}

	public List<WishList> getWishList() {
		Session session=sessionFactory.getCurrentSession();
		String hql="from WishList";
		@SuppressWarnings("unchecked")
		List<WishList> wlist=session.createQuery(hql).list();
		return wlist;	}


	public void deleteWishListById(int wishListId) {
		WishList wishListtodelete=new WishList();
		wishListtodelete.setWishListId(wishListId);
		sessionFactory.getCurrentSession().delete(wishListtodelete);
		
		
		
	}

}
