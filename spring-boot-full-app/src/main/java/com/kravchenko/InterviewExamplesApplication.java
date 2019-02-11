package com.kravchenko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:db-config-postgresql.properties")
public class InterviewExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewExamplesApplication.class, args);
	}
}
