package com.cms.usecases;

import java.util.List;

import com.cms.dao.AdminDao;
import com.cms.dao.AdminImpl;
import com.cms.exceptions.AdminException;
import com.cms.models.batch;

public class ViewAllBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	AdminDao ada=new AdminImpl();
	
	try {
		List<batch> lb=ada.viewAllBatches();
		
		lb.forEach(l->System.out.println(l));
		
	} catch (AdminException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	}
	
}
