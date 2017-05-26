package com.hb.controller;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.hb.model.SampleDao;

public class DetailController implements FrontImp{
	public String execute(HttpServletRequest req){
		
		SampleDao dao;
		try {
			dao = new SampleDao();
			Map<String,Object> map = dao.selectOne(Integer.parseInt(req.getParameter("idx")));
			dao.close();
			req.setAttribute("bean", map);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "/detail.jsp";
	}
}
