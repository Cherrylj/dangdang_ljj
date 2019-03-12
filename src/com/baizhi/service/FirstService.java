package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.Book;
import com.baizhi.entity.Category;

public interface FirstService {
	public Category getAll2(int id);
	public List<Book> first(int id);
	public List<Book> second(int id2);
}
