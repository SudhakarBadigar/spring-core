package com.spring.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoApp 
{
    public static void main( String[] args )
    {
        System.out.println( "project start");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/SpEL/spelConfig.xml");
        SpELExpression s = context.getBean("sp",SpELExpression.class);
        System.out.println(s);
        System.out.println( "project end" );
    }
}
