package com.hb.day03.support;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public interface MYcontroller {
	String execute(ServletRequest req, ServletResponse res) throws ServletException, IOException;
}
