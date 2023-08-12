package com.Spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoAppCollection {
	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Spring/collection/ConfigCollection.xml");
		Emp p = context.getBean("Empcollection", Emp.class);
		System.out.println(p);
		
		System.out.println("project end");
	}

}
