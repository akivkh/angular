package com.niit.collaboration.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.collaboration.Dao.UserDao;
import com.niit.collaboration.Service.UserService;
import com.niit.collaboration.model.UserDetail;

@Service
public class UserServiceImpl implements UserService{
	UserDao userDao;

	@Override
	public boolean adduser(UserDetail user) {
		return userDao.adduser(user);
	}

	@Override
	public boolean updateOnLineStatus(String status, UserDetail user) {
		return userDao.updateOnLineStatus(status , user);
	}

	@Override
	public UserDetail getUser(String username) {
		return userDao.getUser(username);
	}

	@Override
	public boolean checkLogin(UserDetail user) {
		return userDao.checkLogin(user);
	}

	@Override
	public List<UserDetail> getAllUsers() {
		return userDao.getAllUsers();
	}

}
