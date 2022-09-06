package com.app.techworm.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.config.ApplicationConfig;

@SpringBootApplication
public class Application {
	
	private static Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ApplicationConfig applicationconfig = context.getBean(ApplicationConfig.class);
		log.info(applicationconfig.getServerPort());
		log.info(applicationconfig.getSpringdatasourceurl());
		log.info(applicationconfig.getSpringdatasourceusername());
		log.info(applicationconfig.getSpringdatasourcepassword());
		log.info(applicationconfig.getSpringjpashowsql());
		log.info(applicationconfig.getSpringjpahibernateddlauto());
		log.info(applicationconfig.getSpringjpapropertieshibernatedialect());
		
	}

}
