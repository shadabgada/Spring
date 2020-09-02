package com.learning.basics.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.learning.basics.Springin5steps.BinarySearchImp;

@SpringBootApplication
//@ComponentScan("com.learning.basics")
public class ScopeMainClass {

	private static Logger LOGGER = LoggerFactory.getLogger(ScopeMainClass.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = SpringApplication.run(ScopeMainClass.class, args);
		
		/*
		 BinarySearchImp binarySearch =
				applicationContext.getBean(BinarySearchImp.class);
		*/
		
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		
		
		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());
		
		LOGGER.info("{}",personDAO2);
		LOGGER.info("{}",personDAO2.getJdbcConnection());
		
	}
	

}
