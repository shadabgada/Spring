package com.example.SpringUnittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringUnittestApplication.class)
public class SomeBusinessImplTest {

	//Getting Bean from Context
	@Autowired
	SomeBusinessImpl someBusinessImpl;
	
	@Test
	public void GreatestNumberTest() {
		assertEquals(24,someBusinessImpl.findGreatestNumber());
	}
	
}
