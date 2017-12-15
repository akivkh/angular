package com.niit.collaboration.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaboration.Dao.ForumDao;
import com.niit.collaboration.Dao.FriendDao;
import com.niit.collaboration.model.Blog;
import com.niit.collaboration.model.Forum;

public class ForumDaoTest {
	/*
	static ForumDao forumDao;
	@BeforeClass
	public static void initialize(){
		{
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.scan("com.niit");
			context.refresh();
			forumDao=(ForumDao)context.getBean("forumDao");
		}
	}

	@Test
	public void addForumTest() {
   Forum forum=new Forum();
   forum.setForumName("Google");
   forum.setForumContent("This is for searching");;
   forum.getCreateDate();
   forum.setStatus("A");
   assertTrue("Problem in Inserting",forumDao.addForum(forum));
  
	}
	@Test
	public void deleteForumTest() 
	{
		Forum forum=(Forum)forumDao.getforum(100);
		assertTrue("Problem In Deletion",forumDao.deleteforum(forum));
	}
	@Test
	public void updateforumTest() {
		Forum forum=(Forum)forumDao.getforum(1001);
		forum.setForumContent("");
		forum.setForumName("");
		assertTrue("Problem in Updating",forumDao.updateforum(forum));
		}
	@Test
	public void getForumTest(int forumId)
	{
		Forum forum=forumDao.getforum(forumId);
		assertNotNull("Forum Not Found", forum);
		System.out.println("ForumName:"+forum.getForumName());
		System.out.println("ForumContent:"+forum.getForumContent());
	}
	@Test
	public void getAllBlogTest()
	{
		List<Forum>forumList=(List<Forum>)forumDao.getAllForums();
		{
		assertNotNull("Forum List Not Found", forumList.get(0));
		for(Forum forum:forumList)
		{
			System.out.println("Forum Id:"+forum.getForumId()+":::"+"Forum Name:"+forum.getForumName());
		}
		}
		@Test
		public void approveForumTest()
		{
			Forum forum=(Forum)forumDao.getforum(100);
			assertTrue("Problem in Approving",forumDao.approveforum(forum));
			System.out.println("ForumName:"+forum.getForumName());
			System.out.println("ForumContent:"+forum.getForumName());
		}
	}*/
}
