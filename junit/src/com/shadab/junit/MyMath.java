package com.shadab.junit;

public class MyMath {

	
	int sum(int nums[])
	{
		int sum=0;
		
		for(int temp:nums)
		{
			sum=sum+temp;
		}
		return sum;
	}
	
}
