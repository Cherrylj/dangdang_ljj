package com.baizhi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.Book;
import com.baizhi.entity.Category;

public interface BookDao {
	public List<Book> getAll();//�Ƽ�
	public List<Book> getAll2();//����
	public List<Book> getAll3();//�����ϼ�
	public List<Book> getAll4();//��������
	public List<Book> first(int id);
	public List<Book> second(int id2);
	public Book title(int id3);
	public List<Book> getAll5(@Param("begin")int begin,@Param("end")int end,@Param("id")int id);//һ�������ҳ
	public List<Book> getAll6(@Param("begin")int begin,@Param("end")int end,@Param("id")int id2);//���������ҳ
}
