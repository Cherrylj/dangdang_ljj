package com.baizhi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.Category;

public interface CategoryDao {
	public List<Category> getAll();//首页
	public Category getAll2(int id);//一级分类
	
}
