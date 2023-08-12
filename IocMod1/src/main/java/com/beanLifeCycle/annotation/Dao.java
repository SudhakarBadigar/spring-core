package com.beanLifeCycle.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dao {
	public static void main(String[] args) {
		System.out.println("project start");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/beanLifeCycle/annotation/config.xml");
		Dominos d = context.getBean("pizza", Dominos.class);
		System.out.println(d);
		context.registerShutdownHook();
		System.out.println("project end");
		
	}

}
