package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.Address;
import com.baizhi.entity.Order;

public interface OrderService {
	public int insertAddress(Address a);
	public Order insertOrder(int id);
	public void insertOrderItems(int id);
	public Order ins(Address a);
}
