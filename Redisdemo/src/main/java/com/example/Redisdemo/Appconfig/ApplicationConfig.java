package com.example.Redisdemo.Appconfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Configuration
@Getter
@Setter
public class ApplicationConfig {
	@Value("${server.port}")
	private String serverPort;
}
