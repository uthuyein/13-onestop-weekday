package com.jdc.mkt.entity;

import com.jdc.mkt.listeners.Times;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Member.class)
public abstract class Member_ {

	public static final String PASSWORD = "password";
	public static final String TIMES = "times";
	public static final String ACTIVE = "active";
	public static final String ID = "id";
	public static final String USERNAME = "username";

	
	/**
	 * @see com.jdc.mkt.entity.Member#password
	 **/
	public static volatile SingularAttribute<Member, String> password;
	
	/**
	 * @see com.jdc.mkt.entity.Member#times
	 **/
	public static volatile SingularAttribute<Member, Times> times;
	
	/**
	 * @see com.jdc.mkt.entity.Member#active
	 **/
	public static volatile SingularAttribute<Member, Boolean> active;
	
	/**
	 * @see com.jdc.mkt.entity.Member#id
	 **/
	public static volatile SingularAttribute<Member, Integer> id;
	
	/**
	 * @see com.jdc.mkt.entity.Member
	 **/
	public static volatile EntityType<Member> class_;
	
	/**
	 * @see com.jdc.mkt.entity.Member#username
	 **/
	public static volatile SingularAttribute<Member, String> username;

}

