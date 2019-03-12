package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.Address;

public interface AddressService {
	public List<Address> getAddress(int id);
	public Address getAddress1(int id);
	public Address getAddress2(String detailed);
	
}
