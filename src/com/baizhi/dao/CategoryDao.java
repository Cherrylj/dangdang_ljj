package com.baizhi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.Category;

public interface CategoryDao {
	public List<Category> getAll();//��ҳ
	public Category getAll2(int id);//һ������
	
}
