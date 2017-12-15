package com.niit.collaboration.Service;

import java.util.List;

import com.niit.collaboration.model.Job;

public interface JobService {
	public boolean postJob(Job job);
	public boolean removeJobPost(Job job);
	public List<Job>showAllJobs();
	public Job getJob(int jobid);

}
