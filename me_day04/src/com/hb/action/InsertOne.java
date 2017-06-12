package com.hb.action;

import com.hb.model.SimpleDao;
import com.opensymphony.xwork2.ActionSupport;

public class InsertOne extends ActionSupport{
	private String name,nalja;
	private int pay;
	
	
	@Override
	public String execute() throws Exception {
		
		SimpleDao dao = new SimpleDao();
		int result = dao.insertO4ne(name,nalja,pay);
		
		if(result>0){
			return this.SUCCESS;
		}else{
			return this.INPUT;
		}
		
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setNalja(String nalja) {
		this.nalja = nalja;
	}


	public void setPay(int pay) {
		this.pay = pay;
	}
	
}
