package com.api.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.model.Deal;

@Repository
public interface DealRepo extends CrudRepository<Deal, String> {

}
