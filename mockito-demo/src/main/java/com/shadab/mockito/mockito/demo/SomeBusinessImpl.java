package com.shadab.mockito.mockito.demo;

public class SomeBusinessImpl {

	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

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
