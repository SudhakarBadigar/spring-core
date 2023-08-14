package com.crudOperations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.Dao.StudentDao;
import com.Dao.StudentDaoImpl;
import com.entity.Student;

public class App {

	//DriverManagerDataSource
	//JdbcTemplate
	
	public static void main(String[] args) {
		System.out.println("start");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/crudOperations/jdbcconfig.xml");
		StudentDao s = context.getBean("student1",StudentDaoImpl.class);
		Student b = context.getBean("s",Student.class);
		s.insert(b);
		System.out.println("end");
	}
}
