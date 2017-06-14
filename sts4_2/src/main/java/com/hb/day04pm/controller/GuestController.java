package com.hb.day04pm.controller;

import java.sql.SQLException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.day04pm.model.dao.GuestDao;
import com.hb.day04pm.model.dto.GuestVo;

@Controller
public class GuestController {
	
	@Autowired
	GuestDao dao;
	
	String path;

	
	@RequestMapping("home")
	public String home(Model model,Locale locale){
	
		model.addAttribute("serverTime","<a href='guest/list'>link</a>");
	
		return "home";
	}
	
	@RequestMapping("guest/list")
	public void selectAll(Model model,HttpServletRequest req){

		try {
			model.addAttribute("alist",dao.selectAll());
			model.addAttribute("root",path=req.getContextPath());
			model.addAttribute("serverTime","<a href='guest/list'>link</a>");
		} catch (SQLException e) {
			System.out.println("error msg:"+e);
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="guest/add",method=RequestMethod.GET)
	public void addForm(){
				
	}
	@RequestMapping(value="guest/add",method=RequestMethod.POST)
	public String insertOne( @ModelAttribute GuestVo bean){
		try {
			dao.insertOne(bean);
		} catch (SQLException e) {
			System.out.println("error msg:"+e);
			e.printStackTrace();
		}
		return "redirect:list";
	}

	@RequestMapping(value="guest/detail/{sabun}",method=RequestMethod.GET)
	public String selectOne(@PathVariable int sabun,Model model){
		System.out.println("detail");
		try {
			model.addAttribute("bean",dao.selectOne(sabun));
			model.addAttribute("root",path);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "guest/detail";
	}
	
	@RequestMapping(value="guest/add/{sabun}",method=RequestMethod.GET)
	public String editOne(@PathVariable int sabun,Model model){
		System.out.println("detail");
		try {
			model.addAttribute("bean",dao.selectOne(sabun));
			model.addAttribute("root",path);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "guest/add";
	}
	
	@RequestMapping(value="guest/insert",method=RequestMethod.POST)
	public String updateOne(@ModelAttribute GuestVo bean){
	 try {
		System.out.println( bean.toString());
		dao.updateOne(bean);
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return "redirect:detail/"+bean.getSabun();
		
	}
	@RequestMapping(value="guest/del/{sabun}")
	public String deleteOne(@PathVariable int sabun){
		try {
			dao.deleteOne(sabun);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/guest/list";
		
	}


	
}
