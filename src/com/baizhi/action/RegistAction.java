package com.baizhi.action;

import java.util.Date;
import java.util.UUID;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.baizhi.serviceImpl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class RegistAction extends ActionSupport{
	private User user;
	private String message;
	private String validateCode;
	public String execute() {
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.setValue("#session.user1", user);
		try {
			UserService us=new UserServiceImpl();
			us.judge(user);
			us.judgeCode(validateCode);
			return "reg";
		} catch (Exception e) {
			message=e.getMessage();
			return "reg1";
		}
	
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getValidateCode() {
		return validateCode;
	}
	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}
}
