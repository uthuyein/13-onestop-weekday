package com.jdc.mkt.entity;

import com.jdc.mkt.listeners.Times;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Trips.class)
public abstract class Trips_ {

	public static final String END_POINT = "endPoint";
	public static final String PASSENGERS = "passengers";
	public static final String TIMES = "times";
	public static final String PAYMENTS = "payments";
	public static final String START_POINT = "startPoint";
	public static final String ID = "id";
	public static final String DRIVERS = "drivers";

	
	/**
	 * @see com.jdc.mkt.entity.Trips#endPoint
	 **/
	public static volatile SingularAttribute<Trips, String> endPoint;
	
	/**
	 * @see com.jdc.mkt.entity.Trips#passengers
	 **/
	public static volatile SingularAttribute<Trips, Passengers> passengers;
	
	/**
	 * @see com.jdc.mkt.entity.Trips#times
	 **/
	public static volatile SingularAttribute<Trips, Times> times;
	
	/**
	 * @see com.jdc.mkt.entity.Trips#payments
	 **/
	public static volatile SingularAttribute<Trips, Payments> payments;
	
	/**
	 * @see com.jdc.mkt.entity.Trips#startPoint
	 **/
	public static volatile SingularAttribute<Trips, String> startPoint;
	
	/**
	 * @see com.jdc.mkt.entity.Trips#id
	 **/
	public static volatile SingularAttribute<Trips, TripsPk> id;
	
	/**
	 * @see com.jdc.mkt.entity.Trips
	 **/
	public static volatile EntityType<Trips> class_;
	
	/**
	 * @see com.jdc.mkt.entity.Trips#drivers
	 **/
	public static volatile SingularAttribute<Trips, Drivers> drivers;

}

