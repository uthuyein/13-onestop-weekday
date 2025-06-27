package com.jdc.mkt.entity;

import com.jdc.mkt.entity.Customer.MemberType;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Customer.class)
public abstract class Customer_ extends com.jdc.mkt.entity.Account_ {

	public static final String MEMBER_TYPE = "memberType";

	
	/**
	 * @see com.jdc.mkt.entity.Customer#memberType
	 **/
	public static volatile SingularAttribute<Customer, MemberType> memberType;
	
	/**
	 * @see com.jdc.mkt.entity.Customer
	 **/
	public static volatile EntityType<Customer> class_;

}

