package com.project.api;


import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ServiceManage {
	
	
	
	public static JdbcTemplate jdbcTemplate;
	
	
	public static DataSource dataSource;
	
	 
	 @Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		 ServiceManage.jdbcTemplate = jdbcTemplate;
	}
	 
	 @Autowired
	 public void setDataSource(DataSource dataSource) {
		 ServiceManage.dataSource = dataSource;
	}
	 
	 
	
}
