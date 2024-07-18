package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    
    // @GetMapping("/"): Ánh xạ các request GET đến URL gốc ("/").
	// Phương thức này trả về danh sách các đối tượng Student dưới dạng JSON. 
	// Trong ví dụ này, danh sách chỉ có một sinh viên với thông tin được cung cấp.
	//trả về 1 api json
	@GetMapping()
	public List<Student> getStudents() {
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
