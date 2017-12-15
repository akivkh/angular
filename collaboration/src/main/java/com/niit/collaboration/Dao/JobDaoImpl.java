package com.niit.collaboration.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaboration.model.Forum;
import com.niit.collaboration.model.Job;

public class JobDaoImpl implements JobDao{
	@Autowired
	SessionFactory sessionFactory;
	
    @Transactional
	@Override
	public boolean postJob(Job job) {
		try
		{
			sessionFactory.getCurrentSession().save(job);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}

	}
    
	@Override
	public boolean removeJobPost(Job job) {
		try
		{
		sessionFactory.getCurrentSession().delete(job);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public List<Job> showAllJobs() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Job");
		List<Job>listJobs=(List<Job>)query.list();
		session.close();
		return listJobs;
	}

public Job getJob(int jobid) {
	Session session=sessionFactory.openSession();
	Job job=(Job)session.get(Job.class,jobid);
	session.close();
		return job;

}
	

}
