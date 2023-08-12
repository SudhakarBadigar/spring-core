package com.beanLifeCycle.SpringInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FoodDao {
	public static void main(String[] args) {
		System.out.println("Resturant started");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/beanLifeCycle/SpringInterface/configuration.xml");
		FoodKing c = context.getBean("food",FoodKing.class);
		System.out.println(c);
		System.out.println("Resturant closed");
		context.registerShutdownHook();
	}

}
