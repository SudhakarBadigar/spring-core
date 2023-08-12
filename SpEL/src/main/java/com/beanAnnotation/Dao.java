package com.beanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Dao {

	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext con = new AnnotationConfigApplicationContext(PizzaConf.class);
		Pizza g = con.getBean("c",Pizza.class);
		g.Delivery();
		System.out.println(g);
		System.out.println("project end");
	}
}
