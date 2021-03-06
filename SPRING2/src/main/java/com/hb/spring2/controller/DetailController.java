package com.hb.spring2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.hb.spring2.model.DaoImpl;

public class DetailController extends AbstractController{

	private DaoImpl dao;
	
	public void setDao(DaoImpl dao) {
		this.dao = dao;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("bean",dao.selectOne(Integer.parseInt(request.getParameter("sabun"))));
		mav.setViewName("detail");
		return mav;
	}
	

}
