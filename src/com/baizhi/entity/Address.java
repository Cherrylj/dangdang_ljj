package com.baizhi.entity;

import java.io.Serializable;

public class Address implements Serializable{
	private int id;
	private String addName;
	private String detailed;
	private String postalCode;
	private String phone;
	private String tel;
	private int user_id;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int id, String addName, String detailed, String postalCode,
			String phone, String tel, int user_id) {
		super();
		this.id = id;
		this.addName = addName;
		this.detailed = detailed;
		this.postalCode = postalCode;
		this.phone = phone;
		this.tel = tel;
		this.user_id = user_id;
	}
	
	public Address(String addName, String detailed, String postalCode,
			String phone, String tel, int user_id) {
		super();
		this.addName = addName;
		this.detailed = detailed;
		this.postalCode = postalCode;
		this.phone = phone;
		this.tel = tel;
		this.user_id = user_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddName() {
		return addName;
	}
	public void setAddName(String addName) {
		this.addName = addName;
	}
	public String getDetailed() {
		return detailed;
	}
	public void setDetailed(String detailed) {
		this.detailed = detailed;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", addName=" + addName + ", detailed="
				+ detailed + ", postalCode=" + postalCode + ", phone=" + phone
				+ ", tel=" + tel + ", user_id=" + user_id + "]";
	}
	
}
