package com.baizhi.serviceImpl;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.baizhi.utils.MyBatisUtil;
import com.baizhi.utils.RandomSaltUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import com.sun.mail.smtp.DigestMD5;

public class UserServiceImpl implements UserService{

	@Override
	public User login(String email, String password,String state) {
		
		UserDao dao=(UserDao) MyBatisUtil.getMapper(UserDao.class);
		User user = dao.find(email);
		if (user == null || email.equals("")) {
			throw new RuntimeException("邮箱错误！");
		} else {
			String salt = user.getSalt();
			String pas=salt+password;//将盐和密码拼接
			String password1=DigestUtils.md5Hex(pas);//加密
			if (user.getPassword().equals(password1)) {
				User user2 = dao.login(email, password1);
				return user2;
			} else {
				throw new RuntimeException("密码错误 ！");
			}

		}
	}

	@Override
	public boolean regist(User user) {
		String salt = RandomSaltUtil.generetRandomSaltCode();// 获取盐
		String pas = salt + user.getPassword();// 将盐和密码拼接
		String password = DigestUtils.md5Hex(pas);// 加密
		user.setPassword(password);
		user.setSalt(salt);
		user.setRegist_time(new Date());
		UserDao dao = (UserDao) MyBatisUtil.getMapper(UserDao.class);
		dao.insertUser(user);
		MyBatisUtil.commit();
		return true;
	}
	public void judge(User user){
		try {
			UserDao dao = (UserDao) MyBatisUtil.getMapper(UserDao.class);
			user = dao.find(user.getEmail());
			if(user!=null) throw new RuntimeException("邮箱已存在！");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}finally{
			MyBatisUtil.close();
		}
	}
	public void judgeCode(String validateCode){
			ValueStack vs = ActionContext.getContext().getValueStack();
			String value = (String) vs.findValue("#session.code");
			if(!validateCode.equals(value)) throw new RuntimeException("验证码错误！");
	}
	
}
