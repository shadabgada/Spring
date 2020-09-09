package com.example.SpringUnittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringUnittestApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringUnittestApplication.class);
		
		SomeBusinessImpl someBusinessImpl = applicationContext.getBean(SomeBusinessImpl.class);
		
		System.out.println(someBusinessImpl.findGreatestNumber());
		
		applicationContext.close();
		
	}

}
