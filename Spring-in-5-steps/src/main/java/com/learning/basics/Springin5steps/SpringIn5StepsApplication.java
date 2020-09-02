package com.learning.basics.Springin5steps;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
	
//@Qualifier
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsApplication.class);
		
		BinarySearchImp binarySearch =
				applicationContext.getBean(BinarySearchImp.class);
	
		int result = 
				binarySearch.BinarySearch(new int[]{1,3,4,6,7},3);
		
		System.out.println(result);
	}

}
