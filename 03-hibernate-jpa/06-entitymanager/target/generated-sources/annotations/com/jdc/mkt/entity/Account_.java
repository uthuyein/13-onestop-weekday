package com.jdc.mkt.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Account.class)
public abstract class Account_ {

	public static final String BALANCE = "balance";
	public static final String ID = "id";
	public static final String USERNAME = "username";

	
	/**
	 * @see com.jdc.mkt.entity.Account#balance
	 **/
	public static volatile SingularAttribute<Account, Double> balance;
	
	/**
	 * @see com.jdc.mkt.entity.Account#id
	 **/
	public static volatile SingularAttribute<Account, Integer> id;
	
	/**
	 * @see com.jdc.mkt.entity.Account
	 **/
	public static volatile EntityType<Account> class_;
	
	/**
	 * @see com.jdc.mkt.entity.Account#username
	 **/
	public static volatile SingularAttribute<Account, String> username;

}

