//1.Đây là nơi bạn khai báo package cho lớp Student và import lớp LocalDate để sử dụng cho ngày tháng.
package com.example.demo.Student;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    
    /*
     * * @Transient: Đánh dấu một trường hoặc phương thức không được lưu trữ trong cơ sở dữ liệu.
     * Trong trường hợp này, age không được lưu trữ trong cơ sở dữ liệu vì nó có thể được tính toán dựa trên ngày sinh.
     */
    @Transient
    private Integer age;
    
    //3.Constructors:
    // Constructor không tham số cho phép tạo một đối tượng Student mà không cần cung cấp dữ liệu ban đầu.
    // Constructor có tham số để tạo đối tượng Student với các thuộc tính được cung cấp.
    public Student() {
    }
    
    public Student(Long id, String name, String email, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }
    
    public Student(String name, String email, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
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
        return Period.between(this.dob, LocalDate.now()).getYears();
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
