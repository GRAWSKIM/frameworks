package com.hb.day03.support;

import java.util.HashMap;
import java.util.Map;

public class HandlerMapping {
		private static Map<String, String> map =new HashMap<String, String>();
		
		
	public static void setMap(String key, String value) {
		map.put(key,value);
	}
	
	public static MYcontroller mapping(String uri) {
		MYcontroller controller = null;
		
		try{
			Class clzz=Class.forName(map.get(uri));
			controller = (MYcontroller)clzz.newInstance();
			
		}catch (Exception e){
			
		}
		return controller;
	}
	


}
