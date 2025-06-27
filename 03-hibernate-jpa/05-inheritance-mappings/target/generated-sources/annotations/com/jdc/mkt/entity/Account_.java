package com.jdc.mkt.entity;

import com.jdc.mkt.entity.Account.AccountType;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import java.time.LocalTime;

@StaticMetamodel(Account.class)
public abstract class Account_ {

	public static final String PASSWORD = "password";
	public static final String ACCOUNT_TYPE = "accountType";
	public static final String CREATE_DATE_AT = "createDateAt";
	public static final String VALUE = "value";
	public static final String CREATE_TIME_AT = "createTimeAt";
	public static final String EMAIL = "email";
	public static final String USERNAME = "username";

	
	/**
	 * @see com.jdc.mkt.entity.Account#password
	 **/
	public static volatile SingularAttribute<Account, String> password;
	
	/**
	 * @see com.jdc.mkt.entity.Account#accountType
	 **/
	public static volatile SingularAttribute<Account, AccountType> accountType;
	
	/**
	 * @see com.jdc.mkt.entity.Account#createDateAt
	 **/
	public static volatile SingularAttribute<Account, LocalDate> createDateAt;
	
	/**
	 * @see com.jdc.mkt.entity.Account
	 **/
	public static volatile EntityType<Account> class_;
	
	/**
	 * @see com.jdc.mkt.entity.Account#value
	 **/
	public static volatile SingularAttribute<Account, String> value;
	
	/**
	 * @see com.jdc.mkt.entity.Account#createTimeAt
	 **/
	public static volatile SingularAttribute<Account, LocalTime> createTimeAt;
	
	/**
	 * @see com.jdc.mkt.entity.Account#email
	 **/
	public static volatile SingularAttribute<Account, String> email;
	
	/**
	 * @see com.jdc.mkt.entity.Account#username
	 **/
	public static volatile SingularAttribute<Account, String> username;

}

