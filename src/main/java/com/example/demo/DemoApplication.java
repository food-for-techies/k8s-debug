package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@RestController
class RestAPI {

	@GetMapping("/debug")
	public String getMethodName() {
		System.out.println("Debugging...");
		System.out.println("Another debugging...");

		return "Debug Done";
	}
	
}
