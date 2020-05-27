package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Start with "mvnw spring-boot:run" in the top level directory.
 * Server started at http://localhost:8080/ with endpoints "greetingWQ" and "greeting NQ"
 */
@SpringBootApplication(scanBasePackages = {"com"})
public class RestserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestserviceApplication.class, args);
	}
}
