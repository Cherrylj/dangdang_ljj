package com.baizhi.dao;

import java.util.List;

import com.baizhi.entity.Address;

public interface AddressDao {
	public List<Address> getAddr(int id);
	
	public Address getAddress(int id);
	
	public Address getAddress1(String detailed);
	
	public void insertAddr(Address a);
}
