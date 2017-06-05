package com.hb.spring2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.hb.spring2.model.DaoImpl;
import com.hb.spring2.model.SimpleVo;

public class UpdateController extends AbstractCommandController{
    private DaoImpl dao;

	public void setDao(DaoImpl dao) {
		this.dao = dao;
	}
	
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		ModelAndView mav = new ModelAndView();
		SimpleVo bean = new SimpleVo();
		if(dao.updateOne(bean)>0){
			mav.setViewName("redirect:detail.do?sabun=");
		}else{
			mav.setViewName("redirect:edit.do?sabun=");
		}
		return mav;
	}

}
