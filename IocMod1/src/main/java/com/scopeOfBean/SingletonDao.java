package com.scopeOfBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonDao {

	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/scopeOfBean/resource/singltonconfig.xml");
		Singleton s = context.getBean("single",Singleton.class);
		System.out.println(s.hashCode());
		
		Singleton s2 = context.getBean("single",Singleton.class);
		System.out.println(s2.hashCode());
	}
}
