package com.niit.collaboration.Dao;

import java.util.List;

import com.niit.collaboration.model.UserDetail;

public interface UserDao {
	public boolean adduser(UserDetail user);
	public boolean updateOnLineStatus(String status,UserDetail user);
	public UserDetail getUser(String username);
	public boolean checkLogin(UserDetail user);
	public List<UserDetail>getAllUsers();
	
	

}
