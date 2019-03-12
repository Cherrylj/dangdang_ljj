package com.baizhi.action;

import java.util.List;

import com.baizhi.entity.Book;
import com.baizhi.service.NewService;
import com.baizhi.serviceImpl.NewServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class NewAction extends ActionSupport{
	private List<Book> list;

	public String execute() throws Exception {
		NewService cs = new NewServiceImpl();
		list = cs.getAll3();
		return "new";
	}

	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}
	
}
