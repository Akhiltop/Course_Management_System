package com.cms.mainapp;

import java.util.Scanner;



public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
			
			System.out.println("_________Welcome___________");
			System.out.println("_Course_Monitoring_System__");
			System.out.println("__Firstly_login_using_any__");
			System.out.println("______1_Admin_Login________");
			System.out.println("_____2_Faculty_Login_______");
			System.out.println("");
			System.out.println("____Enter_your_option______");
			
			Scanner sn=new Scanner(System.in);
			int i=sn.nextInt();
			
			if(i==1) {System.out.println("Dear_Admin");	
			}
			else if(i==2) {System.out.println("Dear_Faculty");}
			else {System.out.println("redirecting to back..");};
			
		sn.close();
	
	}

}
