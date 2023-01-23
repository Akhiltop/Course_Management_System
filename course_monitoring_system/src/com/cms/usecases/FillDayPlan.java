package com.cms.usecases;

import java.util.Scanner;

import com.cms.dao.FacultyDao;
import com.cms.dao.FacultyImpl;
import com.cms.exceptions.FacultyException;

public class FillDayPlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter session date");
		
		String sd=s.next();
		
		System.out.println("Enter plan id");
		
		String pid=s.next();
		
		System.out.println("Enter status");
		
		String stats=s.next();
		
		s.close();
		
		FacultyDao fda=new FacultyImpl();
		
		try {
			String str1=fda.fillDayPlan(sd, pid, stats);
			
			System.out.println(str1);
		} catch (FacultyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
