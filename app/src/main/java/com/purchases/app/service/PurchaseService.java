package com.purchases.app.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.ai1tutorial.json.employee.model.CurrencyRates;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.purchases.app.model.Purchase;
import com.purchases.app.repository.PurchaseRepository;

@Service
public class PurchaseService {


	
	@Autowired
	private PurchaseRepository purchaseRepository;

	public void addPurchase(Purchase purchase) {
		purchaseRepository.save(purchase);
	}

	public List<Purchase> getAllPurchase() {
		List<Purchase> purchase = new ArrayList<>();
		purchaseRepository.findAll().forEach(purchase::add);
		
		return purchase;
	}

	public List<Purchase> findAllSorted() {
		List<Purchase> persons = purchaseRepository.findById((long) 2);
		return persons;

	}

	@Transactional
	public List<Purchase> findAllByOrderByCreatedAsc() {
		List<Purchase> persons = purchaseRepository.findAllByOrderByCreatedAsc();
		return persons;
	}

	@Transactional
	public String deleteByCurrency(String currency) {
		return purchaseRepository.deleteByCurrency(currency);

	};

	@Transactional
	public long deleteAllByDate(Date date) {
		return purchaseRepository.deleteByCreated(date);
	}
	
	private CurrencyRates getAllCurrencies() throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        ObjectMapper objectMapper = new ObjectMapper();
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://data.fixer.io/api/latest")
                .queryParam("access_key", "067db6285bede7b0bcab5be13010f552");

        HttpEntity<?> entity = new HttpEntity<>(headers);

        HttpEntity<String> response = restTemplate.exchange(
                builder.toUriString(),
                org.springframework.http.HttpMethod.GET,
                entity,
                String.class);
        String body = response.getBody();
        return  objectMapper.readValue(body, CurrencyRates.class);
    }
	
	
	
	
}
	
	
	


