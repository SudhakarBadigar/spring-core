package com.FetchMultipleRow;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("start");
	     //using xml config
		//	ApplicationContext context = new ClassPathXmlApplicationContext("com/FetchMultipleRow/JdbcFetchMulti.xml");

		//using Annotation
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		
		StudentDao s = context.getBean("mulfetch",StudentDaoImpl.class);
		List<Student> p = s.getstudent();
		for(Student l:p) {
			System.out.println(l);
		}
		
		
		System.out.println("end");
		
	}
}
