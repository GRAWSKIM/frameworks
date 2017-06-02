package com.hb.day01.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.hb.day01.model.SimpleDao;
import com.hb.day01.model.SimpleVo;

public class UpdateController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		ModelAndView mav = new ModelAndView();

		if("POST".equals(req.getMethod())){
			req.setCharacterEncoding("UTF-8");
			SimpleDao dao = new SimpleDao();
			SimpleVo bean = new SimpleVo(
					Integer.parseInt(req.getParameter("sabun")),
					Integer.parseInt(req.getParameter("pay")),
					req.getParameter("name"),null);
			
			if(dao.UpdateOne(bean)>0)
				mav.setViewName("redirect:detail.do?sabun="+Integer.parseInt(req.getParameter("sabun")));
			else
				mav.setViewName("redirect:edit.do?sabun="+Integer.parseInt(req.getParameter("sabun")));
			
		}else{
			
			mav.setViewName("redirect:edit.do?sabun="+Integer.parseInt(req.getParameter("sabun")));
			
		}
		return mav;
	}

}
