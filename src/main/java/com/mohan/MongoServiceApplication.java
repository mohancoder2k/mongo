package com.mohan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoServiceApplication.class, args);
	}

}
