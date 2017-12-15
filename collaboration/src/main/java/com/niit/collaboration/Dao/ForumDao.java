package com.niit.collaboration.Dao;

import java.util.List;

import com.niit.collaboration.model.Forum;



public interface ForumDao {

	public boolean addForum(Forum forum);
	public boolean updateforum(Forum forum);
	public boolean deleteforum(Forum forum);
	public Forum getforum(int forumId);
	public List<Forum>getAllForums();
	public boolean approveforum(Forum forum);
	public boolean rejectforum(Forum forum);
}
