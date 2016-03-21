package com.entity;

public class RegisterParent {
	private String login_type;//1.表示普通登录；2.表示微信登录
	private String username;
	private String password;
	private String repassword;
	private String name;//家长姓名
	private String mobile;
	private String id_card;
	
	public RegisterParent() {
		super();
	}

	public RegisterParent(String login_type, String username, String password,
			String repassword, String name, String mobile, String id_card) {
		super();
		this.login_type = login_type;
		this.username = username;
		this.password = password;
		this.repassword = repassword;
		this.name = name;
		this.mobile = mobile;
		this.id_card = id_card;
	}

	public String getLogin_type() {
		return login_type;
	}

	public void setLogin_type(String login_type) {
		this.login_type = login_type;
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

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getId_card() {
		return id_card;
	}

	public void setId_card(String id_card) {
		this.id_card = id_card;
	}
	
	
	

}
