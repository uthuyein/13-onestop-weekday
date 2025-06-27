package com.jdc.mkt.entity;

import com.jdc.mkt.entity.Customer.Type;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static final String ADDRESS = "address";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String MEMBER_TYPE = "memberType";

	
	/**
	 * @see com.jdc.mkt.entity.Customer#address
	 **/
	public static volatile SingularAttribute<Customer, Address> address;
	
	/**
	 * @see com.jdc.mkt.entity.Customer#name
	 **/
	public static volatile SingularAttribute<Customer, String> name;
	
	/**
	 * @see com.jdc.mkt.entity.Customer#id
	 **/
	public static volatile SingularAttribute<Customer, Integer> id;
	
	/**
	 * @see com.jdc.mkt.entity.Customer#memberType
	 **/
	public static volatile SingularAttribute<Customer, Type> memberType;
	
	/**
	 * @see com.jdc.mkt.entity.Customer
	 **/
	public static volatile EntityType<Customer> class_;

}

