package com.niit.collaboration.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.collaboration.model.Friend;

@Repository("friendDao")
public class FriendDaoImpl implements FriendDao{

	@Autowired
	SessionFactory sessionFactory;
	public FriendDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Override
	public boolean createFriend(Friend friend) {
		try {
			sessionFactory.getCurrentSession().save(friend);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Friend> getAllFriendRequest(String username) {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from friend where username=:uname");
		query.setParameter("uname", username);
		List<Friend> listFriends=query.list();
		session.close();
		return listFriends;
	}

	@Override
	public List<Friend> getApprovedFriends(String username) {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from friend where username=:uname");
		query.setParameter("uname", username);
		List<Friend> listFriends=query.list();
		session.close();
		return listFriends;
	}

	@Override
	public Friend getFriend(int friendid) {
		Session session=sessionFactory.openSession();
		Friend friend=(Friend)session.get(Friend.class, friendid);
		return friend;
	}

	@Override
	public boolean rejectFriendRequest(Friend friend) {
		try
		{
			friend.setStatus("R");
			sessionFactory.getCurrentSession().update(friend);
		    return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	

	@Override
	public boolean approveFriendRequest(Friend friend) {
		try
		{
			friend.setStatus("A");
			sessionFactory.getCurrentSession().update(friend);
		    return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	

}
