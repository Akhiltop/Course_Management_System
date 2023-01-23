package com.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cms.exceptions.AdminException;
import com.cms.models.batch;
import com.cms.models.course;
import com.cms.models.coursePlan;
import com.cms.models.faculty;
import com.cms.utility.DButil;

public class AdminImpl implements AdminDao{

	@Override
	public String loginUser(String user, String pass) throws AdminException {
		// TODO Auto-generated method stub
		String str="Login unsuccessful";
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from administration_details where username=? and password=?");
			ps.setString(1, user);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				str="Login successful";
			}else {throw new AdminException("Incorrect login details");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new AdminException(e.getMessage());
		}
		return str;
	}

	@Override
	public String createCourse(course c) throws AdminException {
		// TODO Auto-generated method stub
		String str="Course creation unsuccessful";
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into course(course_id,course_name,course_fee,course_description) values(?,?,?,?);");
			ps.setString(1, c.getCourse_id());
			ps.setString(2, c.getCourse_name());
			ps.setInt(3, c.getCourse_fee());
			ps.setString(4,c.getCourse_description());
			int x=ps.executeUpdate();
			if(x>0) {
				str="Course creation successful";
			}else {throw new AdminException("Improper course details");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new AdminException(e.getMessage());
		}
		return str;
	}

	@Override
	public String updateCourse(course c) throws AdminException {
		// TODO Auto-generated method stub
		String str="Course update unsuccessful";
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update course set course_name=?,course_fee=?,course_description=? where course_id=?;");
			
			ps.setString(1, c.getCourse_name());
			ps.setInt(2, c.getCourse_fee());
			ps.setString(3,c.getCourse_description());
			ps.setString(4, c.getCourse_id());
			int x=ps.executeUpdate();
			if(x>0) {
				str="Course updated successfully";
			}else {throw new AdminException("Improper course update details");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new AdminException(e.getMessage());
		}
		return str;
	}

	@Override
	public List<course> viewAllCourse() throws AdminException {
		// TODO Auto-generated method stub
		List<course> lc=new ArrayList<>();
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from course");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
			
			String course_id=rs.getString(1);
			String course_name=rs.getString(2);
			int course_fee=rs.getInt(3);
			String course_description=rs.getString(4);
			lc.add(new course(course_id,course_name,course_fee,course_description));	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new AdminException(e.getMessage());
		}
		
		return lc;
	}

	@Override
	public String createBatch(batch b) throws AdminException {
		// TODO Auto-generated method stub
		String str="Batch creation unsuccessful";
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into batch(batch_id,courseid,facultyid,no_of_students,batch_start_date,duration) values(?,?,?,?,?,?);");
			ps.setString(1,b.getBatch_id());
			ps.setString(2,b.getCourseid());
			ps.setString(3,b.getFacultyid());
			ps.setInt(4,b.getNo_of_students());
			ps.setString(5,b.getBatch_start_date());
			ps.setInt(6,b.getDuration());
			
			
			
			int x=ps.executeUpdate();
			if(x>0) {
				str="Batch creation successful";
			}else {throw new AdminException("Improper batch details");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new AdminException(e.getMessage());
		}
		return str;
	}

	@Override
	public String updateBatch(batch b) throws AdminException {
		// TODO Auto-generated method stub
		String str="Batch update unsuccessful";
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update batch set courseid=?,facultyid=?,no_of_students=?,batch_start_date=?,duration=? where batch_id=?;");
			
			
			ps.setString(1,b.getCourseid());
			ps.setString(2,b.getFacultyid());
			ps.setInt(3,b.getNo_of_students());
			ps.setString(4,b.getBatch_start_date());
			ps.setInt(5,b.getDuration());
			ps.setString(6,b.getBatch_id());
			
			int x=ps.executeUpdate();
			if(x>0) {
				str="Batch updated successfully";
			}else {throw new AdminException("Improper batch update details");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new AdminException(e.getMessage());
		}
		return str;
	}

	@Override
	public List<batch> viewAllBatches() throws AdminException{
		// TODO Auto-generated method stub
		List<batch> lc=new ArrayList<>();
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from batch");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
			
			
			lc.add(new batch(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6)));	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new AdminException(e.getMessage());
		}
		
		return lc;

	}

	@Override
	public String createFaculty(faculty f) throws AdminException {
		// TODO Auto-generated method stub
		String str="Faculty creation unsuccessful";
		try(Connection conn=DButil.provideConnection()){
PreparedStatement ps=conn.prepareStatement("insert into faculty(faculty_id,faculty_name,faculty_address,mobile,email,username,password) values(?,?,?,?,?,?,?);");
			ps.setString(1,f.getFaculty_id());
			ps.setString(2,f.getFaculty_name());
			ps.setString(3,f.getFaculty_address());
			ps.setString(4,f.getMobile());
			ps.setString(5,f.getEmail());
			ps.setString(6,f.getUsername());
			ps.setString(7,f.getPassword());
			int x=ps.executeUpdate();
			if(x>0) {
				str="Faculty creation successful";
			}else {throw new AdminException("Improper faculty details");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new AdminException(e.getMessage());
		}
		return str;
	}

	@Override
	public String updateFaculty(faculty f) throws AdminException {
		// TODO Auto-generated method stub
		String str="Faculty update unsuccessful";
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update faculty set faculty_name=?,faculty_address=?,mobile=?,email=?,username=?,password=? where faculty_id=?;");
			
			
			ps.setString(1,f.getFaculty_name());
			ps.setString(2,f.getFaculty_address());
			ps.setString(3,f.getMobile());
			ps.setString(4,f.getEmail());
			ps.setString(5,f.getUsername());
			ps.setString(6,f.getPassword());
			ps.setString(7,f.getFaculty_id());
			int x=ps.executeUpdate();
			if(x>0) {
				str="Faculty updated successfully";
			}else {throw new AdminException("Improper faculty update details");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new AdminException(e.getMessage());
		}
		return str;
	}

	@Override
	public List<faculty> viewAllFaculty() throws AdminException {
		// TODO Auto-generated method stub
		List<faculty> lc=new ArrayList<>();
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from faculty;");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				
				
				lc.add(new faculty(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new AdminException(e.getMessage());
		}
		
		return lc;
	}

	@Override
	public String allocateFaculty(String bid, String fid) throws AdminException {
		// TODO Auto-generated method stub
		String str="Allocate faculty unsuccessful";
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update batch set facultyid=? where batch_id=?;");
			
			
			
			ps.setString(1,fid);
			ps.setString(2,bid);
			
			int x=ps.executeUpdate();
			if(x>0) {
				str="Faculty allocated successfully";
			}else {throw new AdminException("Improper batch or faculty details");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new AdminException(e.getMessage());
		}
		return str;
	}

	@Override
	public String createCoursePlan(coursePlan cp) throws AdminException {
		// TODO Auto-generated method stub
		String str="Course plan creation unsuccessful";
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into course_plan(plan_id,batchid,day_number,topic,status) values(?,?,?,?,?);");
			
			ps.setString(1, cp.getPlan_id());
			ps.setString(2, cp.getBatchid());
			ps.setInt(3, cp.getDay_number());
			ps.setString(4, cp.getTopic());
			ps.setString(5, cp.getStatus());
			
			
			int x=ps.executeUpdate();
			if(x>0) {
				str="Course plan creation successful";
			}else {throw new AdminException("Improper course plan details");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new AdminException(e.getMessage());
		}
		return str;
	}

	@Override
	public String updatecoursePlan(coursePlan cp) throws AdminException {
		// TODO Auto-generated method stub
		String str="Course plan update unsuccessful";
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update course_plan set batchid=?,day_number=?,topic=?,status=? where plan_id=?;");
			
			
			ps.setString(1, cp.getBatchid());
			ps.setInt(2, cp.getDay_number());
			ps.setString(3, cp.getTopic());
			ps.setString(4, cp.getStatus());
			ps.setString(5, cp.getPlan_id());
			
			int x=ps.executeUpdate();
			if(x>0) {
				str="Course plan updated successfully";
			}else {throw new AdminException("Improper course plan update details");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new AdminException(e.getMessage());
		}
		return str;
	}

	@Override
	public List<coursePlan> viewAllPlan() throws AdminException {
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
			throw new AdminException(e.getMessage());
		}
		
		return lc;
	}

	@Override
	public void viewDayWiseAll(String dates) throws AdminException {
		// TODO Auto-generated method stub
		
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select cp.*,dw.* from course_plan cp inner join Day_wise_planner dw on dw.planid=cp.plan_id and dw.session_date=?");
			ps.setString(1, dates);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
			
			System.out.println("Plan_id: "+rs.getString(1)+" Batch_id: "+rs.getString(2)+" day_number: "+rs.getInt(3)+" topic: "+rs.getString(4)+" status: "+rs.getString(8));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new AdminException(e.getMessage());
		}
		
		
	}

	@Override
	public void viewReport(String bid) throws AdminException{
		// TODO Auto-generated method stub
		
		try(Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select cp.*,dw.* from course_plan cp left join Day_wise_planner dw on dw.planid=cp.plan_id and cp.batchid=?");
			ps.setString(1, bid);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
			
			System.out.println("Plan_id: "+rs.getString(1)+" session_date: "+rs.getString(6)+" day_number: "+rs.getInt(3)+" topic: "+rs.getString(4)+" status: "+rs.getString(8));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new AdminException(e.getMessage());
		}
		
	}

}
