package com.baizhi.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.baizhi.dao.BookDao;
import com.baizhi.dao.CategoryDao;
import com.baizhi.entity.Book;
import com.baizhi.entity.Category;
import com.baizhi.service.FirstService;
import com.baizhi.utils.MyBatisUtil;

public class FirstServiceImpl implements FirstService{

	@Override
	public Category getAll2(int id) {
		SqlSession session = MyBatisUtil.getSqlSession();
		CategoryDao dao=(CategoryDao)session.getMapper(CategoryDao.class);
		Category all2 = dao.getAll2(id);
		MyBatisUtil.close();
		return all2;
	}

	@Override
	public List<Book> first(int id) {
		SqlSession session = MyBatisUtil.getSqlSession();
		BookDao dao=(BookDao)session.getMapper(BookDao.class);
		List<Book> book = dao.first(id);
		MyBatisUtil.close();
		return book;
	}

	@Override
	public List<Book> second(int id2) {
		SqlSession session = MyBatisUtil.getSqlSession();
		BookDao dao=(BookDao)session.getMapper(BookDao.class);
		List<Book> book = dao.second(id2);
		MyBatisUtil.close();
		return book;
	}
}
