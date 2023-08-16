package com.FetchSingleRow;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImpl implements StudentDao{

    private JdbcTemplate jdbctemplatefetchS;
	@Override
	public Student getstudent(String usn) {
		
		String sql ="select * from springjdbc.student where usn = ?";
		RowMapper r = new RowMapperImpl();
        Student stud = this.jdbctemplatefetchS.queryForObject(sql, r, usn);

        return stud;
	}
	public JdbcTemplate getJdbctemplatefetchS() {
		return jdbctemplatefetchS;
	}
	public void setJdbctemplatefetchS(JdbcTemplate jdbctemplatefetchS) {
		this.jdbctemplatefetchS = jdbctemplatefetchS;
	}
	
	
	

}
