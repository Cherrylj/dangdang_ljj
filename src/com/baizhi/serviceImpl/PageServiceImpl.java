package com.baizhi.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.baizhi.dao.BookDao;
import com.baizhi.entity.Book;
import com.baizhi.service.PageService;
import com.baizhi.utils.MyBatisUtil;

public class PageServiceImpl implements PageService{

	@Override
	public List<Book> page(int pageNum,int id) {
		SqlSession session = MyBatisUtil.getSqlSession();
		BookDao dao = (BookDao) session.getMapper(BookDao.class);
		List<Book> list = dao.getAll5(pageNum*3-2, pageNum*3,id);
		return list;
	}

	@Override
	public List<Book> page2(int pageNum, int id2) {
		SqlSession session = MyBatisUtil.getSqlSession();
		BookDao dao = (BookDao) session.getMapper(BookDao.class);
		List<Book> list = dao.getAll6(pageNum*3-2, pageNum*3,id2);
		return list;
	}

}
