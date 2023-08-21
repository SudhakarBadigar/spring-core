package com.FetchMultipleRow;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student s  =new Student();
		s.setUsn(rs.getString(1));
		s.setName(rs.getString(2));
		s.setCity(rs.getString(3));
		
		
		return s;
	}

}