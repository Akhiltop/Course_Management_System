package com.cms.usecases;

import java.util.Scanner;

import com.cms.dao.AdminDao;
import com.cms.dao.AdminImpl;
import com.cms.exceptions.AdminException;

public class ViewBatchReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s=new Scanner(System.in);
		
		System.out.println("Enter required batch id");
		
		String str1=s.next();
		
		s.close();
		
		AdminDao ada=new AdminImpl();
		
		try {
			ada.viewReport(str1);
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		
	}

}
