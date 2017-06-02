package com.hb.day01.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.hb.day01.model.SimpleDao;
import com.hb.day01.model.SimpleVo;

public class DetailController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse reps) throws Exception {
		ModelAndView mav = new ModelAndView();
		String uri=req.getRequestURI().replace(req.getContextPath(),"");
		
		
		if(uri.equals("/sts01/detail.do")){
			mav.setViewName("detail");
		}else if(uri.equals("/sts01/edit.do")){
			mav.setViewName("edit");
		}
		
		SimpleDao dao = new SimpleDao();
		SimpleVo bean = dao.selectOne(Integer.parseInt(req.getParameter("sabun")));
		mav.addObject("bean",bean);
		return mav;
	}

}
