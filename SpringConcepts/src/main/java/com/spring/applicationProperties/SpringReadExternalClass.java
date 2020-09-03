package com.spring.applicationProperties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class SpringReadExternalClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringReadExternalClass.class);
		
		ReadFromExternal readFromExternal = applicationContext.getBean(ReadFromExternal.class);
		
		System.out.println(readFromExternal.getUrl());
		
		applicationContext.close();
	}
}
