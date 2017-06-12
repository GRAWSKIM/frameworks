package com.hb.day03.guest.model.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.hb.day03.guest.model.Dto.GuestDto;

public class GuestDaoImpl implements GuestDao {
	@Autowired
	private DataSource datasource;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	@Override
	public List<GuestDto> selectAll() throws SQLException {
		String sql="SELECT * FROM GUEST_USER ORDER BY SABUN";
		List<GuestDto> list = null;
		try{
			conn=datasource.getConnection();
			pstmt= conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			list = new ArrayList<GuestDto>();
			while(rs.next()){
				list.add(new GuestDto(rs.getInt("num"), rs.getInt("sabun"), rs.getString("name"), rs.getDate("nalja")));
			}
		}finally{
			closeAll();
		}
		
		return list;
	}

	

	@Override
	public void insertOne(GuestDto bean) throws SQLException {
		String sql="INSERT INTO GUEST_USER VALUES (?,?,?,SYSDATE)";
		
		try{
			conn=datasource.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bean.getNum());
			pstmt.setInt(2, bean.getSabun());
			pstmt.setString(3, bean.getName());
			pstmt.executeUpdate();
		}finally{
			closeAll();
		}
		
	}



	@Override
	public int updateOne(GuestDto bean) throws SQLException {
		String sql="UPDATE GUEST_USER SET NUM=?, NAME=? WHERE SABUN=?";
		try{
			conn=datasource.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bean.getNum());
			pstmt.setString(2, bean.getName());
			pstmt.setInt(3, bean.getSabun());
			return pstmt.executeUpdate();
		}finally{
			closeAll();
		}

	}

	@Override
	public int deletOne(int num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GuestDto selectOne(int num) throws SQLException {
		GuestDto bean =null;
		String sql = "SELECT * FROM GUEST_USER WHERE SABUN=?";
		try{
			conn=datasource.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()){
				bean=new GuestDto(rs.getInt("num"), rs.getInt("sabun"), rs.getString("name"), rs.getDate("nalja"));
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

}
