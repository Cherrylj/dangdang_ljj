package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable{
	private int id;
	private double totalPrice;
	private Date creationTime;
	private int addr_id;
	private int user_id;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, double totalPrice, Date creationTime, int addr_id,
			int user_id) {
		super();
		this.id = id;
		this.totalPrice = totalPrice;
		this.creationTime = creationTime;
		this.addr_id = addr_id;
		this.user_id = user_id;
	}
	
	public Order(double totalPrice, Date creationTime, int addr_id, int user_id) {
		super();
		this.totalPrice = totalPrice;
		this.creationTime = creationTime;
		this.addr_id = addr_id;
		this.user_id = user_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	public int getAddr_id() {
		return addr_id;
	}
	public void setAddr_id(int addr_id) {
		this.addr_id = addr_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", totalPrice=" + totalPrice
				+ ", creationTime=" + creationTime + ", addr_id=" + addr_id
				+ ", user_id=" + user_id + "]";
	}
	
}
