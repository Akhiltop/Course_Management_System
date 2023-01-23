package com.cms.models;

public class faculty {

	private String faculty_id;
	private String faculty_name;
	private String faculty_address;
	private String mobile;
	private String email;
	private String username;
	private String password;
	public String getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(String faculty_id) {
		this.faculty_id = faculty_id;
	}
	public String getFaculty_name() {
		return faculty_name;
	}
	public void setFaculty_name(String faculty_name) {
		this.faculty_name = faculty_name;
	}
	public String getFaculty_address() {
		return faculty_address;
	}
	public void setFaculty_address(String faculty_address) {
		this.faculty_address = faculty_address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public faculty(String faculty_id, String faculty_name, String faculty_address, String mobile, String email,
			String username, String password) {
		super();
		this.faculty_id = faculty_id;
		this.faculty_name = faculty_name;
		this.faculty_address = faculty_address;
		this.mobile = mobile;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	public faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "faculty [faculty_id=" + faculty_id + ", faculty_name=" + faculty_name + ", faculty_address="
				+ faculty_address + ", mobile=" + mobile + ", email=" + email + ", username=" + username + ", password="
				+ password + "]";
	}
	
	
	

	
}
