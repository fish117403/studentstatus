package com.entity;

public class HomeCategory {
	private int categoryID;
	private String categoryDesc;
	
	public HomeCategory(int categoryID, String categoryDesc) {
		super();
		this.categoryID = categoryID;
		this.categoryDesc = categoryDesc;
	}

	public HomeCategory() {
		super();
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	
	

}
