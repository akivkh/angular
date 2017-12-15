package com.niit.collaboration.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Forum {
	@Id
	@GeneratedValue
	int ForumId;
	String ForumName;
	String ForumContent;
	Date CreateDate;
	String Status;
	public int getForumId() {
		return ForumId;
	}
	public void setForumId(int forumId) {
		ForumId = forumId;
	}
	public String getForumName() {
		return ForumName;
	}
	public void setForumName(String forumName) {
		ForumName = forumName;
	}
	public String getForumContent() {
		return ForumContent;
	}
	public void setForumContent(String forumContent) {
		ForumContent = forumContent;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	

}
