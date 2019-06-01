package com.purchases.app;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.ai1tutorial.json.employee.model.CurrencyRates;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		SpringApplication.run(AppApplication.class, args);
		
		
         
	}

}
