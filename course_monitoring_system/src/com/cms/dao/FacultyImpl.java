package com.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cms.exceptions.FacultyException;
import com.cms.models.coursePlan;
import com.cms.utility.DButil;

public class FacultyImpl implements FacultyDao{

	@Override
	public String loginUser(String user, String pass) throws FacultyException {
		// TODO Auto-generated method stub
		String str="Login unsuccessful";
		
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from faculty where username=? and password=?");
			ps.setString(1, user);
			ps.setString(2, pass);
			
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
			str="login successful";
			
			
			}else {throw new FacultyException("Incorrect username or password");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new FacultyException(e.getMessage());
		}
		
		
		return str;
	}

	@Override
	public List<coursePlan> viewAllPlan() throws FacultyException {
		// TODO Auto-generated method stub
		List<coursePlan> lc=new ArrayList<>();
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from course_plan");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
			
			
			lc.add(new coursePlan(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5)));	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new FacultyException(e.getMessage());
		}
		
		return lc;
		
	}

	@Override
	public String fillDayPlan(String sd, String pid, String status) throws FacultyException {
		// TODO Auto-generated method stub
String str="Filling day plan unsuccessful";
		
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into Day_wise_planner(session_date,planid,session_status) values(?,?,?);");
			ps.setString(1, sd);
			ps.setString(2, pid);
			ps.setString(3, status);
			
			
			
			int x=ps.executeUpdate();
			if(x>0) {
			str="Filling day plan successful";
			
			
			}else {throw new FacultyException("Incorrect plan details");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new FacultyException(e.getMessage());
		}
		
		
		return str;
	}

	@Override
	public String updatePassword(String oldpass,String pass) throws FacultyException {
		// TODO Auto-generated method stub
String str="Password update unsuccessful";
		
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update faculty set password=? where password=?;");
			ps.setString(1, pass);
			ps.setString(2, oldpass);
			

			
			int x=ps.executeUpdate();
			if(x>0) {
			str="Password updated successfully";
			
			
			}else {throw new FacultyException("Improper password details");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new FacultyException(e.getMessage());
		}
		
		
		return str;
	}

}
