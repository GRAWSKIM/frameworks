package com.hb.day02.user.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class GuestUserDaoImpl implements GuestUserDao<GuestUserVo> {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	@Autowired
	private DataSource dastSource;
	
	public GuestUserDaoImpl() {
		
	}
	@Override
	public List<GuestUserVo> selectAll() throws SQLException {
		String sql = "SELECT * FROM GUEST_USER ORDER BY SABUN";
		List<GuestUserVo> list= null;
		try{
			conn=dastSource.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			list=new ArrayList<GuestUserVo>();
			while(rs.next()){
				list.add(new GuestUserVo(
						rs.getInt("num"),
						rs.getInt("sabun"),
						rs.getString("name"),
						rs.getDate("nalja")						
						));
			}
			
		}finally{
			closeAll();			
		}
		
		return list;
	}

	

	@Override
	public GuestUserVo selectOne(int idx) throws SQLException {
		String sql = "SELECT * FROM GUEST_USER WHERE NUM=?";
		GuestUserVo bean= null;
		try{
			conn= dastSource.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				bean=new GuestUserVo(
						rs.getInt("num"),
						rs.getInt("sabun"),
						rs.getString("name"),
						rs.getDate("nalja")						
						);
			}
			
		}finally{
			closeAll();
		}
		return bean;
	}

	@Override
	public void insertOne(GuestUserVo bean) throws SQLException {
		String sql = "INSERT INTO GUEST_USER VALUES (?,?,?,SYSDATE)";
		try{
			conn=dastSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bean.getNum());
			pstmt.setInt(2, bean.getSabun());
			pstmt.setString(3, bean.getName() );
			pstmt.executeQuery();
		}finally{
			closeAll();
		}
		
	}

	@Override
	public int updateOne(GuestUserVo bean) throws SQLException {
		String sql="UPDATE GUEST_USER SET SABUN=?,NAME=?,WHERE NUM=?";
		
		try{
			conn=dastSource.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bean.getSabun());
			pstmt.setString(2, bean.getName());
			pstmt.setInt(3, bean.getNum());
			pstmt.executeUpdate();
			
		}finally{
			closeAll();
		}
		return 0;
	}

	@Override
	public int deleteOne(int idx) throws SQLException {
		String sql="DELETE FROM GUEST_USER WHERE NUM=?";
		try{
			conn=dastSource.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.executeUpdate();
		}finally{
			closeAll();
		}
		return 0;
	}
	private void closeAll() throws SQLException {
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(rs!=null)rs.close();
	}

}
