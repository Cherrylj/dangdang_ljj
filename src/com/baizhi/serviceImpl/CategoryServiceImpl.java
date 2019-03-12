package com.baizhi.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.baizhi.dao.BookDao;
import com.baizhi.dao.CategoryDao;
import com.baizhi.entity.Category;
import com.baizhi.service.CategoryService;
import com.baizhi.utils.MyBatisUtil;

public class CategoryServiceImpl implements CategoryService{

	@Override
	public List<Category> getAll() {
		List<Category> all = null;
		try {
			CategoryDao dao=(CategoryDao)MyBatisUtil.getMapper(CategoryDao.class);
			all = dao.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.close();
		}
		
		return all;
	}

}
