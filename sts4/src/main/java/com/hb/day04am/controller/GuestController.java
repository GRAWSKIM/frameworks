package com.hb.day04am.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.day04am.model.dao.GuestDao;
import com.hb.day04am.model.dao.IbatisDaoImpl;
import com.hb.day04am.model.dto.GuestVo;

@Controller
public class GuestController {
	
	@Autowired
	GuestDao dao;
	
	String path;
	
	
	@RequestMapping("guest/list")
	public void selectAll(Model model,HttpServletRequest req){

		try {
			model.addAttribute("alist",dao.selectAll());
			model.addAttribute("root",path=req.getContextPath());
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
	
}
