package com.example.SpringUnittest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeBusinessImpl {
	
	@Autowired
	private DataService dataService;
	
	

	
	int findGreatestNumber() {
		int[] data = dataService.retreiveAllData();
		int greatest = Integer.MIN_VALUE;
		
		for(int value:data) {
			if(value > greatest) {
				greatest=value;
			}
		}		
		
		return greatest;
			
	}
}

@Component
class DataServiceStub implements DataService{
	@Override
	public int[] retreiveAllData() {
		// TODO Auto-generated method stub
		return new int[] {24,6,15};
	}	
}
