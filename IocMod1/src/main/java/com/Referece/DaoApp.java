package com.Referece;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoApp {
	public static void main(String[] args) {
		
		System.out.println("start");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Referece/ConfigRef.xml");
           A a = context.getBean("refA",A.class);
           System.out.println(a);
           System.out.println(".............");
           B b = (B)context.getBean("refB");
           System.out.println(b);
           System.out.println("end");
           
	}

}
