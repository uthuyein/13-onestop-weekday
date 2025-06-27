package com.jdc.mkt.entity;

import com.jdc.mkt.entity.Human.Type;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@StaticMetamodel(Human.class)
public abstract class Human_ {

	public static final String DOB = "dob";
	public static final String NAME = "name";
	public static final String TYPE = "type";
	public static final String NRC = "nrc";

	
	/**
	 * @see com.jdc.mkt.entity.Human#dob
	 **/
	public static volatile SingularAttribute<Human, LocalDate> dob;
	
	/**
	 * @see com.jdc.mkt.entity.Human#name
	 **/
	public static volatile SingularAttribute<Human, String> name;
	
	/**
	 * @see com.jdc.mkt.entity.Human#type
	 **/
	public static volatile SingularAttribute<Human, Type> type;
	
	/**
	 * @see com.jdc.mkt.entity.Human
	 **/
	public static volatile EntityType<Human> class_;
	
	/**
	 * @see com.jdc.mkt.entity.Human#nrc
	 **/
	public static volatile SingularAttribute<Human, String> nrc;

}

