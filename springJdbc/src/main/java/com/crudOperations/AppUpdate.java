package com.crudOperations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.Dao.StudentUpdateDao;
import com.Dao.StudentUpdateDaoImpl;
import com.entity.Student;

public class AppUpdate {
	public static void main(String[] args) {
		System.out.println("start");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/crudOperations/UpdateJdbcConfig.xml");
		StudentUpdateDao c = context.getBean("supd",StudentUpdateDaoImpl.class);
	//	Student s = context.getBean("sud",Student.class);
		c.update(null);
		//DriverManagerDataSource
		//JdbcTemplate
		System.out.println("end");
	
	}

}
