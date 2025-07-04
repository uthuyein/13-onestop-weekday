package com.jdc.mkt.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.DynamicInsert;

import com.jdc.mkt.listeners.EnableTimesEntity;
import com.jdc.mkt.listeners.Times;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
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
public class Category implements EnableTimesEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NonNull
	@Column(nullable = false, unique = true)
	private String name;

	@Column(columnDefinition = "boolean default true")
	private Boolean active;

	@OneToMany(mappedBy = "category",
			// orphanRemoval = true,
			cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	private List<Product> products = new ArrayList<Product>();
	
	
	@Embedded
	private Times times;

	public void addProduct(Product... ps) {
		for (Product p : ps) {
			p.setCategory(this);
			products.add(p);
		}
		
	}
}
