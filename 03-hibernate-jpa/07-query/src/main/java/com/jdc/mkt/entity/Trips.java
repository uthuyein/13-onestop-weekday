package com.jdc.mkt.entity;

import com.jdc.mkt.listeners.EnableTimesListener;
import com.jdc.mkt.listeners.Times;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "trips_tbl")
public class Trips implements EnableTimesListener{

	@EmbeddedId
	private TripsPk id;
	
	@MapsId("driversId")
	@ManyToOne
	private Drivers dirvers;
	
	@MapsId("pessengersId")
	@ManyToOne
	private Pessengers pessengers;
	
	@MapsId("paymentsId")
	@ManyToOne
	private Payments payments;
	
	@Column(nullable = false,length = 45)
	private String startPoint;
	
	@Column(nullable = false,length = 45)
	private String endPoint;
	
	@Embedded
	private Times times;
}
