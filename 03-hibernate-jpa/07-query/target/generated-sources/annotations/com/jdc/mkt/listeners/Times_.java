package com.jdc.mkt.listeners;

import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(Times.class)
public abstract class Times_ {

	public static final String UPDATE_AT = "updateAt";
	public static final String CREATE_AT = "createAt";

	
	/**
	 * @see com.jdc.mkt.listeners.Times#updateAt
	 **/
	public static volatile SingularAttribute<Times, LocalDateTime> updateAt;
	
	/**
	 * @see com.jdc.mkt.listeners.Times
	 **/
	public static volatile EmbeddableType<Times> class_;
	
	/**
	 * @see com.jdc.mkt.listeners.Times#createAt
	 **/
	public static volatile SingularAttribute<Times, LocalDateTime> createAt;

}

