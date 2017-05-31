package com.hb.action;

import java.util.Map;

import com.hb.model.SimpleDao;
import com.opensymphony.xwork2.ActionSupport;

public class SelectOne extends ActionSupport{
	private int sabun;
	private Map<String, Object> map;
	
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(sabun);
		
		SimpleDao dao= new SimpleDao();
		map=dao.selectOne(sabun);
		
		return this.SUCCESS;
	}
}
