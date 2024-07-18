package com.example.demo;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

// Import lớp Student từ package Student
import com.example.demo.Student.Student;

// @RestController: Định nghĩa lớp này như một RestController, nó sẽ xử lý các request HTTP.
// @SpringBootApplication: Bao gồm các annotation khác như @Configuration, @EnableAutoConfiguration, và @ComponentScan.

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
	
	// @GetMapping("/"): Ánh xạ các request GET đến URL gốc ("/").
	// Phương thức này trả về danh sách các đối tượng Student dưới dạng JSON. 
	// Trong ví dụ này, danh sách chỉ có một sinh viên với thông tin được cung cấp.
	//trả về 1 api json
	@GetMapping("/")
	public List<Student> hello() {
		return List.of(
			new Student(
				1L,
				"Maria",
				"Maria@gmail.com",
				LocalDate.of(2000, Month.JANUARY, 5),
				21
			)
		);
	}

}