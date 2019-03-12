package com.baizhi.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.baizhi.dao.BookDao;
import com.baizhi.entity.Book;
import com.baizhi.entity.Category;
import com.baizhi.service.RecommendService;
import com.baizhi.utils.MyBatisUtil;

public class RecommendServiceImpl implements RecommendService{

	@Override
	public List<Book> getAll() {
		BookDao dao=(BookDao)MyBatisUtil.getMapper(BookDao.class);
		List<Book> all = dao.getAll();
		MyBatisUtil.close();
		return all;
	}

}
