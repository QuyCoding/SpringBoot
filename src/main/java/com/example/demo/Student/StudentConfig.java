package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student alex = new Student(
                "Alex",
                "Alex@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5)
            );
            
            Student maria = new Student(
                "maria",
                "maria@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5)
            );
            
            studentRepository.saveAll(
                List.of(alex, maria)
            );
            
            
        };
    }            

}
