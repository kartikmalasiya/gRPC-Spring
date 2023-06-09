package com.techgeeknext.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages="com.techgeeknext.employee.repository")
public class SpringBootGrpcExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGrpcExampleApplication.class, args);
	}

}
