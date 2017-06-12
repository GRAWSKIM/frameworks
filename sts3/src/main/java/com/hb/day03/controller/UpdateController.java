package com.hb.day03.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.day03.guest.model.Dao.GuestDao;
import com.hb.day03.guest.model.Dto.GuestDto;

@Controller
public class UpdateController {
	@Autowired
	private GuestDao dao;
	
	@RequestMapping(value="/guest",method=RequestMethod.GET)
	public String addForm(){
		return "form";
	}
	@RequestMapping(value="/guest",method=RequestMethod.POST)
	public String insertOne(@ModelAttribute GuestDto bean){
		
		try {
			dao.insertOne(bean);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "redirect:list";
	}
	@RequestMapping(value="/guest/{idx}",method=RequestMethod.PUT)
	public String updateOne(@PathVariable int idx,@ModelAttribute GuestDto bean){
		
		try {
			dao.updateOne(bean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/guest/"+bean.getSabun();
	}
}
