package com.baizhi.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.baizhi.dao.BookDao;
import com.baizhi.entity.Book;
import com.baizhi.service.NewService;
import com.baizhi.utils.MyBatisUtil;

public class NewServiceImpl implements NewService{

	@Override
	public List<Book> getAll3() {
		SqlSession session = MyBatisUtil.getSqlSession();
		BookDao dao=(BookDao)session.getMapper(BookDao.class);
		List<Book> all3 = dao.getAll3();
		MyBatisUtil.close();
		return all3;
	}

	
}
