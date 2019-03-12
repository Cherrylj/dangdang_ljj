package com.baizhi.serviceImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import com.baizhi.dao.BookDao;
import com.baizhi.entity.Book;
import com.baizhi.entity.CartItem;
import com.baizhi.service.CartService;
import com.baizhi.utils.MyBatisUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class CartServiceImpl implements CartService {

	@Override
	public void addCart(int id) {
		ValueStack vs = ActionContext.getContext().getValueStack();
		Map map = (Map) vs.findValue("#session.map");
		BookDao dao = (BookDao) MyBatisUtil.getMapper(BookDao.class);
		Book book = dao.title(id);
		if (map == null) {// 购物车不存在
			Map<Integer, CartItem> map1 = new HashMap<Integer, CartItem>();
			CartItem cart = new CartItem(book, 1, book.getSellingPrice(),
					book.getPricing() - book.getSellingPrice());
			map1.put(id, cart);
			vs.setValue("#session.map", map1);
			cart.setTotalprice(book.getSellingPrice());
			cart.setSave(book.getPricing() - book.getSellingPrice());
		} else {
			CartItem cart = null;
			if (map.containsKey(id)) {// 购物车存在，买过这个商品
				cart = (CartItem) map.get(id);
				cart.setCount(cart.getCount() + 1);
				cart.setTotalprice(cart.getCount() * book.getSellingPrice());
				cart.setSave(cart.getCount() * book.getPricing()
						- cart.getCount() * book.getSellingPrice());
			} else {// 购物车存在，没买过这个商品
				cart = new CartItem(book, 1, book.getSellingPrice(),
						book.getPricing() - book.getSellingPrice());
				cart.setTotalprice(book.getSellingPrice());
				cart.setSave(book.getPricing() - book.getSellingPrice());
				map.put(id, cart);
			}
			vs.setValue("#session.map", map);
		}
		map = (Map) vs.findValue("#session.map");
		Collection<CartItem> values = map.values();
		double totalprice = 0.0;
		double save = 0.0;
		for (CartItem c : values) {
			totalprice += c.getTotalprice();
			save += c.getSave();
		}
		vs.setValue("#session.map", map);
		vs.setValue("#session.totalprice", totalprice);
		vs.setValue("#session.save", save);
	}
	@Override
	public void changeCount(int id,int count){
		ValueStack vs = ActionContext.getContext().getValueStack();
		Map map=(Map)vs.findValue("#session.map");
		BookDao dao = (BookDao) MyBatisUtil.getMapper(BookDao.class);
		Book book = dao.title(id);
		CartItem cart = (CartItem) map.get(id);
		cart.setCount(count);
		cart.setTotalprice(cart.getCount() * book.getSellingPrice());
		cart.setSave(cart.getCount() * book.getPricing() - cart.getCount() * book.getSellingPrice());
		map.put(id, cart);
		map = (Map) vs.findValue("#session.map");
		Collection<CartItem> values = map.values();
		double totalprice = 0.0;
		double save = 0.0;
		for (CartItem c : values) {
			totalprice += c.getTotalprice();
			save += c.getSave();
		}
		vs.setValue("#session.map", map);
		vs.setValue("#session.totalprice", totalprice);
		vs.setValue("#session.save", save);
	
	
	}
	@Override
	public void remove(int id) {
		ValueStack vs = ActionContext.getContext().getValueStack();
		Map map=(Map)vs.findValue("#session.map");
		CartItem cart = (CartItem) map.get(id);
		Map delMap=(Map)vs.findValue("#session.delmap");
		if(delMap==null){
			delMap=new HashMap<Integer,CartItem>();
			map.remove(id);
			delMap.put(id, cart);
		}else{
			map.remove(id);
			delMap.put(id, cart);
		}
		double tp=(Double) vs.findValue("#session.totalprice");
		double sa=(Double) vs.findValue("#session.save");
		vs.setValue("#session.totalprice", tp-cart.getTotalprice());
		vs.setValue("#session.save", sa-cart.getSave());
		vs.setValue("#session.map", map);
		vs.setValue("#session.delmap", delMap);
		
	}
	@Override
	public void recover(int id) {
		ValueStack vs = ActionContext.getContext().getValueStack();
		Map delMap=(Map)vs.findValue("#session.delmap");
		Map map=(Map)vs.findValue("#session.map");
		CartItem cart = (CartItem) delMap.get(id);
		if(map==null){
			map=new HashMap<Integer,CartItem>();
			delMap.remove(id);
			map.put(id, cart);
		}else{
			delMap.remove(id);
			map.put(id, cart);
		}
		double tp=(Double) vs.findValue("#session.totalprice");
		double sa=(Double) vs.findValue("#session.save");
		vs.setValue("#session.totalprice",cart.getTotalprice()+ tp);
		vs.setValue("#session.save", sa+cart.getSave());
		vs.setValue("#session.map", map);
		vs.setValue("#session.delmap", delMap);
		
	}	
}
