package com.hb.day01.controller;

import java.lang.reflect.Method;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ExtendedModelMap;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;

import com.hb.day01.model.SimpleDao;

public class ListController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		SimpleDao dao = new SimpleDao();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("list");
		try {
			mav.addObject("alist",dao.selectAll());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return mav;
	}

	
}
