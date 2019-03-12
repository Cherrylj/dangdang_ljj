package com.baizhi.action;

import java.util.List;

import com.baizhi.entity.Book;
import com.baizhi.service.HotBoardService;
import com.baizhi.serviceImpl.HotBoardServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class HotBoardAction extends ActionSupport{
	private List<Book> list;

	public String execute() throws Exception {
		HotBoardService cs = new HotBoardServiceImpl();
		list = cs.getAll4();
		return "hotb";
	}

	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}
	
}
