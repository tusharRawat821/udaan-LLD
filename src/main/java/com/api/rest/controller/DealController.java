package com.api.rest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.model.Deal;
import com.api.rest.model.DealRequest;
import com.api.rest.service.DealService;

@RestController
@RequestMapping("/deals")
public class DealController {
//	Create a deal with price and number of items to be sold as part of the deal
//	End a deal 
//	Update a deal to increase the number of items or end time
//	Claim a deal
	
	@Autowired
	private DealService dealService;
	
	@RequestMapping("/add")
	public void createDeal(@Valid @RequestBody Deal deal) {
		dealService.addDeal(deal);
	}
	
	@PutMapping("/cancel/{id}")
	public void endDeal(@PathVariable String id) {
		dealService.endDeal(id);
	}
	
//	@RequestMapping("/update/{id}")
//	public void updateNumberOfItems() {
//		
//	}
//	
//	@RequestMapping("/claim/{id}")
//	public void claimDeal(@PathVariable String dealId) {
//		
//	}
	
}
