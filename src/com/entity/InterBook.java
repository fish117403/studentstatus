package com.entity;



/**
 * 
 *通讯录实例化（头像、名称、索引值）
 */
public class InterBook {
	private String bookIndex;
	private int bookIcon;
	private String bookName;
	public InterBook(String bookIndex, int bookIcon, String bookName) {
		super();
		this.bookIndex = bookIndex;
		this.bookIcon = bookIcon;
		this.bookName = bookName;
	}
	public InterBook() {
		super();
	}
	public String getBookIndex() {
		return bookIndex;
	}
	public void setBookIndex(String bookIndex) {
		this.bookIndex = bookIndex;
	}
	public int getBookIcon() {
		return bookIcon;
	}
	public void setBookIcon(int bookIcon) {
		this.bookIcon = bookIcon;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
}
