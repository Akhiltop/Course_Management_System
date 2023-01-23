package com.cms.models;

public class batch {

	private String batch_id;
	private String courseid;
	private String facultyid;
	private int no_of_students;
	private String batch_start_date;
	private int duration;
	public String getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(String batch_id) {
		this.batch_id = batch_id;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getFacultyid() {
		return facultyid;
	}
	public void setFacultyid(String facultyid) {
		this.facultyid = facultyid;
	}
	public int getNo_of_students() {
		return no_of_students;
	}
	public void setNo_of_students(int no_of_students) {
		this.no_of_students = no_of_students;
	}
	public String getBatch_start_date() {
		return batch_start_date;
	}
	public void setBatch_start_date(String batch_start_date) {
		this.batch_start_date = batch_start_date;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public batch(String batch_id, String courseid, String facultyid, int no_of_students, String batch_start_date,
			int duration) {
		super();
		this.batch_id = batch_id;
		this.courseid = courseid;
		this.facultyid = facultyid;
		this.no_of_students = no_of_students;
		this.batch_start_date = batch_start_date;
		this.duration = duration;
	}
	public batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "batch [batch_id=" + batch_id + ", courseid=" + courseid + ", facultyid=" + facultyid
				+ ", no_of_students=" + no_of_students + ", batch_start_date=" + batch_start_date + ", duration="
				+ duration + "]";
	}

	
	
	
	
}
