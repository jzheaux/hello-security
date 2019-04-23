package com.example;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloSecurityApplication {

	@RestController
	static class RootController {
		@GetMapping("/")
		public String root(@AuthenticationPrincipal Principal user) {
			return user.getName();
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloSecurityApplication.class, args);
	}

}
