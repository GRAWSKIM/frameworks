package com.hb.day03.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import com.hb.day03.model.SimpleDao;
import com.hb.day03.support.MYcontroller;

public class InsertOne implements MYcontroller{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		if(!"POST".equals(req.getMethod())){
			
			System.out.println("그냥실패");
			return "err";		
		}
		req.setCharacterEncoding("UTF-8");	
		SimpleDao dao= new SimpleDao();
		try{
				String name=req.getParameter("name");
				String nalja=req.getParameter("nalja");
				int pay=Integer.parseInt(req.getParameter("pay"));
				
				int result=dao.insertOne(name,nalja,pay);
				if(result>0){
				return "redirect:/list.do";
				}else{
					System.out.println("else에러");
					return "form";			
				}
			}catch (Exception e) {
				System.out.println("ex에러");
				return "form";			
			}
		}
		

	
}
