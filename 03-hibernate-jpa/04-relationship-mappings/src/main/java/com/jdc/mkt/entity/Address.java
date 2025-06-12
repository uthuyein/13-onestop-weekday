package com.jdc.mkt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String state;
	@Column(nullable = false)
	private String township;
	@Column(nullable = false)
	private String address;
	
//	@JoinTable(name = "add_cust_tbl",
//	joinColumns = {
//			@JoinColumn(name = "add_id")
//	},
//	inverseJoinColumns = {
//			@JoinColumn(name = "cust_id")
//	}
//	)
	@OneToOne
	@PrimaryKeyJoinColumn
	private Customer customer;
}
