package com.cms.models;

public class course {

	private String course_id;
	private String course_name;
	private int course_fee;
	private String course_description;
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getCourse_fee() {
		return course_fee;
	}
	public void setCourse_fee(int course_fee) {
		this.course_fee = course_fee;
	}
	public String getCourse_description() {
		return course_description;
	}
	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}
	public course(String course_id, String course_name, int course_fee, String course_description) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_fee = course_fee;
		this.course_description = course_description;
	}
	public course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "course [course_id=" + course_id + ", course_name=" + course_name + ", course_fee=" + course_fee
				+ ", course_description=" + course_description + "]";
	}
	
	
	

	
	
}
