package com.example.Redisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Redisdemo.Appconfig.ApplicationConfig;
import com.example.Redisdemo.serive.RedisService;


//@Profile(value = { "qa" })
@RestController
public class RedisController {
	@Autowired
	private RedisService redisservice;
	//to call save method or to save new employee

	public RedisController(RedisService redisservice) {
		this.redisservice = redisservice;
	}
	@GetMapping(value="properties")
	public ResponseEntity<String> getProperties() {
		return new ResponseEntity<>(redisservice.getProperties(), HttpStatus.OK);
	}
	
	/*@Autowired
	private ApplicationConfig applicationconfig;
	
	@GetMapping
	public String hello() {
		return applicationconfig.getMessage();
	}*/

}
