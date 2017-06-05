package com.hb.spring2.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;



public class SimpleDao2 implements DaoImpl{

	private ResultSet rs;
	private PreparedStatement pstmt;
	private Connection conn;
	private DataSource ds;
	
	public SimpleDao2() {	
		try {
			InitialContext context = new InitialContext();
			ds=(DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void insertOne(SimpleVo vo) throws SQLException {
		String sql = "INSERT INTO SIMPLE03 VALUES (?,?,SYSDATE,?)";
		
		try {
			conn=ds.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getSabun());
			pstmt.setString(2, vo.getName());
			pstmt.setInt(3, vo.getPay());
			pstmt.executeUpdate();
		}finally{
			closeAll();
			
		}
		
	}

	@Override
	public List<SimpleVo> selectAll() throws SQLException {
		List<SimpleVo> list= null;
		String sql = "SELECT * FROM SIMPLE03 ORDER BY SABUN";
		try{
			conn=ds.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			list = new ArrayList<>();
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

	@Override
	public SimpleVo selectOne(int parseInt) throws SQLException {
		String sql= "select * from simple03 where sabun=?";
		SimpleVo bean= null;
		try{
			conn=ds.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, parseInt);
			rs=pstmt.executeQuery();
			if(rs.next()){
				bean= new SimpleVo(
						rs.getInt("sabun"),
						rs.getString("name"),
						rs.getDate("nalja"),
						rs.getInt("pay")						
						);
			}
		}finally{
			closeAll();
		}
				
		return bean;
	}
	private void closeAll() throws SQLException {
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}

	@Override
	public int updateOne(SimpleVo bean) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}


}
