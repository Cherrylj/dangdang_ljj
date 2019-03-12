package com.baizhi.action;

import java.util.List;

import com.baizhi.entity.Book;
import com.baizhi.entity.Category;
import com.baizhi.service.FirstService;
import com.baizhi.service.TitleService;
import com.baizhi.serviceImpl.FirstServiceImpl;
import com.baizhi.serviceImpl.TitleServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class TitleAction extends ActionSupport{//点击图片或者书名进入详细页面
	private int id3;
	private Book book;
	public String execute() throws Exception {
		TitleService ts=new TitleServiceImpl();
		book = ts.title(id3);
		return "title";
	}
	public int getId3() {
		return id3;
	}
	public void setId3(int id3) {
		this.id3 = id3;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

	

}
