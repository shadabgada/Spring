package com.shadab.junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
	MyMath myMath = new MyMath();
	
	
	@Before
	public void before()
	{
		System.out.println("Before");
	}
	
	@Test
	public void sum_with3numbers()
	{
		System.out.println("in test method");
		assertEquals(6,myMath.sum(new int[] {1,2,3}));
	}
	@Test
	public void sum_with1numbers()
	{
		System.out.println("in test method");
		assertEquals(3,myMath.sum(new int[] {3}));
		
		//assertTrue(condition);
		//assertFalse(condition);
		//assertArraysEqual(expected,actual);
		
	}
	
	@AfterClass
	public static void afterClassMethod()
	{
		System.out.println("after class");
	}
}

