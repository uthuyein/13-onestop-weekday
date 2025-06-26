package com.jdc.mkt.entity;

import com.jdc.mkt.listeners.EnableTimesListener;
import com.jdc.mkt.listeners.Times;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.Data;

@Data
@Entity
@Table(name = "drivers_tbl")
public class Drivers implements EnableTimesListener{

	@Id
	@GeneratedValue(generator = "table_gen_drivers_tbl")
	@TableGenerator(name = "table_gen_drivers_tbl",initialValue = 1,allocationSize = 1)
	private int id;
	
	@Column(nullable = false,length = 45)
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Embedded
	private Contact contact;
	
	@Embedded
	private Times times;
	
	@OneToOne(fetch = FetchType.LAZY,optional = true)
	private Addresses addresses;
	
	@OneToOne(fetch = FetchType.LAZY,
			cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE})
	private Licences licences;
	
	public enum Gender {
		MALE,FEMALE,OTHER
	}
}
