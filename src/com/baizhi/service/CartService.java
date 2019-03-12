package com.baizhi.service;

public interface CartService {
	public void addCart(int id);
	public void changeCount(int id,int count);
	public void remove(int id);
	public void recover(int id);
}
