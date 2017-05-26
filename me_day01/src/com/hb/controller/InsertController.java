package com.hb.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.hb.model.SampleDao;

public class InsertController implements FrontImp{

	public String execute(HttpServletRequest req){
		
		try {
			SampleDao dao = new SampleDao();
			dao.insertOne(Integer.parseInt(req.getParameter("sabun")), req.getParameter("name"), Integer.parseInt(req.getParameter("pay")));
			dao.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "/list.do";
			
	}
}
