package com.purchases.app.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.purchases.app.model.Purchase;

@Repository
public interface PurchaseRepository extends	CrudRepository<Purchase, Long > {
	
	List<Purchase> findById(Long id);
	
	List<Purchase> findAllByOrderByCreatedAsc();
	
	String deleteByCurrency(String currency);
	long deleteByCreated(Date date);
}

