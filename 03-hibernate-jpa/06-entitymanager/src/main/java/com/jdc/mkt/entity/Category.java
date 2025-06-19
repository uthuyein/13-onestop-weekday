package com.jdc.mkt.entity;

import java.util.List;

import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@DynamicInsert
@NoArgsConstructor
@RequiredArgsConstructor
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NonNull
	@Column(nullable = false,unique = true)
	private  String name;
	
	@Column(columnDefinition = "boolean default true")
	private  Boolean active ;
	
	@OneToMany(mappedBy = "category",orphanRemoval = true)
	private List<Product> products;
}





