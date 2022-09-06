package com.app.techworm.main.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
	@Value("$(server.port)")
	private String serverPort;
	
	@Value("$(spring.datasource.url)")
	private String springdatasourceurl;
	
	@Value("$(spring.datasource.username)")
	private String springdatasourceusername;
	
	@Value("$(spring.datasource.password)")
	private String springdatasourcepassword;
	
	@Value("$(spring.jpa.show-sql)")
	private String springjpashowsql;
	
	@Value("$(spring.jpa.hibernate.ddl-auto)")
	private String springjpahibernateddlauto;
	
	@Value("$(spring.jpa.properties.hibernate.dialect)")
	private String springjpapropertieshibernatedialect;

	public String getServerPort() {
		return serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

	public String getSpringdatasourceurl() {
		return springdatasourceurl;
	}

	public void setSpringdatasourceurl(String springdatasourceurl) {
		this.springdatasourceurl = springdatasourceurl;
	}

	public String getSpringdatasourceusername() {
		return springdatasourceusername;
	}

	public void setSpringdatasourceusername(String springdatasourceusername) {
		this.springdatasourceusername = springdatasourceusername;
	}

	public String getSpringdatasourcepassword() {
		return springdatasourcepassword;
	}

	public void setSpringdatasourcepassword(String springdatasourcepassword) {
		this.springdatasourcepassword = springdatasourcepassword;
	}

	public String getSpringjpashowsql() {
		return springjpashowsql;
	}

	public void setSpringjpashowsql(String springjpashowsql) {
		this.springjpashowsql = springjpashowsql;
	}

	public String getSpringjpahibernateddlauto() {
		return springjpahibernateddlauto;
	}

	public void setSpringjpahibernateddlauto(String springjpahibernateddlauto) {
		this.springjpahibernateddlauto = springjpahibernateddlauto;
	}

	public String getSpringjpapropertieshibernatedialect() {
		return springjpapropertieshibernatedialect;
	}

	public void setSpringjpapropertieshibernatedialect(String springjpapropertieshibernatedialect) {
		this.springjpapropertieshibernatedialect = springjpapropertieshibernatedialect;
	}
	
	
}
