package com.cms.usecases;

import java.util.Scanner;

import com.cms.dao.AdminDao;
import com.cms.dao.AdminImpl;
import com.cms.exceptions.AdminException;
import com.cms.models.faculty;

public class UpdateFaculty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
faculty f=new faculty();
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter faculty id");
		
		f.setFaculty_id(s.next());
		
		System.out.println("Enter updated faculty name");
		
		f.setFaculty_name(s.next());
		
		System.out.println("Enter updated faculty address");
		
		f.setFaculty_address(s.next());
		
		System.out.println("Enter updated faculty mobile");
		
		f.setMobile(s.next());
		
		System.out.println("Enter updated faculty email");
		
		f.setEmail(s.next());
		
		System.out.println("Enter updated faculty username");
		
		f.setUsername(s.next());
		
		System.out.println("Enter updated faculty password");
		
		f.setPassword(s.next());
		
		s.close();
		
		AdminDao ada=new AdminImpl();
		
		try {
			String str1=ada.updateFaculty(f);
			System.out.println(str1);
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		
		

	}

}
