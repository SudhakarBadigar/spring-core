package com.crudOperations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.Dao.StudentDeleteDaoImpl;

public class AppDelete {
	
	public static void main(String[] args) {
		//DriverManagerDataSource
		System.out.println("start");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/crudOperations/deleteJdbcConfig.xml");
		StudentDeleteDaoImpl p = context.getBean("sded",StudentDeleteDaoImpl.class);
		p.delete(null);
		System.out.println("end");
	}

}
