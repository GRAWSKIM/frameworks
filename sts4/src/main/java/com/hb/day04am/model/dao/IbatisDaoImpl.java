package com.hb.day04am.model.dao;

import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.hb.day04am.model.dto.GuestVo;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class IbatisDaoImpl implements GuestDao {

	private SqlMapClient sqlMapClient;

	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}
	public IbatisDaoImpl() {
		
	}
	@Override
	public List<GuestVo> selectAll() throws SQLException {
		List<GuestVo> list = sqlMapClient.queryForList("selectAll");		
		return list;
	}

	@Override
	public GuestVo selectOne(int sabun) throws SQLException {
		
		return (GuestVo)sqlMapClient.queryForObject("selectOne", sabun);
	}

	@Override
	public void insertOne(GuestVo bean) throws SQLException {
		sqlMapClient.insert("intsertOne", bean);

	}

	@Override
	public int updateOne(GuestVo bean) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(GuestVo bean) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
