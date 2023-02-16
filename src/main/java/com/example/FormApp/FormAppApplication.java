package com.example.FormApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages={"com.example.FormApp.Repository.FormRepo"})
@EntityScan("com.example.FormApp")
public class FormAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormAppApplication.class, args);

		System.out.println("hello shaik");
	}


}
