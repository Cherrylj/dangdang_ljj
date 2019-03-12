package com.baizhi.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.baizhi.dao.BookDao;
import com.baizhi.dao.CategoryDao;
import com.baizhi.entity.Book;
import com.baizhi.entity.Category;
import com.baizhi.service.FirstService;
import com.baizhi.service.TitleService;
import com.baizhi.utils.MyBatisUtil;

public class TitleServiceImpl implements TitleService{

	@Override
	public Book title(int id3) {
		SqlSession session = MyBatisUtil.getSqlSession();
		BookDao dao=(BookDao)session.getMapper(BookDao.class);
		Book book = dao.title(id3);
		MyBatisUtil.close();
		return book;
	}

	
}
