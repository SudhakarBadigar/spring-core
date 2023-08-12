package com.autowiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dao {

	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowiring/constructor/configauto.xml");
		Employee e = context.getBean("emp",Employee.class);
		System.out.println(e);
		System.out.println(".............");
		
		Company c = context.getBean("comp",Company.class);
		System.out.println(c);
		System.out.println("project ended");
		
		
	}
}
