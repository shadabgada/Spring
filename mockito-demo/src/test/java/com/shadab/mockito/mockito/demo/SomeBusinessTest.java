package com.shadab.mockito.mockito.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomeBusinessTest {
	@Test
	public void findGreatestNumberTest()
	{
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findGreatestNumber();
		assertEquals(24,result);
	}
}


//we will have to write this STUB for every data
//i.e we need multiple versions of it based on data.
class DataServiceStub implements DataService{
	@Override
	public int[] retreiveAllData() {
		// TODO Auto-generated method stub
		return new int[] {24,6,15};
	}	
}