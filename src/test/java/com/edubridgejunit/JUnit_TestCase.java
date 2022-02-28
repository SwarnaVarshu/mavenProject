package com.edubridgejunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class JUnit_TestCase {
	
	@BeforeClass
	public static void beforeClass() 
	{
		System.out.println("Run Before Class");
	}
	
	@Before
	public void before()
	{
		System.out.println("Run Before Test Case");
	}
	
	@Test
	public void Test() 
	{
		System.out.println("Run main test case");
		
		//assertTrue("Result : " , JUnitFirtsDemo.isGreater(5, 6));
		assertFalse("Result : " , JUnitFirtsDemo.isGreater(5, 6));
	}
	
	
	@After
	public void after()
	{
		System.out.println("Run main test case");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("Run after class");
	}
}
