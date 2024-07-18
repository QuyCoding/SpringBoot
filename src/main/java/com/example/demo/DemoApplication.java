package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication: Bao gồm các annotation khác như @Configuration, @EnableAutoConfiguration, và @ComponentScan.
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	//Annotation này ánh xạ các request HTTP GET đến method hello. 
	// Khi một request GET được gửi đến root URL ("/"), method này sẽ được gọi.
	// @GetMapping("/")
	// public String hello() {
	// 	return "Hello World!";
	// }
	


}