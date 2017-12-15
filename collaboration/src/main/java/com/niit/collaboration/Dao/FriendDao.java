package com.niit.collaboration.Dao;

import java.util.List;

import com.niit.collaboration.model.Friend;

public interface FriendDao 
{
	public boolean createFriend(Friend friend);
	public List<Friend> getAllFriendRequest(String username);
	public List<Friend> getApprovedFriends(String username);
	public Friend getFriend(int friendid);
	public boolean rejectFriendRequest(Friend friend);
	public boolean approveFriendRequest(Friend friend);
	
	
	

}
