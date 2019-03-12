package com.baizhi.serviceImpl;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import com.baizhi.dao.AddressDao;
import com.baizhi.dao.OrderDao;
import com.baizhi.dao.OrderItemsDao;
import com.baizhi.entity.Address;
import com.baizhi.entity.CartItem;
import com.baizhi.entity.Order;
import com.baizhi.entity.OrderItems;
import com.baizhi.entity.User;
import com.baizhi.service.AddressService;
import com.baizhi.service.OrderService;
import com.baizhi.utils.MyBatisUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class OrderServiceImpl implements  OrderService{
		public Order ins(Address a){
			int aid = insertAddress(a);
			Order order=insertOrder(aid);
			insertOrderItems(order.getId());
			ActionContext.getContext().getSession().remove("map");
			ActionContext.getContext().getValueStack().setValue("#session.totalprice",0.0);
			ActionContext.getContext().getValueStack().setValue("#session.save", 0.0);
			return order;
		}
	
	
	public int insertAddress(Address a) {
		ValueStack vs = ActionContext.getContext().getValueStack();
		User user = (User) vs.findValue("#session.user");
		AddressService adds = new AddressServiceImpl();
		Address address1 = adds.getAddress2(a.getDetailed());
		if (address1 == null) {
			AddressDao dao = (AddressDao) MyBatisUtil
					.getMapper(AddressDao.class);
			
			a.setUser_id(user.getId());
			dao.insertAddr(a);
			MyBatisUtil.commit();
			return a.getId();
		} else {
			return address1.getId();
		}
	}
	
	public Order insertOrder(int id){
		ValueStack vs = ActionContext.getContext().getValueStack();
		double totalprice = (Double) vs.findValue("#session.totalprice");
		User user = (User) vs.findValue("#session.user");
		OrderDao dao = (OrderDao) MyBatisUtil.getMapper(OrderDao.class);
		Order order=new Order();
		order.setAddr_id(id);
		order.setCreationTime(new Date());
		order.setTotalPrice(totalprice);
		order.setUser_id(user.getId());
		dao.insertOrder(order);
		MyBatisUtil.commit();
		return order;
	}
	
	public void insertOrderItems(int id){
		ValueStack vs = ActionContext.getContext().getValueStack();
		OrderItemsDao dao = (OrderItemsDao) MyBatisUtil.getMapper(OrderItemsDao.class);
		 OrderItems oi=new OrderItems();
		Map<Integer, CartItem> map = (Map) vs.findValue("#session.map");
		Collection<CartItem> collection = map.values();
		for (CartItem cartItem : collection) {
			oi.setOrder_id(id);
			oi.setCount(cartItem.getCount());
			int id1=Integer.parseInt(cartItem.getBook().getId());
			oi.setBook_id(id1);
			oi.setSubtotal(cartItem.getCount()*cartItem.getBook().getSellingPrice());
			dao.insertOrderItems(oi);
		}
		MyBatisUtil.commit();
		
	}
	
}
