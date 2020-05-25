package com.ren.studentclass;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ren.studentclass.dao")
public class StudentclassApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentclassApplication.class, args);
    }

}
