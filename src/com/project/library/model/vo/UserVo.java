package com.project.library.model.vo;

public class UserVo {
	
	String userNo;
	String name;
	String tel;
	String email;
	String id;
	String pw;

	public UserVo(String userNo, String name, String tel, String email, String id, String pw) {
		super();
		this.userNo = userNo;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.id = id;
		this.pw = pw;
	}

	public String getUserNo() {
		return userNo;
	}
	
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "UserVo [userNo=" + userNo + ", name=" + name + ", tel=" + tel + ", email=" + email + ", id=" + id
				+ ", pw=" + pw + "]";
	}	
	
}
