package com.niit.collaboration.Test;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.Temporal;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaboration.Dao.BlogDao;
import com.niit.collaboration.Dao.FriendDao;
import com.niit.collaboration.model.Friend;

public class FriendDaoTest {
	static FriendDao friendDao;

	@BeforeClass
	public static void initialize(){
		{
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.scan("com.niit");
			context.refresh();
			friendDao=(FriendDao)context.getBean("friendDao");
		}
	}
	@Test
	public void createFriend()
	{
		Friend friend=new Friend();
		friend.setFriendname("khan");
		friend.setUsername("akiv");
		friend.setStatus("R");
		assertTrue("Problem in Friend Request",friendDao.createFriend(friend));
	}
	@Test
	public void getAllFriendRequest()
	{
		List<Friend> listFriends=friendDao.getAllFriendRequest("Akiv");
		assertNotNull("Problem in List Friend",listFriends);
		for(Friend friend:listFriends)
		{
			System.out.println("Current User Name:"+friend.getUsername());
			System.out.println("Friend Name:"+friend.getFriendname());
			System.out.println("Status:"+friend.getStatus());
		}
	}
	
	@Test
	public void approvedFriendRequest()
	{
		Friend friend=friendDao.getFriend(42);
	assertTrue("Problem in Approving",friendDao.approveFriendRequest(friend));
	}
	
	@Test
	public void rejectFriendRequest()
	{
		Friend friend=friendDao.getFriend(41);
	assertTrue("Problem in Rejecting",friendDao.approveFriendRequest(friend));
	}
}


