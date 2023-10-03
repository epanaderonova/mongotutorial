package com.example.demo;

import com.example.demo.controller.StudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class DemoApplication  {

	@Autowired
	StudentController studentController;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
