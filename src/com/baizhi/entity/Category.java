package com.baizhi.entity;

import java.io.Serializable;



import java.io.Serializable;
import java.util.List;

public class Category implements Serializable{
	private String id;
	private String classify;//Ãû×Ö
	private String parent_id;
	private int count;
	private List<Category> list;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Category(String id, String classify, String parent_id, int count,
			List<Category> list) {
		super();
		this.id = id;
		this.classify = classify;
		this.parent_id = parent_id;
		this.count = count;
		this.list = list;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClassify() {
		return classify;
	}
	public void setClassify(String classify) {
		this.classify = classify;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public List<Category> getList() {
		return list;
	}

	public void setList(List<Category> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", classify=" + classify + ", parent_id="
				+ parent_id + ", count=" + count + ", list=" + list + "]";
	}
	
}
