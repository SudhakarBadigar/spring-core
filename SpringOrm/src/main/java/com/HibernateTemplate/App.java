package com.HibernateTemplate;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;

import com.Dao.StudentDao;
import com.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("start");
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringOrm.xml");
    	//HibernateTemplate
    //	LocalSessionFactoryBean
    //	DriverManagerDataSource
    //	HibernateJpaDialect
    	//hibernateDialect
    //	HibernateTransactionManager
    	
    	StudentDao bean = context.getBean("studentdao", StudentDao.class);
    	System.out.println(bean);
    	System.out.println(".......................");
    	System.out.println("inserting one record");
    	Student student = new Student();
    	student.setStudentUsn(632642);
    	student.setStudentName("vamana");
    	student.setStudentCity("kerala");
    	
    	bean.insertStudent(student);
    	System.out.println(student);
    	System.out.println("..................");

    	System.out.println("Fetching Single data");
    	Student getstudent = bean.getstudent(632639);
    	System.out.println(getstudent);
    	System.out.println(".............");
    	System.out.println("Feching Multiple data");
    	
    	List<Student> allStudent = bean.getAllStudent();
    	for(Student a:allStudent) {
    		System.out.println(a);
    	}
    	 
    	
    	System.out.println("end");
    }
}
