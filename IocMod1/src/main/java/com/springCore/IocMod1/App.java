package com.springCore.IocMod1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/IocMod1/config1.xml");
        Student a = (Student) context.getBean("student1");
        System.out.println(a);
        System.out.println(a.getName());
        System.out.println(".....................................................");
//        Student b=(Student) context.getBean("student2");
//        System.out.println(b);
//       System.out.println(b.getName());
//       
        System.out.println( "project Execution completed" );
        
    }
}
