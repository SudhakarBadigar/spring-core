package com.stereotype.resource.copy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpelDao {

	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/stereotype/resource/copy/config.xml");
		SpelIpl spel = context.getBean("ab",SpelIpl.class);
		System.out.println(spel);
		System.out.println(spel.hashCode());
		
		System.out.println("..............");
		SpelIpl spel1 = context.getBean("ab",SpelIpl.class);
		System.out.println(spel1);
		System.out.println(spel1.hashCode());
		
		
		System.out.println("project ended");
	}
}
 