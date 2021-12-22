package com.api.rest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.model.Deal;
import com.api.rest.repository.DealRepo;


@Service
public class DealService {
	
	@Autowired
	private DealRepo dealRepo;
	
	public void addDeal(Deal deal) {
		deal.setSoldItems(0);
		deal.setIsOver(false);
		dealRepo.save(deal);
	}
	
	public Deal getDeal(String id) {
		Optional<Deal> deal = dealRepo.findById(id);
		if(deal.isEmpty())
			throw new RuntimeException("deal is not present in system");
		return deal.get();
	}
	
	public void endDeal(String id) {
		Deal curDeal = getDeal(id);
		curDeal.setIsOver(true);
		dealRepo.save(curDeal);
	}
	
	
}
