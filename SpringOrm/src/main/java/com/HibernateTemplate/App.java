package com.HibernateTemplate;

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
    	
    	Student student = new Student();
    	student.setStudentUsn(632638);
    	student.setStudentName("krishna");
    	student.setStudentCity("mathura");
    	
    	bean.insertStudent(student);
    	
    	System.out.println(student);
    	
    	System.out.println("end");
    }
}
