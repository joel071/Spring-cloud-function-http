package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.function.Function;

@SpringBootApplication
public class CloudFunctionBApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudFunctionBApplication.class, args);
	}

	@Bean
	public Function<String, String> function() {
		return value -> value.toUpperCase();
	}



}
