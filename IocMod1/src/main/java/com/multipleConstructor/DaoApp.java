package com.multipleConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoApp {

	public static void main(String[] args) {
		System.out.println("start");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/multipleConstructor/Mconfig.xml");
		Mconstruct a = context.getBean("mcon", Mconstruct.class);
		System.out.println(a);
		a.add();
		
		//add();
		System.out.println("end");
	}
}
