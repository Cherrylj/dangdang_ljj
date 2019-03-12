package com.baizhi.action;

import com.baizhi.entity.Address;
import com.baizhi.entity.Order;
import com.baizhi.service.AddressService;
import com.baizhi.service.OrderService;
import com.baizhi.serviceImpl.AddressServiceImpl;
import com.baizhi.serviceImpl.OrderServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class OrderAction extends ActionSupport{
	private Address address;
	private Order order;
	public String execute(){
		OrderService os=new OrderServiceImpl();
		order = os.ins(address);
		return "or";
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
}
