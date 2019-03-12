package com.baizhi.action;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.baizhi.serviceImpl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class LoginAction extends ActionSupport{
	private User user;
	private String email;
	private String password;
	private String message;
	public String execute() {
		ValueStack vs = ActionContext.getContext().getValueStack();
		UserService us = new UserServiceImpl();
		String state=(String) vs.findValue("#session.state");
		try{
			user = us.login(email,password,state);
			vs.setValue("#session.user", user);
			if(state==null){
				return "login";
			}else{
				return "add";
			}
		}catch(Exception e){
			message=e.getMessage();
			return "fail";
		}
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	
}
