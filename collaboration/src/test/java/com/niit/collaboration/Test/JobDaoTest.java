package com.niit.collaboration.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaboration.Dao.JobDao;
import com.niit.collaboration.model.Blog;
import com.niit.collaboration.model.Job;

public class JobDaoTest {
	/*
	static JobDao jobDao;
	
	@BeforeClass
	public static void initialize(){
		{
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.scan("com.niit");
			context.refresh();
			jobDao=(JobDao)context.getBean("jobDao");
		}
	}

	@Test
	public void postJobTest() {
		Job job=new Job();
		job.setJobName("Programer");
		job.setJobDesc("Programing Skill jaava,angulaar js,spring,core java");
		job.setPostedDate(new java.util.Date());
		job.setLastDate(new java.util.Date());
		job.setSalary(20000);
	assertTrue("Problem in Inserting",jobDao.postJob(job));
	}
@Test
public void removePostTest()
{

	Job job=(Job)jobDao.getJob(1001);
	assertTrue("Problem In Removing",jobDao.removeJobPost(job));
}
@Test
public void showAllJobsTest()
{
	List<Job>jobList=(List<Job>)jobDao.showAllJobs();
	{
	assertNotNull("Job List Not Found", jobList.get(0));
	for(Job job:jobList)
	{
		System.out.println("Job Id:"+job.getJobId()+":::"+"Job Name:"+job.getJobName());
	}
	}

	@Test
	public void getJobTest()
	{
		Job job=(Job)jobDao.getJob(1001);
		assertNotNull("Job Not Found", job);
		System.out.println("JobName:"+job.getJobName());
		System.out.println("JobDesc:"+job.getJobDesc());
		
	}
}*/
}
