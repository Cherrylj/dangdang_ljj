package com.baizhi.entity;

import java.io.Serializable;

public class CartItem implements Serializable{
	private Book book;
	private Integer count;
	private double totalprice;//商品金额总计
	private double save;//节省
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartItem(Book book, Integer count, double totalprice, double save) {
		super();
		this.book = book;
		this.count = count;
		this.totalprice = totalprice;
		this.save = save;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public double getSave() {
		return save;
	}
	public void setSave(double save) {
		this.save = save;
	}
	@Override
	public String toString() {
		return "CartItem [book=" + book + ", count=" + count + ", totalprice="
				+ totalprice + ", save=" + save + "]";
	}
	
}
