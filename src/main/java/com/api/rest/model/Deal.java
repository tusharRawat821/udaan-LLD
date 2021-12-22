package com.api.rest.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Deal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@NotNull
	private Integer productId;
	
	@NotNull
	private Double price;
	@NotNull
	private Integer itemsCount;
	
	@NotNull
	@DateTimeFormat(pattern = "yy-MM-dd'T'HH:mm:ss")
	private LocalDateTime startTime;
	
	@NotNull
	@DateTimeFormat(pattern = "yy-MM-dd'T'HH:mm:ss")
	private LocalDateTime endTime;
	
	private Integer soldItems;
	private Boolean isOver;
}
