package com.entity;

public class WorkGroup {
	private String week;
	private String date;
	
	public WorkGroup() {
		super();
	}
	public WorkGroup(String week, String date) {
		super();
		this.week = week;
		this.date = date;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	
}
