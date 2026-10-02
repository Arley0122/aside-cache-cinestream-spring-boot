package com.example.cinestream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CinestreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinestreamApplication.class, args);
	}

}
