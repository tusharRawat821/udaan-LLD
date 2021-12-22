package com.api.rest.model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DealRequest {
	@NotNull
	private Double price;
	@NotNull
	private Integer itemsCount;
}
