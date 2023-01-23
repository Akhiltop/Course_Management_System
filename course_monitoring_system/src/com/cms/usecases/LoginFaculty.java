package com.cms.usecases;

import java.util.Scanner;

import com.cms.dao.FacultyDao;
import com.cms.dao.FacultyImpl;
import com.cms.exceptions.FacultyException;

public class LoginFaculty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter faculty username");
		
		String user=s.next();
		
		System.out.println("Enter faculty password");

		String pass=s.next();
		
		s.close();
		
		FacultyDao fda=new FacultyImpl();
		
		try {
			String str1=fda.loginUser(user, pass);
			
			System.out.println(str1);
		} catch (FacultyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

}
