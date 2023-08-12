package com.JdbcTemplate.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DeleteApp {
	public static void main(String[] args) {
		System.out.println("start");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/JdbcTemplate/springJdbc/springjdbcconfig.xml");
		JdbcTemplate j = context.getBean("JdbcTemplate",JdbcTemplate.class);
		String query="delete from springjdbc.student where usn =?";
		int b = j.update(query,"1Da16Mca40");
		System.out.println("Record deleted" +b);
		System.out.println("end");
	}

}
