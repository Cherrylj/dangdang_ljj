package com.baizhi.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.baizhi.dao.BookDao;
import com.baizhi.entity.Book;
import com.baizhi.service.HotService;
import com.baizhi.utils.MyBatisUtil;

public class HotServiceImpl implements HotService{

	@Override
	public List<Book> getAll2() {
		SqlSession session = MyBatisUtil.getSqlSession();
		BookDao dao=(BookDao)session.getMapper(BookDao.class);
		List<Book> all2 = dao.getAll2();
		MyBatisUtil.close();
		return all2;
	}

	
}
