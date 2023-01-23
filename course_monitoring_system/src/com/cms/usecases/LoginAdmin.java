package com.cms.usecases;

import java.util.Scanner;

import com.cms.dao.AdminDao;
import com.cms.dao.AdminImpl;
import com.cms.exceptions.AdminException;

public class LoginAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter username");
		
		String user=s.next();
	
		System.out.println("Enter password");
		
		String pass=s.next();
		
		s.close();
		
		AdminDao ad=new AdminImpl();
		
		try {
			String str1=ad.loginUser(user, pass);
			
			System.out.println(str1);
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
		}
		
		
	}

}
