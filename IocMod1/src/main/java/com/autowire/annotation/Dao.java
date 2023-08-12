package com.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dao {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowire/annotation/config.xml");
		Apps a = context.getBean("app1",Apps.class);
		System.out.println(a);
		Apps a2 = context.getBean("app2",Apps.class);
		System.out.println(a2);
		System.out.println(".............");
		Mobile m = context.getBean("mob",Mobile.class);
		System.out.println(m);
	}
}
