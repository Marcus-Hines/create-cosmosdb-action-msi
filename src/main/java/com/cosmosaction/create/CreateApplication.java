package com.cosmosaction.create;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cosmosaction.create.resources.Action;

@SpringBootApplication
public class CreateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateApplication.class, args);
		Action action = new Action();

	}

}
