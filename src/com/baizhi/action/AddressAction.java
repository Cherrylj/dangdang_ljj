package com.baizhi.action;

import java.util.List;

import com.baizhi.entity.Address;
import com.baizhi.entity.User;
import com.baizhi.service.AddressService;
import com.baizhi.serviceImpl.AddressServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class AddressAction extends ActionSupport{
	private User user;
	private List<Address> list;
	public String execute() {
		ValueStack vs = ActionContext.getContext().getValueStack();
		user = (User) vs.findValue("#session.user");
		if(user==null){
			vs.setValue("#session.state", "ok");
			return "login";
		}else{
			int id=user.getId();
			AddressService adds=new AddressServiceImpl();
			list = adds.getAddress(user.getId());
			vs.setValue("#session.list",list);
			return "add";
		}
		
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Address> getList() {
		return list;
	}
	public void setList(List<Address> list) {
		this.list = list;
	}
	
}
