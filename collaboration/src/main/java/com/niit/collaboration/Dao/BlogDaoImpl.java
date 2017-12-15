package com.niit.collaboration.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaboration.model.Blog;

public class BlogDaoImpl implements BlogDao {
	@Autowired
	SessionFactory sessionFactory;
	@Transactional

	@Override
	public boolean addBlog(Blog blog) {
		try 
	{
		sessionFactory.getCurrentSession().save(blog);
				return true;
	}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
}

 
	@Override
	public boolean updateBlog(Blog blog) {
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("ExceptionOccured::"+e);
			return false;
		}

		}

	@Override
	public boolean deleteBlog(Blog blog) {
		try
		{
			sessionFactory.getCurrentSession().delete(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("ExceptionOccured::"+e);
			return false;
		}
		
	}


	@Override
	public Blog getBlog(int blogId) {
		Session session=sessionFactory.openSession();
		Blog blog=(Blog)session.get(Blog.class, blogId);
		session.close();
			return blog;
		}


	@Override
	public List<Blog> getAllBlogs()  {
		Session session=sessionFactory.openSession();
		List<Blog>blogList=(List<Blog>)session.createQuery("from blog");
		session.close();
		return blogList;
	}

	@Override
	public boolean approveBlog(Blog blog){
		try
		{
			blog.setStatus("A");
			sessionFactory.getCurrentSession().saveOrUpdate(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured::"+e);
			return false;
		}
	
		
	}

	@Override
	public boolean rejectBlog(Blog blog) {
		try
		{
			blog.setStatus("R");
			sessionFactory.getCurrentSession().saveOrUpdate(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured::"+e);
			return false;
		}
	
	}

	@Override
	public boolean incrementLike(Blog blog) 
	{
		try
		{
			blog.setLikes(blog.getLikes()+1);
			sessionFactory.getCurrentSession().update(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception occured:"+e);
			return false;
		}
	}
	}
