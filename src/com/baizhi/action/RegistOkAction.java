package com.baizhi.action;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.baizhi.serviceImpl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;


public class RegistOkAction extends ActionSupport{
	private User user;
	public String execute() {
	ValueStack vs = ActionContext.getContext().getValueStack();	
	user = (User) vs.findValue("#session.user1");
	UserService us=new UserServiceImpl();
	us.regist(user);
		return "ok";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
