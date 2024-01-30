package com.example.hellobcafinance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BcaFinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BcaFinanceApplication.class, args);
	}

	@RestController
	class Hello {

		@RequestMapping("/")
		String index() {
			return "Bca Finance";
		}
	}
}
