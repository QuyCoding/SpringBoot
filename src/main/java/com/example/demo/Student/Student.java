//1.Đây là nơi bạn khai báo package cho lớp Student và import lớp LocalDate để sử dụng cho ngày tháng.
package com.example.demo.Student;
import java.time.LocalDate;

public class Student {
    //2.Các trường (fields) của lớp:
    //Định nghĩa các thuộc tính của sinh viên bao gồm id, name, email, dob (ngày sinh), và age.
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;
    
    //3.Constructors:
    // Constructor không tham số cho phép tạo một đối tượng Student mà không cần cung cấp dữ liệu ban đầu.
    // Constructor có tham số để tạo đối tượng Student với các thuộc tính được cung cấp.
    public Student() {
    }
    
    public Student(Long id, String name, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
    
    public Student(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
    
    
    //4. Getters và Setters:
    // Các phương thức getter để lấy giá trị của các thuộc tính.
    // Các phương thức setter để thiết lập giá trị cho các thuộc tính.
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public LocalDate getDob() {
        return dob;
    }
    
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    //5.Phương thức toString:
    //Ghi đè phương thức toString để cung cấp một chuỗi mô tả đối tượng Student.
    @Override
    public String toString() {
        return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", dob=" + dob +
            ", age=" + age +
            '}';
    }
    
    
}
