package com.example.Redisdemo;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@RequestMapping("/hello")
@RestController
//@Profile(value= {"dev"})
public class HelloResource {
	@Value("${spring.message}")
	private String message;
	@GetMapping("/hello")
	public String gethello() {
		return message;
	}
}
