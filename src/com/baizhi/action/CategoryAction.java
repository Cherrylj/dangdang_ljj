package com.baizhi.action;

import java.util.List;

import com.baizhi.entity.Category;
import com.baizhi.service.CategoryService;
import com.baizhi.serviceImpl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class CategoryAction extends ActionSupport{
	private List<Category> list;

	public String execute() throws Exception {
		CategoryService cs = new CategoryServiceImpl();
		list = cs.getAll();
		return "cate";
	}

	public List<Category> getList() {
		return list;
	}

	public void setList(List<Category> list) {
		this.list = list;
	}
	
}
