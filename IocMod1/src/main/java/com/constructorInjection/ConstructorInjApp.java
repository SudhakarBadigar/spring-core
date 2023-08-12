package com.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjApp {
	public static void main(String[] args) {
		System.out.println("start");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/constructorInjection/ConsInjec.xml");
		ConstructorEmployee a = context.getBean("conRef", ConstructorEmployee.class);
		System.out.println(a);
		ContractEmp b = context.getBean("contractCompany",ContractEmp.class);
		System.out.println(b);
		System.out.println("end");
		
		
		
	}

}
