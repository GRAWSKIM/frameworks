package com.hb.struts.action;

import com.hb.struts.model.SimpleDao;
import com.hb.struts.model.SimpleVo;
import com.opensymphony.xwork2.Action;

public class InsertOneAction implements Action {
	private String name;
	private int sabun;
	private int pay;
	

	@Override
	public String execute() throws Exception {
		SimpleDao dao = new SimpleDao();
		SimpleVo bean = new SimpleVo();
		bean.setSabun(sabun);
		bean.setName(name);
		bean.setPay(pay);
		int result = dao.insertOne(bean);
		if(result>0)
			return SUCCESS;
		else
			return INPUT; 
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}


}
