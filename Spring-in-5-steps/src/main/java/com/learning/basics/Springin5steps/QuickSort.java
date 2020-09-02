package com.learning.basics.Springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Quick")
public class QuickSort implements SortAlgorithm{

	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		return arr;
	}

}
