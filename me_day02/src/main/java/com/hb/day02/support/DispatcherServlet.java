package com.hb.day02.support;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.day02.controller.AddController;
import com.hb.day02.controller.InsertController;
import com.hb.day02.controller.ListController;


@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		HandlerMapping.setMap("/day02/list.do", "com.hb.day02.controller.ListController");
		HandlerMapping.setMap("/day02/add.do", "com.hb.day02.controller.AddController");
		HandlerMapping.setMap("/day02/insert.do", "com.hb.day02.controller.InsertController");
	}

       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// /list.do >> /page/list.jsp >list
		// /detail.do >> /page/detail.jsp >detail
		// /add.do >> /page/form.jsp >form
		// /insert.do (post)>> redirect : list.do >redirect:list.do
		// /edit.do >> /page/form.jsp >form
		// /update.do (post)>> redirect : detail.do >redirect:detail.do
		// /del.do (post)>> redirect : detail.do >redirect:detail.do
		
		//controller
		
		String URI = request.getRequestURI();
		MyController controller = HandlerMapping.mapping(URI);
		
		
		String pname = controller.execute(request, response);
		//view
		String url=null;
		if(pname.startsWith("redirect:")){
			url = pname.replace("redirect:", "");
			response.sendRedirect(url);
			return;
		}else {
		String prifix ="/page/";
		String sufix = ".jsp";
		url = prifix+pname+sufix;
		request.getRequestDispatcher(url).forward(request, response);
		}
	}

}
