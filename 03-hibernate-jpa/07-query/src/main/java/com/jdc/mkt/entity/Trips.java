package com.jdc.mkt.entity;

import org.hibernate.annotations.DynamicInsert;

import com.jdc.mkt.listeners.EnableTimesListener;
import com.jdc.mkt.listeners.Times;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "trips_tbl")
@DynamicInsert
public class Trips implements EnableTimesListener{

	@EmbeddedId
	private TripsPk id;
	
	//@MapsId("driversId")
	@ManyToOne
	@JoinColumn(insertable = false,updatable = false)
	private Drivers drivers;
	
	//@MapsId("pessengersId")
	@ManyToOne
	@JoinColumn(insertable = false,updatable = false)
	private Passengers passengers;
	
	//@MapsId("paymentsId")
	@ManyToOne
	@JoinColumn(insertable = false,updatable = false)
	private Payments payments;
	
	@Column(nullable = false,length = 45)
	private String startPoint;
	
	@Column(nullable = false,length = 45)
	private String endPoint;
	
	@Embedded
	private Times times;
}
