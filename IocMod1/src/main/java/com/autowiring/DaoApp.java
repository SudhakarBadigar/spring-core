package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoApp {
	
	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowiring/config.xml");
		
		System.out.println("...........................");
		Student s = context.getBean("stud",Student.class);
		System.out.println(s);
		System.out.println("........................");
		Certificate c = context.getBean("certiref", Certificate.class);
		System.out.println(c);
		
		System.out.println("project ended");
	}

}
