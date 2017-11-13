package com.iqtc.junit;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.iqtc.dao.LoginDao;
import com.iqtc.dao.UserDaoImpl;

import junit.framework.TestCase;

public class LoginTest {
	
	@Before
	public void beforeTest()
	{
		System.out.println("Before Test Run...");
		
	}
	
	@Test
	public void LoginTest()
	{
		LoginDao user=new UserDaoImpl();
		assertTrue(user.ValidateUser("admin","12345"));
		
	}
	
	
	
	@After
	public void afterTest()
	{
		System.out.println("After Test Run .......");
	}

}
