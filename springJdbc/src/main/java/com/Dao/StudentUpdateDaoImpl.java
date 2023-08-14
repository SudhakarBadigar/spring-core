package com.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.entity.Student;

public class StudentUpdateDaoImpl implements StudentUpdateDao {

	private JdbcTemplate jdbctemplate1;
	@Override
	public int update(Student student) {
	
		String updateQuery ="update springjdbc.student set usn= ? where usn = ?";
		int result = jdbctemplate1.update(updateQuery,"1dao8mca39","1Da16Mca39");
		System.out.println("Record updated" + result);
		return result;
	}
	public JdbcTemplate getJdbctemplate1() {
		return jdbctemplate1;
	}
	public void setJdbctemplate1(JdbcTemplate jdbctemplate1) {
		this.jdbctemplate1 = jdbctemplate1;
	}
	
	

}
