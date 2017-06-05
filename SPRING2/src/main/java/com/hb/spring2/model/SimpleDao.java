package com.hb.spring2.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hb.spring2.util.MyOrcale;

public class SimpleDao implements DaoImpl{
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public SimpleDao() {

	}
	
	@Override
	public List<SimpleVo> selectAll() throws SQLException{
		String sql = "SELECT * FROM SIMPLE03 ORDER BY SABUN";
		List<SimpleVo> list= null;
		
		try{
			conn=MyOrcale.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			list=new ArrayList<>();
			while(rs.next()){
				list.add(new SimpleVo(rs.getInt("sabun"),rs.getString("name"),rs.getDate("nalja"),rs.getInt("pay")));
			}
		}finally{
			closeAll();
		}	
		return list;
	}

	@Override
	public void insertOne(SimpleVo vo) throws SQLException {
		String sql = "INSERT INTO SIMPLE03 VALUES (?,?,SYSDATE,?)";
		
		try {
			conn=MyOrcale.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getSabun());
			pstmt.setString(2, vo.getName());
			pstmt.setInt(3, vo.getPay());
			pstmt.executeQuery();
		}finally{
			closeAll();
			
		}
		
	}
	

	private void closeAll() throws SQLException {
		if(rs!=null)rs.close();
		if(pstmt!=null)rs.close();
		if(conn!=null)rs.close();
	}

	@Override
	public SimpleVo selectOne(int parseInt) throws SQLException {
		String sql= "select * from simple03 where sabun=?";
		SimpleVo bean= null;
		try{
			conn=MyOrcale.getConnection();
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

	@Override
	public int updateOne(SimpleVo bean) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}


}
