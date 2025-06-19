package com.jdc.mkt.entity;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@DynamicInsert
@RequiredArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	@Column(nullable = false,unique = true)
	private  String name;
	
	@NonNull
	@Check(constraints = "price > 0")
	@Column(nullable = false)
	private  Double price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Category category;
	
	@Column(columnDefinition = "boolean default true")
	private Boolean active;
}
