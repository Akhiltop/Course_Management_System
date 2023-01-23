package com.cms.usecases;

import java.util.Scanner;

import com.cms.dao.AdminDao;
import com.cms.dao.AdminImpl;
import com.cms.exceptions.AdminException;
import com.cms.models.batch;

public class CreateBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		batch b=new batch();
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter batch id");
		
		b.setBatch_id(s.next());
	
		System.out.println("Enter course id");
		
		b.setCourseid(s.next());
		
		System.out.println("Enter faculty id");
		
		b.setFacultyid(s.next());
		
		System.out.println("Enter no_of students");
		
		b.setNo_of_students(s.nextInt());
		
		System.out.println("Enter start date");
		
		b.setBatch_start_date(s.next());
		
		System.out.println("Enter duration");
		
		b.setDuration(s.nextInt());
		
		s.close();
		
		AdminDao ada=new AdminImpl();
		
		try {
			String str1=ada.createBatch(b);
			
			System.out.println(str1);
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
		
	}

}
