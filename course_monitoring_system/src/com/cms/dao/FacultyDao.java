package com.cms.dao;

import java.util.List;

import com.cms.exceptions.FacultyException;
import com.cms.models.coursePlan;

public interface FacultyDao {

	//to login the user
	public String loginUser(String user,String pass) throws FacultyException;
	//to view the course plan
	public List<coursePlan> viewAllPlan() throws FacultyException; 
	//to fill day wise planner
	public String fillDayPlan(String sd,String pid,String status) throws FacultyException;
	//to update his/her password
	public String updatePassword(String oldpass,String pass) throws FacultyException;
	
}
