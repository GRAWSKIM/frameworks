package com.hb.day03.guest.model.Dao;

import java.sql.SQLException;
import java.util.List;

import com.hb.day03.guest.model.Dto.GuestDto;

public interface GuestDao {
	
	List<GuestDto> selectAll() throws SQLException;
	GuestDto selectOne(int num) throws SQLException;
	int updateOne(GuestDto bean) throws SQLException;
	int deletOne(int num) throws SQLException;
	void insertOne(GuestDto bean) throws SQLException;
}
