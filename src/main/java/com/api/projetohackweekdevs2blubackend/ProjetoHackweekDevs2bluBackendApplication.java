package com.api.projetohackweekdevs2blubackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProjetoHackweekDevs2bluBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoHackweekDevs2bluBackendApplication.class, args);
	}

	@GetMapping(value = "/healthCheck")
	public String helthCheck(){
		return "test";
	}

}
