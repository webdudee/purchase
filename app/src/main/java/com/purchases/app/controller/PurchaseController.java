package com.purchases.app.controller;

import java.util.Date;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.purchases.app.model.Purchase;
import com.purchases.app.service.PurchaseService;




@RestController
public class PurchaseController {

	@Autowired
	private PurchaseService purchaseService;
	
	@PostMapping("/purchase")
	public void addPurchase (@RequestBody Purchase purchase) {
		purchaseService.addPurchase(purchase);}
		
		@RequestMapping("/purchase")
		
		public List<Purchase> getAllTopics(){
			return purchaseService.getAllPurchase();			
		}
		@RequestMapping("/purchasee")
		public List<Purchase> getAllbyName(){
			return purchaseService.findAllSorted();			
		}
	
		@RequestMapping("/purchases")
		public List<Purchase> getAllByDate(){
			return purchaseService.findAllByOrderByCreatedAsc();			
		}
		
		@RequestMapping(method=RequestMethod.DELETE, value="/purchase/{created}")
		String deleteByDate(@PathVariable  String currency) {
			return purchaseService.deleteByCurrency(currency);
		}
		
		@RequestMapping(method=RequestMethod.DELETE, value="/purchasess/{date}")
		public long findAllByCreatedBetween(@DateTimeFormat(pattern="yyyy-MM-dd") @PathVariable  Date date){
			return purchaseService.deleteAllByDate(date);
		}
		
		}
