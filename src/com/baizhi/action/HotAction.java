package com.baizhi.action;

import java.util.List;

import com.baizhi.entity.Book;
import com.baizhi.service.HotService;
import com.baizhi.serviceImpl.HotServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class HotAction extends ActionSupport{
	private List<Book> list;

	public String execute() throws Exception {
		HotService cs = new HotServiceImpl();
		list = cs.getAll2();
		return "hot";
	}

	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}
	
}
