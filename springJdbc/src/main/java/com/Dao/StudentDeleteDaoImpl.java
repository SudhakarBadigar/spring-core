package com.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.entity.Student;

public class StudentDeleteDaoImpl implements StudentDeleteDao{

	private JdbcTemplate jdbctemplate2;
	@Override
	public int delete(Student student) {

		String delQuery="delete from springjdbc.student where usn = ?";
		int result = jdbctemplate2.update(delQuery,"1dao8mca40");
		System.out.println("record deleted " + result);
		return result;
	}
	public JdbcTemplate getJdbctemplate2() {
		return jdbctemplate2;
	}
	public void setJdbctemplate2(JdbcTemplate jdbctemplate2) {
		this.jdbctemplate2 = jdbctemplate2;
	}

	
}
