package com.cms.dao;

import java.util.List;

import com.cms.exceptions.AdminException;
import com.cms.models.batch;
import com.cms.models.course;
import com.cms.models.coursePlan;
import com.cms.models.faculty;

public interface AdminDao {

	//to login firstly
	public String loginUser(String user,String pass) throws AdminException;
	
	//to create course
	public String createCourse(course c) throws AdminException;
	
	//to update course
	public String updateCourse(course c) throws AdminException;
	
	//to view all courses
	public List<course> viewAllCourse() throws AdminException;
	
	
	//to create batch
	public String createBatch(batch b) throws AdminException;
	
	//to update batch
	public String updateBatch(batch b) throws AdminException;
	
	//to view all batches
	public List<batch> viewAllBatches() throws AdminException;
	
	
	//to create faculty
	public String createFaculty(faculty f) throws AdminException;
	
	//to update faculty
	public String updateFaculty(faculty f) throws AdminException;
	
	//to view all faculty
	public List<faculty> viewAllFaculty() throws AdminException;
	
	
	//to allocate faculty to batch
	public String allocateFaculty(String bid,String fid) throws AdminException;
	
	//to create course plan
	public String createCoursePlan(coursePlan cp) throws AdminException;
	//to update course plan
	public String updatecoursePlan(coursePlan cp) throws AdminException;
	//to view all courses plan
	public List<coursePlan> viewAllPlan() throws AdminException;
	//to view day wise update of every batch
	public void viewDayWiseAll(String dates) throws AdminException;
	//to generate report of every batch
	public void viewReport(String bid) throws AdminException;
	
}
