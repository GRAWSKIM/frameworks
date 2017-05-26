package com.hb.engine;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.controller.AddController;
import com.hb.controller.DetailController;
import com.hb.controller.FrontImp;
import com.hb.controller.InsertController;
import com.hb.controller.ListController;
import com.hb.model.SampleDao;


public class FrontController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doDo(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		doDo(req, resp);
	}
	
	
	protected void doDo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String url="/index";
		String path= req.getRequestURI();
	
	
			FrontImp controller = null;
			
			if(path.equals("/me_day01/list.do")){
				controller = new ListController();				
				
				
			}else if(path.equals("/me_day01/insert.do")&&"POST".equals(req.getMethod())){
				controller = new InsertController();
				
				
			}else if(path.equals("/me_day01/detail.do")){
				controller = new DetailController();
			
				
			}else if(path.equals("/me_day01/add.do")){
				controller = new AddController();
				
			}
			url = controller.execute(req);
			
			
		
		
	
		
		req.getRequestDispatcher(url).forward(req, resp);
	}
	
	
}
