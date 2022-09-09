package com.example.Redisdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Redisdemo.Appconfig.ApplicationConfig;
import com.example.Redisdemo.serive.RedisService;



@RestController
public class RedisController {
	
	
	Logger logger = LoggerFactory.getLogger(RedisController.class);
	@Autowired
	private RedisService redisservice;
	//to call save method or to save new employee

	public RedisController(RedisService redisservice) {
		this.redisservice = redisservice;
	}
	@GetMapping(value="properties")
	public ResponseEntity<String> getProperties() {
		logger.info("This is sample info message");
	    logger.warn("This is sample warn message");
	    logger.error("This is sample error message");
	    logger.debug("This is sample debug message");
		return new ResponseEntity<>(redisservice.getProperties(), HttpStatus.OK);
	}
	
	
}
