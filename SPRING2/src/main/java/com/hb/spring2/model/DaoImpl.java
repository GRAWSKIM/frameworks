package com.hb.spring2.model;

import java.sql.SQLException;
import java.util.List;

public interface DaoImpl {

	void insertOne(SimpleVo vo) throws SQLException;
	List<SimpleVo> selectAll() throws SQLException;
	SimpleVo selectOne(int parseInt) throws SQLException;

	int updateOne(SimpleVo bean) throws SQLException;

}
