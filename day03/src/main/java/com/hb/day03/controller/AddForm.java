package com.hb.day03.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.day03.support.MYcontroller;

public class AddForm implements MYcontroller{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setAttribute("title", "ют╥б");
		req.setAttribute("nxtURI", "insert.do");
		
		return "form";
	}
	
}
