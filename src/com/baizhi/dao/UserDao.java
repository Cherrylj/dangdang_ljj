package com.baizhi.dao;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.User;

public interface UserDao {
	public User login(@Param("email")String email,@Param("password")String password);
	
	public User find(String email);
	
	public void insertUser(User user);

	
}
