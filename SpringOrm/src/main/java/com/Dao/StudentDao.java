package com.Dao;

import java.util.List;

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
    
    //fetching single data
    public Student getstudent( int studentUsn) {
    	Student s = hibernateTemplate.get(Student.class, studentUsn);
    	return s;
    }
    
    //fetching multiple records
    
    public List<Student> getAllStudent(){
    	List<Student> loadAll = (List<Student>) hibernateTemplate.loadAll(Student.class);
		return (List<Student>) loadAll;
    	
    }

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
    
    

}
