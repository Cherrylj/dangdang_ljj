package com.baizhi.action;

import com.baizhi.entity.Book;
import com.baizhi.entity.CartItem;
import com.baizhi.service.CartService;
import com.baizhi.serviceImpl.CartServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class RecoverAction extends ActionSupport{
	private int id;
	public String execute() throws Exception {
		CartService cs=new CartServiceImpl();
		cs.recover(id);
		return "recover";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
