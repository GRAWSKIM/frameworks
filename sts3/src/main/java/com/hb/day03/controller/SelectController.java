package com.hb.day03.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hb.day03.guest.model.Dao.GuestDao;

@Controller
public class SelectController {
	@Autowired
	private GuestDao dao;
	
	@RequestMapping("/list")
	public ModelAndView selectAll(ModelAndView mav){
		try {
			mav.addObject("alist", dao.selectAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		mav.setViewName("list");
		return mav;
	}
	@RequestMapping(value="/guest/{sabun}",method=RequestMethod.GET)
	public String selectOne(Model mav,@PathVariable int sabun){
		try {
			mav.addAttribute("bean", dao.selectOne(sabun));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "detail";
	}
}
