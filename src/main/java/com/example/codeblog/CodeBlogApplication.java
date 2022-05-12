package com.example.codeblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.codeblog.mapper")
public class CodeBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeBlogApplication.class, args);
    }

}
