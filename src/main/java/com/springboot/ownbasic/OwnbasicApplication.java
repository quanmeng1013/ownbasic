package com.springboot.ownbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springboot"})
public class OwnbasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(OwnbasicApplication.class, args);
	}

}
