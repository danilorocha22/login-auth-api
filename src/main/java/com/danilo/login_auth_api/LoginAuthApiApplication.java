package com.danilo.login_auth_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class LoginAuthApiApplication {

	public static void main(String[] args) {
		Dotenv.configure()
				.systemProperties()
				.load();
		SpringApplication.run(LoginAuthApiApplication.class, args);
	}

}
