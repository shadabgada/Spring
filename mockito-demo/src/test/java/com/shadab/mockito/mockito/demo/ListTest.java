package com.shadab.mockito.mockito.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ListTest {

	@Mock
	List listMock;
	
	@Test
	public void IntIndexTest()
	{
		when(listMock.get(Mockito.anyInt())).thenReturn("valid index");
		assertEquals("valid index",listMock.get(9));
		assertEquals("valid index",listMock.get(5));
	}

	@Test
	public void returnOnSpecificIndexCall()
	{
		when(listMock.get(10)).thenReturn(50);
		assertEquals(50,listMock.get(10));
		assertEquals(null,listMock.get(15));
	}
	
	
	@Test
	public void returnOnMethodCall()
	{
		when(listMock.size()).thenReturn(10).thenReturn(15);
		assertEquals(10,listMock.size());
		assertEquals(15,listMock.size());
	}	
}
