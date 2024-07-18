package com.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com.*") 
public class LibraryAppApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(LibraryAppApplication.class, args);
	}

}
