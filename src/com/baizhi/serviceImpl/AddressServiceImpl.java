package com.baizhi.serviceImpl;

import java.util.List;

import com.baizhi.dao.AddressDao;
import com.baizhi.entity.Address;
import com.baizhi.service.AddressService;
import com.baizhi.utils.MyBatisUtil;

public class AddressServiceImpl implements AddressService{

	@Override
	public List<Address> getAddress(int id) {
		List<Address> list = null;
		try {
			AddressDao dao = (AddressDao) MyBatisUtil
					.getMapper(AddressDao.class);
			list = dao.getAddr(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			MyBatisUtil.close();
		}
		return list;
		
	}

	@Override
	public Address getAddress1(int id) {
		Address address = null;
		try {
			AddressDao dao=(AddressDao) MyBatisUtil.getMapper(AddressDao.class);
			address = dao.getAddress(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			MyBatisUtil.close();
		}
		return address;
	}

	@Override
	public Address getAddress2(String detailed) {
		Address address = null;
		try {
			AddressDao dao=(AddressDao) MyBatisUtil.getMapper(AddressDao.class);
			address = dao.getAddress1(detailed);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			MyBatisUtil.close();
		}
		return address;
	}

}
