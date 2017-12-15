package com.niit.collaboration.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.collaboration.Dao.JobDao;
import com.niit.collaboration.Service.JobService;
import com.niit.collaboration.model.Job;

@Service
public class JobServiceImpl implements JobService{
    private JobDao jobDao;
	@Override
	public boolean postJob(Job job) {
		return jobDao.postJob(job);
	}

	@Override
	public boolean removeJobPost(Job job) {
		return jobDao.removeJobPost(job);
	}

	@Override
	public List<Job> showAllJobs() {
		return jobDao.showAllJobs();
	}

	@Override
	public Job getJob(int jobid) {
		return jobDao.getJob(jobid);
	}

}
