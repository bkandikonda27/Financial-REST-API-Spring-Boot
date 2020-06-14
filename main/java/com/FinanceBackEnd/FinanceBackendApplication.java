package com.FinanceBackEnd;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class FinanceBackendApplication {


	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public Calendar calendar() {
		Date today = new Date();
		Calendar calend = Calendar.getInstance();
		calend.setTime(today);
		return calend;
	}
	public static void main(String[] args) {
		SpringApplication.run(FinanceBackendApplication.class, args);
	}

}
