package com.maersk.knapsackoptimizerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.maersk.knapsackoptimizerservice"})
@EnableAutoConfiguration
//@EnableMongoRepositories("com.maersk.knapsackoptimizerservice")
public class KnapsackOptimizerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KnapsackOptimizerServiceApplication.class, args);
	}

}
