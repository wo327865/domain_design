package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppOneApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("init ...");
	}
}
