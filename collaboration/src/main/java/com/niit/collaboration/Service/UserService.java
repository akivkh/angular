package com.niit.collaboration.Service;

import java.util.List;

import com.niit.collaboration.model.UserDetail;

public interface UserService {
	public boolean adduser(UserDetail user);
	public boolean updateOnLineStatus(String status,UserDetail user);
	public UserDetail getUser(String username);
	public boolean checkLogin(UserDetail user);
	public List<UserDetail>getAllUsers();

}
