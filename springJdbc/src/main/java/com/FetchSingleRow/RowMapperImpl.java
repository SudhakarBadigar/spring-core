package com.FetchSingleRow;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Student> {

	
	//Rowmapper contains one method that is maprow it accepts 2 arguments one is reult set and the rownum
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s = new Student();
		// in jdbc we used setxxx(); here we use like below one
		s.setUsn(rs.getString(1));
		s.setName(rs.getString(2));
		s.setCity(rs.getString(3));
		
		
		return s;
	}

}
