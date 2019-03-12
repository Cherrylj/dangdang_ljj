package com.baizhi.service;

import com.baizhi.entity.User;

public interface UserService {
	public User login(String email,String password,String state);
	public boolean regist(User user);
	public void judge(User user);
	public void judgeCode(String validateCode);
}
