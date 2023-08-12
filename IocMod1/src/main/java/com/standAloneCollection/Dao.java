package com.standAloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dao {

	public static void main(String[] args) {
		System.out.println("project started ");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/standAloneCollection/standAloneConfig.xml");
		Emp e = context.getBean("emp1", Emp.class);
		System.out.println("................");
		System.out.println(e.getVehicle());
		System.out.println(e.getVehicle().getClass().getName());
		System.out.println("................");
		System.out.println(e.getEmail());
		System.out.println(e.getEmail().getClass().getName());
		System.out.println("................");
		System.out.println(e.getName());
		System.out.println(e.getName().getClass().getName());
		System.out.println("................");
		System.out.println(e.getDbprop());
		System.out.println(e.getDbprop().getClass().getName());
		System.out.println("==============================");
		Emp e2 = context.getBean("emp2", Emp.class);
		System.out.println(e2);
		System.out.println("..................");
		System.out.println(e2.getVehicle());
		System.out.println(e2.getVehicle().getClass().getName());
		System.out.println("..................");
		System.out.println(e2.getEmail());
		System.out.println(e2.getEmail().getClass().getName());
		System.out.println("..................");
		System.out.println(e2.getDbprop());
		System.out.println(e2.getDbprop().getClass().getName());
		
		System.out.println("project ended");
	}
}
