package com.bg.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@EntityScan(basePackages = "com.bg.api.models")
@SpringBootApplication
public class BgApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BgApiApplication.class, args);
	}

}
