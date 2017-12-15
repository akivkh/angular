package com.niit.collaboration.Service;

import java.util.List;

import com.niit.collaboration.model.Blog;

public interface BlogService {
	public boolean addBlog(Blog blog);
	public boolean updateBlog(Blog blog);
	public boolean deleteBlog(Blog blog);
	public Blog getBlog(int blogId);
	public List<Blog>getAllBlogs();
	public boolean approveBlog(Blog blog);
	public boolean rejectBlog(Blog blog);
	public boolean incrementLike(Blog blog);


}
