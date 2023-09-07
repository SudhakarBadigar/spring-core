package com.mvc.userDao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.model.User;

public class UserDao {
	private HibernateTemplate hibernateTemplate; 

	public int saveUser(User user) {
		return 0;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
