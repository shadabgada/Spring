package com.shadab.mockito.mockito.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.*;


import static org.mockito.Mockito.when;

//MOCK TEST

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationTest {
	@Mock
	DataService dataServiceMock;

	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	@Test
	public void findGreatestNumberTest()
	{
		when(dataServiceMock.retreiveAllData()).thenReturn(new int[] {24,6,15});
		assertEquals(24,businessImpl.findGreatestNumber());
	}

	@Test
	public void findGreatestNumberAmongTwoTest()
	{
		when(dataServiceMock.retreiveAllData()).thenReturn(new int[] {4,15});
		assertEquals(15,businessImpl.findGreatestNumber());
	}

}

