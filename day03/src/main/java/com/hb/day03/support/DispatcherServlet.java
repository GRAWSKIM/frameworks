package com.hb.day03.support;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet{	
	
	
	@Override
	public void init() throws ServletException {	
		super.init();
		
		HandlerMapping.setMap("/main.do","com.hb.day03.controller.SelectAll");
		HandlerMapping.setMap("", "");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//controller
		String uri = req.getRequestURI();
		System.out.println(uri);
		MYcontroller controller = HandlerMapping.mapping(uri);
		String path = controller.execute(req, res);
		//view
		
		if(path.startsWith("redirect:")){
			path.replace("redirect:", "");
			res.sendRedirect(path);
			return;
		}
		String prifix="";
		String subfix = ".jsp";
		req.getRequestDispatcher(prifix+path+subfix).forward(req, res);

	}
}
