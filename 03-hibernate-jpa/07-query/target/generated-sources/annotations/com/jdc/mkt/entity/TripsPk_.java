package com.jdc.mkt.entity;

import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(TripsPk.class)
public abstract class TripsPk_ {

	public static final String TRIP_AT = "tripAt";
	public static final String PASSENGERS_ID = "passengersId";
	public static final String DRIVERS_ID = "driversId";
	public static final String PAYMENTS_ID = "paymentsId";

	
	/**
	 * @see com.jdc.mkt.entity.TripsPk#tripAt
	 **/
	public static volatile SingularAttribute<TripsPk, LocalDateTime> tripAt;
	
	/**
	 * @see com.jdc.mkt.entity.TripsPk#passengersId
	 **/
	public static volatile SingularAttribute<TripsPk, Integer> passengersId;
	
	/**
	 * @see com.jdc.mkt.entity.TripsPk#driversId
	 **/
	public static volatile SingularAttribute<TripsPk, Integer> driversId;
	
	/**
	 * @see com.jdc.mkt.entity.TripsPk#paymentsId
	 **/
	public static volatile SingularAttribute<TripsPk, Integer> paymentsId;
	
	/**
	 * @see com.jdc.mkt.entity.TripsPk
	 **/
	public static volatile EmbeddableType<TripsPk> class_;

}

