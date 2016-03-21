package com.entity;

public class WorkChild {
	private String course;//课程
	private int icon;//头像
	
	private String content1;//内容
	private String content2;//内容
	private String content3;//内容
	private String date; //时间
	
	public WorkChild() {
		super();
	}
	
	public WorkChild(String course, int icon, String content1,
			String content2, String content3, String date) {
		super();
		this.course = course;
		this.icon = icon;
		this.content1 = content1;
		this.content2 = content2;
		this.content3 = content3;
		this.date = date;
	}

	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getIcon() {
		return icon;
	}
	public void setIcon(int icon) {
		this.icon = icon;
	}
	
	public String getContent1() {
		return content1;
	}

	public void setContent1(String content1) {
		this.content1 = content1;
	}

	public String getContent2() {
		return content2;
	}

	public void setContent2(String content2) {
		this.content2 = content2;
	}

	public String getContent3() {
		return content3;
	}

	public void setContent3(String content3) {
		this.content3 = content3;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
