package com.baizhi.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.baizhi.dao.BookDao;
import com.baizhi.entity.Book;
import com.baizhi.service.HotBoardService;
import com.baizhi.utils.MyBatisUtil;

public class HotBoardServiceImpl implements HotBoardService{

	@Override
	public List<Book> getAll4() {
		BookDao dao=(BookDao)MyBatisUtil.getMapper(BookDao.class);
		List<Book> all4 = dao.getAll4();
		MyBatisUtil.close();
		return all4;
	}

	
}
