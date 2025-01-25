package com.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component("com")
@EntityScan("com.pro.entity")
public class ZnznzApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZnznzApplication.class, args);
		
		System.out.println("App started");
	
		
	}
}
