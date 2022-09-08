package com.example.Redisdemo.serive;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Redisdemo.Appconfig.ApplicationConfig;


@Service
public class RedisService {
	@Autowired
	private ApplicationConfig applicationconfig;
	
	public RedisService(ApplicationConfig applicationconfig) {
		this.applicationconfig = applicationconfig;
	}
	
	
	public String getProperties() {
		return applicationconfig.getServerPort();
	}
	
	
}
