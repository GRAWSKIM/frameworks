package com.hb.controller;

import javax.servlet.http.HttpServletRequest;

public class AddController implements FrontImp{

	public String execute(HttpServletRequest req){
		
		return "/insert.jsp";
	}
}
