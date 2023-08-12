package com.InjectObjectIntoOther;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Dao {
	public static void main(String[] args) {
		System.out.println("start");
		ApplicationContext context= new AnnotationConfigApplicationContext(Pizzaconf.class);
		Pizza p = context.getBean("a",Pizza.class);
		p.Delivery();
		System.out.println(p);
		System.out.println("end");
	}

}
