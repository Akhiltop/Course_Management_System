package com.cms.usecases;

import java.util.Scanner;

import com.cms.dao.AdminDao;
import com.cms.dao.AdminImpl;
import com.cms.exceptions.AdminException;
import com.cms.models.course;

public class CreateCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		course c=new course();
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter course id");
		
		c.setCourse_id(s.next());
		
		System.out.println("Enter course name");
		
		c.setCourse_name(s.next());
		
		System.out.println("Enter course fee");
		
		c.setCourse_fee(s.nextInt());
		
		System.out.println("Enter course description");
		
		c.setCourse_description(s.next());
		
		s.close();
		
		AdminDao ad=new AdminImpl();
		
		try {
			String str1=ad.createCourse(c);
			System.out.println(str1);
			
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		

	}

}
