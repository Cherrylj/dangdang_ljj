package com.baizhi.action;

import com.baizhi.entity.Book;
import com.baizhi.entity.CartItem;
import com.baizhi.service.CartService;
import com.baizhi.serviceImpl.CartServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport{
	private int id;
	private Book book;
	private CartItem cart;
	public String execute() throws Exception {
		CartService cs=new CartServiceImpl();
		cs.addCart(id);
		return "cart";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public CartItem getCart() {
		return cart;
	}

	public void setCart(CartItem cart) {
		this.cart = cart;
	}
	
}
