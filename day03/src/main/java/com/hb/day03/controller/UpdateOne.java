package com.hb.day03.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.day03.model.SimpleDao;
import com.hb.day03.support.MYcontroller;

public class UpdateOne implements MYcontroller	{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		if(!"POST".equals(req.getMethod())){
			return "err";
		}
		
		req.setCharacterEncoding("UTF-8");
		String name= req.getParameter("name");
		String nalja= req.getParameter("nalja");
		int pay = Integer.parseInt(req.getParameter("pay"));
		int sabun = Integer.parseInt(req.getParameter("sabun"));
		
		SimpleDao dao =new SimpleDao();
		int result = 0;
		try {
			result = dao.updateOne(sabun,name,nalja,pay);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(result>0){
			return "redirect:list.do";			
		}else{
			return "redirect:edit.do?idx="+sabun;
		}
	}

}
