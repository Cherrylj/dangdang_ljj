package com.baizhi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.Book;
import com.baizhi.entity.Category;

public interface BookDao {
	public List<Book> getAll();//推荐
	public List<Book> getAll2();//热销
	public List<Book> getAll3();//最新上架
	public List<Book> getAll4();//新书热卖
	public List<Book> first(int id);
	public List<Book> second(int id2);
	public Book title(int id3);
	public List<Book> getAll5(@Param("begin")int begin,@Param("end")int end,@Param("id")int id);//一级分类分页
	public List<Book> getAll6(@Param("begin")int begin,@Param("end")int end,@Param("id")int id2);//二级分类分页
}
