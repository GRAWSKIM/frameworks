package com.hb.day03.guest.model.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hb.day03.guest.model.Dto.GuestDto;

	

public class GuestDao3Impl implements GuestDao{

	@Autowired
	private JdbcOperations jdbcTemple;
	public void setJdbcTemple(JdbcOperations jdbcTemple) {
		this.jdbcTemple = jdbcTemple;
	}
	
	@Override
	public List<GuestDto> selectAll() throws SQLException {
		
		return jdbcTemple.query("SELECT * FROM FROM GUEST_USER",new RowMapper<GuestDto>() {

			@Override
			public GuestDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				GuestDto bean = new GuestDto();
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setNum(rs.getInt("num"));
				return bean;
			}
		});
	}

	@Override
	public GuestDto selectOne(int num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateOne(GuestDto bean) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletOne(int num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertOne(GuestDto bean) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
