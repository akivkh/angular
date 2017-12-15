package com.niit.collaboration.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaboration.Dao.BlogDao;
import com.niit.collaboration.model.Blog;

public class BlogDaoTest {
	static BlogDao blogDao;

	@BeforeClass
	public static void initialize(){
		{
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.scan("com.niit");
			context.refresh();
			blogDao=(BlogDao)context.getBean("blogDao");
		}
	}
	@Test
	public void addBlogTest() {
		Blog blog=new Blog();
		blog.setBlogName("Core Java");
		blog.setBlogContent("It is a Simple Java Concept");
		blog.setUserName("Akiv");
		blog.setStatus("A");
		blog.setLikes(3);
		blog.setCreationDate(new Date());
		assertTrue("Problem in Inserting Blog",blogDao.addBlog(blog));
	}

	@Test
	public void getBlogTest()
	{
		Blog blog=blogDao.getBlog(1001);
		assertNotNull("Blog Not Found", blog);
		System.out.println("BlogName:"+blog.getBlogName());
		System.out.println("BlogContent:"+blog.getBlogContent());
	}
	@Test
	public void getAllBlogTest()
	{
		List<Blog>blogList=(List<Blog>)blogDao.getAllBlogs();
		{
		assertNotNull("Blog List Not Found", blogList.get(0));
		for(Blog blog:blogList)
		{
			System.out.println("Blog Id:"+blog.getBlogId()+":::"+"Blog Name:"+blog.getBlogName());
		}
		}
	}
	@Test
	public void deleteBlogTest() 
	{
		Blog blog=(Blog)blogDao.getBlog(1002);
		assertTrue("Problem In Deletion",blogDao.deleteBlog(blog));
	}
	@Test
	public void updateBlogTest() {
		Blog blog=(Blog)blogDao.getBlog(1001);
		blog.setBlogContent("OOPS-Exception-Thread-IO-NIO-Localization");
		blog.setBlogName("Apple Java");
		assertTrue("Problem in Updating",blogDao.updateBlog(blog));
		}
	@Test
	public void approveBlogTest() {
		Blog blog=(Blog)blogDao.getBlog(1001);
		assertTrue("Problem in Approving",blogDao.approveBlog(blog));
	}
}

