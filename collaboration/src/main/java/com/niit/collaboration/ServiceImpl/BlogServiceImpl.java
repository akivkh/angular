package com.niit.collaboration.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.collaboration.Dao.BlogDao;
import com.niit.collaboration.Service.BlogService;
import com.niit.collaboration.model.Blog;
@Service
public class BlogServiceImpl implements BlogService{
	private BlogDao blogDao;

	@Override
	public boolean addBlog(Blog blog) {
		return blogDao.addBlog(blog);
	}

	@Override
	public boolean updateBlog(Blog blog) {
		return blogDao.updateBlog(blog);
	}

	@Override
	public boolean deleteBlog(Blog blog) {

		return blogDao.deleteBlog(blog);
	}

	@Override
	public Blog getBlog(int blogId) {
		
		return blogDao.getBlog(blogId);
	}

	@Override
	public List<Blog> getAllBlogs() {
		
		return blogDao.getAllBlogs();
	}

	@Override
	public boolean approveBlog(Blog blog) {
		
		return blogDao.approveBlog(blog);
	}

	@Override
	public boolean rejectBlog(Blog blog) {
		
		return blogDao.rejectBlog(blog);
	}

	@Override
	public boolean incrementLike(Blog blog) {
		
		return blogDao.incrementLike(blog);
	}

}
