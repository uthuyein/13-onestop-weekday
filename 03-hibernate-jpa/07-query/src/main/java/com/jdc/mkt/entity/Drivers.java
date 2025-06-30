package com.jdc.mkt.entity;

import java.util.List;

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
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.Data;

@Data
@Entity
@Table(name = "drivers_tbl")
public class Drivers implements EnableTimesListener{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "drivers_id")
	private int driversId;
	
	@Column(nullable = false,length = 45)
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Embedded
	private Contact contact;
	
	@Embedded
	private Times times;
	
	@JoinColumn(name = "addresses_id")
	@OneToOne(fetch = FetchType.LAZY,optional = true)
	private Addresses addresses;
	
	@OneToOne(fetch = FetchType.LAZY,
			cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE})
	@JoinColumn(name = "licences_id")
	private Licences licences;
	
	@OneToMany(mappedBy = "drivers")
	private List<Trips> trips;
	
	public enum Gender {
		MALE,FEMALE,OTHER
	}
}
