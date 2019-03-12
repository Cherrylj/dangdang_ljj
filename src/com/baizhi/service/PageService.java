package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.Book;
import com.baizhi.entity.Category;

public interface PageService {
	public List<Book> page(int pageNum,int id);
	public List<Book> page2(int pageNum,int id2);
	
}
