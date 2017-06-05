package com.hb.day01.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.hb.day01.model.SimpleDao;

public class DeleteController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		ModelAndView mav = new ModelAndView();
		SimpleDao dao = new SimpleDao();
		String msg= null;
		mav.setViewName("list");
		if(dao.deleteOne(Integer.parseInt(req.getParameter("sabun")))>0){
			msg="success";
		}else {
			msg="fali";
		}
		req.setAttribute("msg", msg);
		return mav;
	}

}
