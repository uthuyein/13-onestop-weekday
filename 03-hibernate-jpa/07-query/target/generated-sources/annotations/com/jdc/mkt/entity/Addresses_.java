package com.jdc.mkt.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Addresses.class)
public abstract class Addresses_ {

	public static final String STREET = "street";
	public static final String ID = "id";
	public static final String STATE = "state";
	public static final String TOWNSHIP = "township";

	
	/**
	 * @see com.jdc.mkt.entity.Addresses#street
	 **/
	public static volatile SingularAttribute<Addresses, String> street;
	
	/**
	 * @see com.jdc.mkt.entity.Addresses#id
	 **/
	public static volatile SingularAttribute<Addresses, Integer> id;
	
	/**
	 * @see com.jdc.mkt.entity.Addresses#state
	 **/
	public static volatile SingularAttribute<Addresses, String> state;
	
	/**
	 * @see com.jdc.mkt.entity.Addresses
	 **/
	public static volatile EntityType<Addresses> class_;
	
	/**
	 * @see com.jdc.mkt.entity.Addresses#township
	 **/
	public static volatile SingularAttribute<Addresses, String> township;

}

