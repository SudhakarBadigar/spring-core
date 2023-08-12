package com.withoutUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientDao {

	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);
		Pizza p = context.getBean("firstPizza",Pizza.class);
		p.delivery();
		System.out.println(p);
		System.out.println("project ended");
	}
}
