package com.jdc.mkt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false,length = 45)
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Size size;
	
//	
//	@JoinTable(name = "product_category_tbl",
//	inverseJoinColumns = {
//			@JoinColumn(name = "cat_id")
//	},
//	joinColumns = {
//		@JoinColumn(name = "product_id ")	
//	})
	
	@ManyToOne
	private Category category;
	
	private boolean active;
	
	public enum Size{
		SMALL,MEDIUM,LARGE
	}
}
