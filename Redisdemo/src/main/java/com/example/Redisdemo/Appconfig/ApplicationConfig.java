package com.example.Redisdemo.Appconfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Configuration
//@Profile(value = { "qa" })
@Getter
@Setter
public class ApplicationConfig {
	@Value("${server.port}")
	private String serverPort;
	
	//@Value("${spring.message}")
	//private String message;
}
