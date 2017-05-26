package com.hb.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.hb.model.SampleDao;

public class ListController implements FrontImp{
	
	public String execute(HttpServletRequest req){
		
		
		List<Map<String, Object>> list;
		try {
			SampleDao dao = new SampleDao();
			list = dao.selectAll();
			req.setAttribute("alist", list);
			dao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "/list.jsp";
	}
}
