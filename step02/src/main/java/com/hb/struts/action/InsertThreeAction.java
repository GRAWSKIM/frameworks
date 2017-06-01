package com.hb.struts.action;

import org.apache.log4j.Logger;

import com.hb.struts.model.SimpleDao;
import com.hb.struts.model.SimpleVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class InsertThreeAction implements Action ,ModelDriven, Preparable{
	private Logger log = Logger.getLogger(this.getClass());
	private SimpleVo bean;
	
	
	@Override
	public String execute() throws Exception {
		log.debug(bean);
		SimpleDao dao = new SimpleDao();
	
		int result = dao.insertOne(bean);
		if(result>0)
			return SUCCESS;
		else
			return INPUT;
		
	}


	@Override
	public Object getModel() {
		
		return bean;
	}


	@Override
	public void prepare() throws Exception {
		 bean = new SimpleVo();
	}

}
