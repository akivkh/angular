package com.niit.collaboration.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaboration.model.UserDetail;

public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory sessionFactory;
   @Transactional
	@Override
	public boolean adduser(UserDetail user) {
		try
		{
			sessionFactory.getCurrentSession().save(user);
			return true;
		}
		catch(Exception e) {
			
		return false;
	}
   }
	@Override
	public boolean updateOnLineStatus(String status, UserDetail user) {
		try
		{
			user.setIsOnline(status);
			sessionFactory.getCurrentSession().update(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

	@Override
	public UserDetail getUser(String username) {
		Session session=sessionFactory.openSession();
		UserDetail user=(UserDetail)session.get(UserDetail.class, username);
		session.close();
		return user;
	}

	@Override
	public boolean checkLogin(UserDetail user) {
		try {
	Session session=sessionFactory.openSession();
	Query query=session.createQuery("from userdetail where username:uname");
	query.setParameter("uname", user.getUsername());
	query.setParameter("passwd", user.getPassword());
	UserDetail userDetail=(UserDetail)query.list().get(0);
	if(userDetail==null)
		return false;
	else
		return true;
	}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public List<UserDetail> getAllUsers() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from userdetail");
		List<UserDetail>listUserDetails=(List<UserDetail>)query.list();
		
		return listUserDetails;
	}
	

}
