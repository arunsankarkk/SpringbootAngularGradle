package com.tech.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
		printOutput();
	}
	
	static void printOutput() {
		System.out.println("Hurrayyyyyyyyyyy!!!!!!!!!!");
	}
}
