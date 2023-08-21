package com.example.movierecommendation2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("com.example.movierecommendation2.entity")

public class MovieRecommendation2Application {

	public static void main(String[] args) {
		SpringApplication.run(MovieRecommendation2Application.class, args);
	}

}
