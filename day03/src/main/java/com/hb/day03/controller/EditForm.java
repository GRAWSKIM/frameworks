package com.hb.day03.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.day03.model.SimpleDao;
import com.hb.day03.model.SimpleVo;
import com.hb.day03.support.MYcontroller;

public class EditForm implements MYcontroller{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setAttribute("title", "¼öÁ¤");
		req.setAttribute("nxtURI", "update.do");
		
		int sabun= Integer.parseInt(req.getParameter("sabun"));
		SimpleDao dao = new SimpleDao();
		SimpleVo bean = new SimpleVo();
		try {
			bean = dao.selectOne(sabun);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			req.setAttribute("bean", bean);
		
		
		return "form";
	}

}
