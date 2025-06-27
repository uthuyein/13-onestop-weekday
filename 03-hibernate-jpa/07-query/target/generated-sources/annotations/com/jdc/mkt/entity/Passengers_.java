package com.jdc.mkt.entity;

import com.jdc.mkt.listeners.Times;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Passengers.class)
public abstract class Passengers_ {

	public static final String QUERY_PASSENGERS_SELECT_ALL_PASSENGERS_BY_NAME_LIKE = "Passengers.selectAllPassengersByNameLike";
	public static final String TIMES = "times";
	public static final String QUERY_PASSENGERS_SELECT_ALL_PASSENGERS = "Passengers.selectAllPassengers";
	public static final String CONTACT = "contact";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String QUERY_PASSENGERS_SELECT_ALL_PASSENGER_BY_NAME_EQUAL = "Passengers.selectAllPassengerByNameEqual";

	
	/**
	 * @see com.jdc.mkt.entity.Passengers#times
	 **/
	public static volatile SingularAttribute<Passengers, Times> times;
	
	/**
	 * @see com.jdc.mkt.entity.Passengers#contact
	 **/
	public static volatile SingularAttribute<Passengers, Contact> contact;
	
	/**
	 * @see com.jdc.mkt.entity.Passengers#name
	 **/
	public static volatile SingularAttribute<Passengers, String> name;
	
	/**
	 * @see com.jdc.mkt.entity.Passengers#id
	 **/
	public static volatile SingularAttribute<Passengers, Integer> id;
	
	/**
	 * @see com.jdc.mkt.entity.Passengers
	 **/
	public static volatile EntityType<Passengers> class_;

}

