package com.jdc.mkt.listeners;

import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(Times.class)
public abstract class Times_ {

	public static final String CREATE_TIME = "createTime";
	public static final String UPDATE_TIME = "updateTime";

	
	/**
	 * @see com.jdc.mkt.listeners.Times#createTime
	 **/
	public static volatile SingularAttribute<Times, LocalDateTime> createTime;
	
	/**
	 * @see com.jdc.mkt.listeners.Times#updateTime
	 **/
	public static volatile SingularAttribute<Times, LocalDateTime> updateTime;
	
	/**
	 * @see com.jdc.mkt.listeners.Times
	 **/
	public static volatile EmbeddableType<Times> class_;

}

