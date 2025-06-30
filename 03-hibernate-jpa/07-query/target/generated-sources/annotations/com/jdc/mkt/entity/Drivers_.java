package com.jdc.mkt.entity;

import com.jdc.mkt.entity.Drivers.Gender;
import com.jdc.mkt.listeners.Times;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Drivers.class)
public abstract class Drivers_ {

	public static final String TIMES = "times";
	public static final String ADDRESSES = "addresses";
	public static final String GENDER = "gender";
	public static final String DRIVERS_ID = "driversId";
	public static final String TRIPS = "trips";
	public static final String CONTACT = "contact";
	public static final String NAME = "name";
	public static final String LICENCES = "licences";

	
	/**
	 * @see com.jdc.mkt.entity.Drivers#times
	 **/
	public static volatile SingularAttribute<Drivers, Times> times;
	
	/**
	 * @see com.jdc.mkt.entity.Drivers#addresses
	 **/
	public static volatile SingularAttribute<Drivers, Addresses> addresses;
	
	/**
	 * @see com.jdc.mkt.entity.Drivers#gender
	 **/
	public static volatile SingularAttribute<Drivers, Gender> gender;
	
	/**
	 * @see com.jdc.mkt.entity.Drivers#driversId
	 **/
	public static volatile SingularAttribute<Drivers, Integer> driversId;
	
	/**
	 * @see com.jdc.mkt.entity.Drivers#trips
	 **/
	public static volatile ListAttribute<Drivers, Trips> trips;
	
	/**
	 * @see com.jdc.mkt.entity.Drivers#contact
	 **/
	public static volatile SingularAttribute<Drivers, Contact> contact;
	
	/**
	 * @see com.jdc.mkt.entity.Drivers#name
	 **/
	public static volatile SingularAttribute<Drivers, String> name;
	
	/**
	 * @see com.jdc.mkt.entity.Drivers
	 **/
	public static volatile EntityType<Drivers> class_;
	
	/**
	 * @see com.jdc.mkt.entity.Drivers#licences
	 **/
	public static volatile SingularAttribute<Drivers, Licences> licences;

}

