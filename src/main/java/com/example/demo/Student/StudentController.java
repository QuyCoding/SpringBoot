package com.example.demo.Student;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    
    private final StudentService studentService;
    
    // @Autowired: Đánh dấu một trường là một phụ thuộc của Spring.
    // Spring sẽ tự động tiêm các phụ thuộc này khi tạo bean.
    // Trong trường hợp này, Spring sẽ tự động tiêm một đối tượng StudentService vào StudentController.
    // Không cần dùng @Autowired nếu chỉ có một constructor vì Spring sẽ tự động tiêm.
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    // @GetMapping("/"): Ánh xạ các request GET đến URL gốc ("/").
	// Phương thức này trả về danh sách các đối tượng Student dưới dạng JSON. 
	// Trong ví dụ này, danh sách chỉ có một sinh viên với thông tin được cung cấp.
	//trả về 1 api json
	@GetMapping
	public List<Student> getStudents() {
        return studentService.getStudents();
	}
    

    @PostMapping
    public void addNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

}
