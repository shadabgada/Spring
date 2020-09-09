package com.example.SpringUnittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

//we dont need context while using Mockito
@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessImplMockito {

	//Getting Bean from Context

		@Mock
		DataService dataService;
		
		@InjectMocks
		SomeBusinessImpl someBusinessImpl;
		
		@Test
		public void GreatestNumberTest() {
			Mockito.when(dataService.retreiveAllData()).thenReturn(new int[] {3,4,5});
			assertEquals(5,someBusinessImpl.findGreatestNumber());
		}
}
