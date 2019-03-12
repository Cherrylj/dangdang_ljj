package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	int id;
	String email;
	String username;
	String password;
	Date regist_time;
	String salt;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String email, String username, String password,
			Date regist_time, String salt) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
		this.regist_time = regist_time;
		this.salt = salt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Date getRegist_time() {
		return regist_time;
	}
	public void setRegist_time(Date regist_time) {
		this.regist_time = regist_time;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", username=" + username
				+ ", password=" + password + ", regist_time=" + regist_time
				+ ", salt=" + salt + "]";
	}
	
	
}
