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
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSampleDao() throws ClassNotFoundException, SQLException {
		Assert.assertNotNull(new SampleDao());
	}

	@Test
	public void testSelectAll() throws ClassNotFoundException, SQLException {
		SampleDao dao = new SampleDao();
		List<Map<String,Object>> list = dao.selectAll();
		Assert.assertNotNull(list);
		Assert.assertTrue(list.size()>0);
		for(Map<String,Object> map : list){
			logger.debug(map.get("sabun"));
		}
		
		
	}

}
