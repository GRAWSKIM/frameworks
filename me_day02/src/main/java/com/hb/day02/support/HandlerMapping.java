package com.hb.day02.support;

import java.util.HashMap;
import java.util.Map;

public class HandlerMapping {
	private static Map<String, String> map = new HashMap<>();
	
	public static void setMap(String param1,String param2){
		map.put(param1, param2);
	}
	public static MyController mapping(String URI){
		MyController controller=null;

		try {
			Class clazz=Class.forName(map.get(URI));
			controller=(MyController) clazz.newInstance();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (InstantiationException e) {
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
	
		return controller;
	}
}
