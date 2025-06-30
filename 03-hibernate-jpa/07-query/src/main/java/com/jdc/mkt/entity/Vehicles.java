package com.jdc.mkt.entity;

import java.util.UUID;

import com.jdc.mkt.listeners.EnableTimesListener;
import com.jdc.mkt.listeners.Times;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "vehicles_tbl")
public class Vehicles implements EnableTimesListener {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "vehicles_id")
	private UUID vehiclesId;
	
	@Column(nullable = false,length = 12,unique = true)
	private String carLicence;
	
	@Column(nullable = false)
	private String carModel;
	
	@Enumerated(EnumType.STRING)
	private Size size;
	
	@Embedded
	private Times times;
	
	public enum Size{
		SMALL,MEDIUM,LARGE
	}
}
