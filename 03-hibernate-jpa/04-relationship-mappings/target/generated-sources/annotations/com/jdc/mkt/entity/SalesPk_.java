package com.jdc.mkt.entity;

import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import java.time.LocalTime;

@StaticMetamodel(SalesPk.class)
public abstract class SalesPk_ {

	public static final String SALE_TIME = "saleTime";
	public static final String ID = "id";
	public static final String SALE_DATE = "saleDate";

	
	/**
	 * @see com.jdc.mkt.entity.SalesPk#saleTime
	 **/
	public static volatile SingularAttribute<SalesPk, LocalTime> saleTime;
	
	/**
	 * @see com.jdc.mkt.entity.SalesPk#id
	 **/
	public static volatile SingularAttribute<SalesPk, Integer> id;
	
	/**
	 * @see com.jdc.mkt.entity.SalesPk#saleDate
	 **/
	public static volatile SingularAttribute<SalesPk, LocalDate> saleDate;
	
	/**
	 * @see com.jdc.mkt.entity.SalesPk
	 **/
	public static volatile EmbeddableType<SalesPk> class_;

}

