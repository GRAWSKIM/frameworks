package com.hb.day04am.model.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hb.day04am.model.dto.GuestVo;

public class IbatisDaoImplTest {

	private static GuestDao guestDao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/config-context.xml");
		guestDao = (GuestDao)ac.getBean("guestDao");
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
	public void testSelectAll() throws SQLException {
		List<GuestVo> list = guestDao.selectAll();
		for(GuestVo bean:list){
			System.out.println(bean.toString());
		}
	}

	@Test
	public void testSelectOne() {
//		fail("Not yet implemented");
	}

	@Test
	public void testInsertOne() {
//		fail("Not yet implemented");
	}

	@Test
	public void testUpdateOne() {
//		fail("Not yet implemented");
	}

	@Test
	public void testDeleteOne() {
//		fail("Not yet implemented");
	}

}
