package com.jdc.mkt.entity;

import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@StaticMetamodel(Registration.class)
public abstract class Registration_ {

	public static final String REGISTRED_AT = "registredAt";
	public static final String VALID_AT = "validAt";

	
	/**
	 * @see com.jdc.mkt.entity.Registration#registredAt
	 **/
	public static volatile SingularAttribute<Registration, LocalDate> registredAt;
	
	/**
	 * @see com.jdc.mkt.entity.Registration#validAt
	 **/
	public static volatile SingularAttribute<Registration, LocalDate> validAt;
	
	/**
	 * @see com.jdc.mkt.entity.Registration
	 **/
	public static volatile EmbeddableType<Registration> class_;

}

