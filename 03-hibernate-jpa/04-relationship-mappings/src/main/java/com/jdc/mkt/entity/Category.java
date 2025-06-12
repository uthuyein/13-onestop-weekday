package com.jdc.mkt.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, length = 45)
	private String name;
	
	//@JoinColumn(name = "cat_id") 
	/*
	 * when use join column ,
	 * foregin key column will create on product table 
	 */
	@OneToMany(mappedBy = "category")
	private List<Product> products;

	private boolean active;
}
