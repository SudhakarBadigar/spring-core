package com.FetchSingleRow;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AnnotationSingleFetch {
	
	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dm.setUsername("root");
		dm.setPassword("LordDattatreya1!");
		return dm;
	}
	
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getjdbctemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean("sinfetch")
	public StudentDao getstudent() {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		studentDaoImpl.setJdbctemplatefetchS(getjdbctemplate());
		return studentDaoImpl;
	}

}
