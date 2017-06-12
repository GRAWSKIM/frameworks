package com.hb.day01.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hb.day01.model.SimpleDao;

@Controller
public class SimpleController {
	private SimpleDao dao;
	
	@Autowired
	public void setDao(SimpleDao dao) {
		this.dao = dao;
	}
	public SimpleController() {}
	
	@RequestMapping("/list")
	public String list(Model mod){
		try {
			mod.addAttribute("alist", dao.selectAll());
		} catch (SQLException e) {
			System.out.println("dao¹®Á¦");
			e.printStackTrace();
		}
		return "SIMPLE/list";
	}
	
	@RequestMapping("add")
	public String addForm(){
		return "SIMPLE/add";
	}
	
	@RequestMapping("insert")
	public String insertOne(int sabun,String name, int pay){
		try {
			dao.insertOne(sabun,name,pay);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "redirect:list";
	}
	
	@RequestMapping("detail/{num}")
	public String detailOne(@PathVariable int num,Model mod){
		
		try {
			mod.addAttribute("bean", dao.selectOne(num));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "SIMPLE/detail";
	}
	
	@RequestMapping("edit/{num}")
	public String editOne(@PathVariable int num,Model mod){
		
		try {
			mod.addAttribute("bean", dao.selectOne(num));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "SIMPLE/edit";
	}
	
	@RequestMapping("update")
	public String updatetOne(int sabun,String name, int pay){
		try {
			dao.updatetOne(sabun,name,pay);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "redirect:list";
	}
	
	@RequestMapping("delete/{num}")
	public String delOne(@PathVariable int num){
		
		try {
			 dao.deleteOne(num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "redirect:../list";
	}
}
