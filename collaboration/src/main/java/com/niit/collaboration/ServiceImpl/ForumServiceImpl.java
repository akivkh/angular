package com.niit.collaboration.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.collaboration.Dao.ForumDao;
import com.niit.collaboration.Service.ForumService;
import com.niit.collaboration.model.Forum;

@Service
public class ForumServiceImpl implements ForumService {
	private ForumDao forumDao;

	@Override
	public boolean addForum(Forum forum) {
	return forumDao.addForum(forum);
	
	}

	@Override
	public boolean updateforum(Forum forum) {
		return forumDao.updateforum(forum);
	}

	@Override
	public boolean deleteforum(Forum forum) {
		return forumDao.deleteforum(forum);
	}

	@Override
	public Forum getforum(int forumId) {
		return forumDao.getforum(forumId);
	}

	@Override
	public List<Forum> getAllForums() {
		return forumDao.getAllForums();
	}

	@Override
	public boolean approveforum(Forum forum) {
		return forumDao.approveforum(forum);
	}

	@Override
	public boolean rejectforum(Forum forum) {
		return forumDao.rejectforum(forum);
	}

}
