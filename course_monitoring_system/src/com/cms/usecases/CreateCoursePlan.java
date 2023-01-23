package com.cms.usecases;

import java.util.Scanner;

import com.cms.dao.AdminDao;
import com.cms.dao.AdminImpl;
import com.cms.exceptions.AdminException;
import com.cms.models.coursePlan;

public class CreateCoursePlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		coursePlan cp=new coursePlan();
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter plan id");
		
		cp.setPlan_id(s.next());
		
		System.out.println("Enter batch id");
		
		cp.setBatchid(s.next());
		
		System.out.println("Enter day number");
		
		cp.setDay_number(s.nextInt());
		
		System.out.println("Enter topic");
		
		cp.setTopic(s.next());
		
		System.out.println("Enter status");
		
		cp.setStatus(s.next());
		
		s.close();
		
		AdminDao ada=new AdminImpl();
		
		try {
			String str1=ada.createCoursePlan(cp);
			
			System.out.println(str1);
			
			
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

}
