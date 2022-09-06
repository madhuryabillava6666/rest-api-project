package com.app.techworm.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//import com.app.config.ApplicationConfig;
import com.app.techworm.main.config.ApplicationConfiguration;

@SpringBootApplication
public class Application {
	
	private static Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ApplicationConfiguration applicationconfiguration = context.getBean(ApplicationConfiguration.class);
		log.info(applicationconfiguration.getServerPort());
		log.info(applicationconfiguration.getSpringdatasourceurl());
		log.info(applicationconfiguration.getSpringdatasourceusername());
		log.info(applicationconfiguration.getSpringdatasourcepassword());
		log.info(applicationconfiguration.getSpringjpashowsql());
		log.info(applicationconfiguration.getSpringjpahibernateddlauto());
		log.info(applicationconfiguration.getSpringjpapropertieshibernatedialect());
		
	}

}
