package com.hb.struts.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;

public class SimpleDao {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public SimpleDao(){
		
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "scott";
		String password="tiger";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url,id,password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<SimpleVo> selectAll() throws SQLException{
		List<SimpleVo> list= new ArrayList<>();
		String sql = "SELECT * FROM SIMPLE03 ORDER BY SABUN";
		try{
		pstmt=conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()){
			list.add(new SimpleVo(
					rs.getInt("sabun"), 
					rs.getString("name"), 
					rs.getDate("nalja"),
					rs.getInt("pay")
					));
		}
		}finally{
			closeAll();
		}
		return list;
	}
	private void closeAll() throws SQLException {
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
		
	}
}
