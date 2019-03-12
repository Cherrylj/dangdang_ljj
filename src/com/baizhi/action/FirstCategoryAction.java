package com.baizhi.action;

import java.util.List;

import com.baizhi.entity.Book;
import com.baizhi.entity.Category;
import com.baizhi.entity.Page;
import com.baizhi.service.FirstService;
import com.baizhi.service.PageService;
import com.baizhi.serviceImpl.FirstServiceImpl;
import com.baizhi.serviceImpl.PageServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class FirstCategoryAction extends ActionSupport{
	private int id1;
	private int id2;
	private String cname;
	private Category category;
	private List<Book> list;
	private int pageNum;
	private Page page;
	private int totalPage;
	private boolean flag;
	public String execute() throws Exception {
		FirstService cs = new FirstServiceImpl();
		category = cs.getAll2(id1);
		PageService ps = new PageServiceImpl();
		if (pageNum == 0) {
			pageNum = 1;
		}
		if (id2 == 0) {
			list = ps.page(pageNum, id1);
			List list1 = cs.first(id1);
			flag=true;
			if (list1.size() % 3 == 0) {
				totalPage = list1.size()/3;
			} else {
				totalPage = list1.size()/3 + 1;
			}
		} else {
			//category = cs.getAll2(id1);
			list = ps.page2(pageNum, id2);
			List list2 = cs.second(id2);
			flag=false;
			if (list2.size() % 3 == 0) {
				totalPage = list2.size()/3;
			} else {
				totalPage = list2.size()/3 + 1;
			}
		}
		
		return "first";
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}

	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	
	
}
