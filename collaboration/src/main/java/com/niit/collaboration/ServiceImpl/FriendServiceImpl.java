package com.niit.collaboration.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.collaboration.Dao.FriendDao;
import com.niit.collaboration.Service.FriendService;
import com.niit.collaboration.model.Friend;

@Service
public class FriendServiceImpl implements FriendService{
	private FriendDao friendDao;

	@Override
	public boolean createFriend(Friend friend) {
		
		return friendDao.createFriend(friend);
	}

	@Override
	public List<Friend> getAllFriendRequest(String username) {
		
		return friendDao.getAllFriendRequest(username);
	}

	@Override
	public List<Friend> getApprovedFriends(String username) {
		
		return friendDao.getApprovedFriends(username);
	}

	@Override
	public Friend getFriend(int friendid) {
		return friendDao.getFriend(friendid);
	}

	@Override
	public boolean rejectFriendRequest(Friend friend) {
		return friendDao.rejectFriendRequest(friend);
	}

	@Override
	public boolean approveFriendRequest(Friend friend) {
		return friendDao.approveFriendRequest(friend);
	}

}
