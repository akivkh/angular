package com.niit.collaboration.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.collaboration.model.Forum;

public class ForumDaoImpl implements ForumDao {
	
	@Autowired
	SessionFactory sessionFactory;
	@Transactional

	public boolean addForum(Forum forum)
	{
	 try
	 {
		 sessionFactory.getCurrentSession().save(forum);
			return true;
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
		 return false;
	 }
		
	}

	public boolean updateforum(Forum forum)
	{
	  try
	  {
		 sessionFactory.getCurrentSession().saveOrUpdate(forum);
		 return true;
	  }
	  catch(Exception e) {
		  System.out.println("ExceptionOccured::"+e);
		  return false; 
	  }
		
	}
		public boolean deleteforum(Forum forum) {
		try
		{
			sessionFactory.getCurrentSession().delete(forum);
			return true;
			
		}
		catch(Exception e)
		{
			 System.out.println("ExceptionOccured::"+e);
				return false;
		}
	
	}

	public Forum getforum(int forumId) {
		Session session=sessionFactory.openSession();
		Forum forum=(Forum)session.get(Forum.class,forumId);
		session.close();
			return forum;
	}

	public List<Forum> getAllForums() {
		Session session=sessionFactory.openSession();
		List<Forum>forumList=(List<Forum>)session.createQuery("from forum");
		session.close();
		return forumList;
	}

	public boolean approveforum(Forum forum) {
		try
		{
			forum.setStatus("A");
			sessionFactory.getCurrentSession().saveOrUpdate(forum);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured::"+e);
			return false;
		}
	
	}

	@Override
	public boolean rejectforum(Forum forum) {
		try
		{
			forum.setStatus("R");	
			sessionFactory.getCurrentSession().saveOrUpdate(forum);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception occured::"+e);
			return false;
		}
		
	}
}

	