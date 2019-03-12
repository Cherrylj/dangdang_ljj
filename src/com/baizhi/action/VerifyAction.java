package com.baizhi.action;

import java.util.UUID;

import com.baizhi.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;


public class VerifyAction extends ActionSupport{
	private String email;
	private String someCode;
	public String execute() {
	ValueStack vs = ActionContext.getContext().getValueStack();	
	User user = (User) vs.findValue("#session.user");
	someCode = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		return "ver";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSomeCode() {
		return someCode;
	}
	public void setSomeCode(String someCode) {
		this.someCode = someCode;
	}
	
}
