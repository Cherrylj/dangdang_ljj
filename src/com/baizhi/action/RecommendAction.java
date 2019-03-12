package com.baizhi.action;

import java.util.List;

import com.baizhi.entity.Book;
import com.baizhi.service.RecommendService;
import com.baizhi.serviceImpl.RecommendServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class RecommendAction extends ActionSupport{
	private List<Book> list;

	public String execute() throws Exception {
		RecommendService cs = new RecommendServiceImpl();
		list = cs.getAll();
		System.out.println("sss"+list);
		return "rec";
	}

	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}
	
}
