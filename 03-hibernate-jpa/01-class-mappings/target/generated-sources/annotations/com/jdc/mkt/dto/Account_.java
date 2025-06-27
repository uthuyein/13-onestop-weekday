package com.jdc.mkt.dto;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Account.class)
public abstract class Account_ {

	public static final String PASSWORD = "password";
	public static final String CITY = "city";
	public static final String STREET = "street";
	public static final String CONTACT = "contact";
	public static final String ACTIVE = "active";
	public static final String ID = "id";
	public static final String TOWNSHIP = "township";
	public static final String USERNAME = "username";

	
	/**
	 * @see com.jdc.mkt.dto.Account#password
	 **/
	public static volatile SingularAttribute<Account, String> password;
	
	/**
	 * @see com.jdc.mkt.dto.Account#city
	 **/
	public static volatile SingularAttribute<Account, String> city;
	
	/**
	 * @see com.jdc.mkt.dto.Account#street
	 **/
	public static volatile SingularAttribute<Account, String> street;
	
	/**
	 * @see com.jdc.mkt.dto.Account#contact
	 **/
	public static volatile SingularAttribute<Account, Contact> contact;
	
	/**
	 * @see com.jdc.mkt.dto.Account#active
	 **/
	public static volatile SingularAttribute<Account, Boolean> active;
	
	/**
	 * @see com.jdc.mkt.dto.Account#id
	 **/
	public static volatile SingularAttribute<Account, Integer> id;
	
	/**
	 * @see com.jdc.mkt.dto.Account
	 **/
	public static volatile EntityType<Account> class_;
	
	/**
	 * @see com.jdc.mkt.dto.Account#township
	 **/
	public static volatile SingularAttribute<Account, String> township;
	
	/**
	 * @see com.jdc.mkt.dto.Account#username
	 **/
	public static volatile SingularAttribute<Account, String> username;

}

