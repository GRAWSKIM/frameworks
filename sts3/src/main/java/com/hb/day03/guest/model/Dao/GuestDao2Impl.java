package com.hb.day03.guest.model.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hb.day03.guest.model.Dto.GuestDto;

public class GuestDao2Impl extends JdbcTemplate implements GuestDao {

	private DataSource dataSource;
	
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		super.setDataSource(dataSource);
	}
	
	@Override
	public List<GuestDto> selectAll() throws SQLException {
		
		return query("SELECT * FROM GUEST_DAY03 ORDER BY SABUN"
				, new RowMapper<GuestDto>(){

					@Override
					public GuestDto mapRow(ResultSet rs, int idx) throws SQLException {
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
	public GuestDto selectOne(int sabun) throws SQLException {
		// TODO Auto-generated method stub
		return (GuestDto)queryForObject("SELECT * FROM GUEST_DAY03 WHERE SABUN=?"
				,new Object[]{sabun}
				,new RowMapper() {

					@Override
					public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
						GuestDto bean=new GuestDto(
								rs.getInt("sabun")
								,rs.getInt("num")
								,rs.getString("name")
								,rs.getDate("nalja")
								);
						return bean;
					}
					
				}
				);
	}

	@Override
	public void insertOne(GuestDto bean) throws SQLException {
		// TODO Auto-generated method stub
		Object[] obj={bean.getSabun(),bean.getName(),bean.getNum()};
		update("INSERT INTO GUEST_DAY03 "
				+ "VALUES (?,?,TO_CHAR(SYSDATE,'YYYY/MM/DD'),?)",obj);
	}

	@Override
	public int updateOne(GuestDto bean) throws SQLException {
		// TODO Auto-generated method stub
		return update("UPDATE GUEST_DAY03 SET NAME=?,PAY=? WHERE SABUN=?"
				,new Object[]{bean.getName(),bean.getNum(),bean.getSabun()}
				);
	}

	
	@Override
	public int deletOne(int num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}


}