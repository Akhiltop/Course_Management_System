package com.cms.usecases;

import java.util.Scanner;

import com.cms.dao.AdminDao;
import com.cms.dao.AdminImpl;
import com.cms.exceptions.AdminException;

public class AllocateFaculty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter batch id");
		
		String b=s.next();
		
		System.out.println("Enter faculty id");
		
		String c=s.next();
		
		s.close();
		
		AdminDao ada=new AdminImpl();
		
		try {
			String str1=ada.allocateFaculty(b, c);
			System.out.println(str1);
			
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
