package com.hb.model;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class SampleDaoTest {
	static Logger logger=Logger.getLogger(SampleDaoTest.class);
	SampleDao dao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		dao = new SampleDao(false);//테스트용 생성자 호출
	}

	
	@After
	public void tearDown() throws Exception {
		dao.back();//test후에 입력된자료 지움
	}

	@Test
	public void testSampleDao() throws ClassNotFoundException, SQLException {
		Assert.assertNotNull(new SampleDao());
	}

	@Test
	public void testSelectAll() throws ClassNotFoundException, SQLException {
		
		
		List<Map<String,Object>> list = dao.selectAll();
		Assert.assertNotNull(list);
		Assert.assertTrue(list.size()>0);
		for(Map<String,Object> map : list){
			logger.debug(map.get("sabun"));
		}
		
		
	}
	@Test
	public void testSelectOne() throws ClassNotFoundException, SQLException{ 
		
		int sabun=1000;
		Map<String,Object> map = dao.selectOne(sabun);
		
		Assert.assertNotNull(map);
		Assert.assertEquals(sabun, map.get("sabun"));
		assertEquals(9000, map.get("pay"));
	}
	@Test
	public void testInsertOne() throws SQLException{
		int sabun = 4000;
		int pay = 9800;
		String name="ㄱㅇㄹ";
		int result = dao.insertOne(sabun, name, pay);
		assertSame(1, result);
			
	}
	
}
