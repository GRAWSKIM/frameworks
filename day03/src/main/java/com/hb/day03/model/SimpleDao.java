package com.hb.day03.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SimpleDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	public SimpleDao(){
		String url="jdbc:h2:tcp://localhost/~/test";
		String user="sa";
		String password="";
		try {
			Class.forName("org.h2.Driver");
			conn= DriverManager.getConnection(url, user, password);
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}
	public List<SimpleVo> selectAll() throws SQLException {
		String sql = "SELECT * FROM SIMPLE02";
		List<SimpleVo> list = new ArrayList<>();
		
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){				
				SimpleVo bean = new SimpleVo();
				bean.setNalja(rs.getString("nalja"));
				bean.setName(rs.getString("name"));
				bean.setPay(rs.getInt("pay"));
				bean.setSabun(rs.getInt("sabun"));
				list.add(bean);
			}
			close();
		return list;
	}
	private void close() throws SQLException {
		rs.close();
		pstmt.close();
		conn.close();
		
	}
	

}
