package com.app.techworm.main.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Configuration
@Getter
@Setter
public class ApplicationConfiguration {
	@Value("${server.port}")
	private String serverPort;
	
	@Value("${spring.datasource.url}")
	private String springdatasourceurl;
	
	@Value("${spring.datasource.username}")
	private String springdatasourceusername;
	
	@Value("${spring.datasource.password}")
	private String springdatasourcepassword;
	
	@Value("${spring.jpa.show-sql}")
	private String springjpashowsql;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String springjpahibernateddlauto;
	
	@Value("${spring.jpa.properties.hibernate.dialect}")
	private String springjpapropertieshibernatedialect;

	
	
}
