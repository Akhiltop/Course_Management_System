package com.cms.models;

public class coursePlan {

	private String plan_id;
	private String batchid;
	private int day_number;
	private String topic;
	private String status;
	public String getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}
	public String getBatchid() {
		return batchid;
	}
	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}
	public int getDay_number() {
		return day_number;
	}
	public void setDay_number(int day_number) {
		this.day_number = day_number;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public coursePlan(String plan_id, String batchid, int day_number, String topic, String status) {
		super();
		this.plan_id = plan_id;
		this.batchid = batchid;
		this.day_number = day_number;
		this.topic = topic;
		this.status = status;
	}
	public coursePlan() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "coursePlan [plan_id=" + plan_id + ", batchid=" + batchid + ", day_number=" + day_number + ", topic="
				+ topic + ", status=" + status + "]";
	}


	
	
}
