package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
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
	
	//trả về 1 api json
	@GetMapping("/api")
	public String api() {
		return "{ \"name\": \"Thanh\", \"age\": 20 }";
	}

}