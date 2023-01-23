package com.cms.usecases;

import java.util.List;

import com.cms.dao.FacultyDao;
import com.cms.dao.FacultyImpl;
import com.cms.exceptions.FacultyException;
import com.cms.models.coursePlan;

public class ViewAllPlanF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FacultyDao fda=new FacultyImpl();
		
		try {
			List<coursePlan> lcp=fda.viewAllPlan();
			
			lcp.forEach(l->System.out.println(l));
		} catch (FacultyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
