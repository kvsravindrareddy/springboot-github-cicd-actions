package com.veera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGithubCicdActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGithubCicdActionsApplication.class, args);
	}

	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome to SpringBoot";
	}
}
