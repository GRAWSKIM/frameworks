package com.hb.day01.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SimpleDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	public SimpleDao() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","scott","tiger");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public List<SimpleVo> selectAll() throws SQLException{
		List<SimpleVo> list = new ArrayList<>();
		String sql = "SELECT * FROM SIMPLE03 ORDER BY SABUN";
		try{
			pstmt = conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			while(rs.next()){
				list.add(new SimpleVo(rs.getInt("sabun"),rs.getInt("pay"),rs.getString("name"),rs.getDate("nalja")));
			}
		}finally{
			closeAll();
		}
	
		return list;
	}
	public int insertOne(SimpleVo bean) throws SQLException {
		String sql= "INSERT INTO SIMPLE03 VALUES(?,?,SYSDATE,?)";
		try{
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bean.getSabun());
			pstmt.setString(2,bean.getName());
			pstmt.setInt(3, bean.getPay());
			return pstmt.executeUpdate();
		}finally{
			closeAll();
		}	
	}
	private void closeAll() throws SQLException{
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
	public SimpleVo selectOne(int sabun) throws SQLException {
		String sql="SELECT * FROM SIMPLE03 WHERE SABUN=?";
		SimpleVo bean = new SimpleVo();
		try{
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, sabun);
			rs= pstmt.executeQuery();
			if(rs.next()){
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setPay(rs.getInt("pay"));
				bean.setNalja(rs.getDate("nalja"));
		}
		}finally{
			closeAll();
		}
		return bean;
	}
	public int UpdateOne(SimpleVo bean) throws SQLException {
		String sql ="UPDATE SIMPLE03 SET NAME=?,PAY=? WHERE SABUN=?";
		
		try{
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setInt(2, bean.getPay());
			pstmt.setInt(3, bean.getSabun());
			return pstmt.executeUpdate();
		}finally{
			closeAll();
		}
	}
}
