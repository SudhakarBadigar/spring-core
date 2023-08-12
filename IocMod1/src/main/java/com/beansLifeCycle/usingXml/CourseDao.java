package com.beansLifeCycle.usingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourseDao {
	public static void main(String[] args) {
		System.out.println("project started");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/beansLifeCycle/usingXml/Config.xml");
		Course e = context.getBean("course1" ,Course.class);
		context.registerShutdownHook();
		System.out.println(e);
		System.out.println("project ended");
		
		
	}

}
