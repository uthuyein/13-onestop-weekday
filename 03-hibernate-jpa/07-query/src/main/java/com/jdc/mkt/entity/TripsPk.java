package com.jdc.mkt.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class TripsPk implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "drivers_id")
	private int driversId;
	
	@Column(name = "pessengers_id")
	private int pessengersId;
	
	@Column(name = "payments_id")
	private int paymentsId;
	
	private LocalDateTime tripAt;
}
