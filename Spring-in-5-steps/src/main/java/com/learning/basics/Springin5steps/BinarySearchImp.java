package com.learning.basics.Springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImp {

	//sort
	@Autowired
	@Qualifier("Quick")
	private SortAlgorithm sortAlgorithm;

	
	/*public BinarySearchImp(com.learning.basics.Springin5steps.SortAlgorithm sortAlgorithm) {
		super();
		SortAlgorithm = sortAlgorithm;
	}*/

	public SortAlgorithm getSortAlgorithm() {
		return sortAlgorithm;
	}


	public void setSortAlgorithm(com.learning.basics.Springin5steps.SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public int BinarySearch(int arr[], int numberToSearch)
	{
		int sortedNumbers[] = sortAlgorithm.sort(arr);
		System.out.println("In binary search method"+sortAlgorithm);
		return 3;
	}

}
