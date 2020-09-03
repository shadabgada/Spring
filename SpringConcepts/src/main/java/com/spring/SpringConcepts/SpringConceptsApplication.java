package com.spring.SpringConcepts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConceptsApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringConceptsApplication.class);
		
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		
		System.out.println(personDAO);
		
		applicationContext.close();
	}
}
