package com.FetchSingleRow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("start");
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/FetchSingleRow/JdbcFetchSingle.xml");
	    
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationSingleFetch.class);
		
		StudentDao sdi = context.getBean("sinfetch",StudentDaoImpl.class);
	   Student p = sdi.getstudent("1dao8mca38");
	   System.out.println(p);

	   System.out.println("end");
	}

}
