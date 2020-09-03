package com.spring.XML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringXmlClass {

public static void main(String[] args) {
		
	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

	/*
	 * This is for Pure Spring without XML files.
	 * 
				AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringXmlClass.class);
				
	 * You can remove @configuration annotation 
	 *  You can remove @ComponentScan annotation as well and add context tag in xml
	*/	
		XmlPersonDAO xmlpersonDAO = applicationContext.getBean(XmlPersonDAO.class);
		
		System.out.println(xmlpersonDAO);
		
		applicationContext.close();
	}
}
