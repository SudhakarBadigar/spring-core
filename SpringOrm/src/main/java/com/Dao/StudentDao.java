package com.Dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Student;

public class StudentDao {
	
    private HibernateTemplate hibernateTemplate;
	
    @Transactional
    public int insertStudent(Student student) {
		 int i = (int) this.hibernateTemplate.save(student);
		
		 return i;
	
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
    
    

}
