package com.jdc.mkt.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Sales {

	@EmbeddedId
	private SalesPk id;
	private double subTotal;
	private double discount;
	private double tax;
	private double total;
	
}
