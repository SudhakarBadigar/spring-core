package com.mvc.userDao;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class UserDao {
	private HibernateTemplate hibernateTemplate; 

	@Transactional
	public int saveUser(User user) {
		int  id = (Integer) this.hibernateTemplate.save(user);
		return id;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
 }
