package com.baizhi.action;

import java.util.List;

import com.baizhi.entity.Address;
import com.baizhi.service.AddressService;
import com.baizhi.serviceImpl.AddressServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ChoiceAction extends ActionSupport{
	private int choice;
	private Address address;
	@Override
	public String execute(){
		ValueStack vs = ActionContext.getContext().getValueStack();
		List<Address> list = (List) vs.findValue("#session.list");
		for (Address aa : list) {
			if(aa.getId()==choice){
				address=aa;
			}
		}
		AddressService adds=new AddressServiceImpl();
		address = adds.getAddress1(choice);
	
		return "choice";
	}
	
	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
}
