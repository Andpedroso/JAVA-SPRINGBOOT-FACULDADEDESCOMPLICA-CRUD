package com.andpedroso.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "DescoSpring Project",
				version = "1.0.0",
				description = "Atividade sobre Spring Boot",
				termsOfService = "andpedroso",
				contact = @Contact(
						name = "André",
						email = "ankpedroso@gmail.com"
				),
				license = @License(
						name = "licence",
						url = "andpedroso"
				)
		)
)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
