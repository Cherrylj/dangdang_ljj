package com.baizhi.entity;

public class OrderItems {
	private int id;
	private int count;
	private double subtotal;
	private int order_id;
	private int book_id;
	public OrderItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderItems(int id, int count, double subtotal, int order_id,
			int book_id) {
		super();
		this.id = id;
		this.count = count;
		this.subtotal = subtotal;
		this.order_id = order_id;
		this.book_id = book_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	@Override
	public String toString() {
		return "OrderItems [id=" + id + ", count=" + count + ", subtotal="
				+ subtotal + ", order_id=" + order_id + ", book_id=" + book_id
				+ "]";
	}
	
}
