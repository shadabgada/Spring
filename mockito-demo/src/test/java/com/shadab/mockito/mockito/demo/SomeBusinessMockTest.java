package com.shadab.mockito.mockito.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//MOCK TEST

public class SomeBusinessMockTest {
	@Test
	public void findGreatestNumberTest()
	{
		DataService dataServiceMock = mock(DataService.class);
		
		when(dataServiceMock.retreiveAllData()).thenReturn(new int[] {24,6,15});
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findGreatestNumber();
		assertEquals(24,result);
	}
}

