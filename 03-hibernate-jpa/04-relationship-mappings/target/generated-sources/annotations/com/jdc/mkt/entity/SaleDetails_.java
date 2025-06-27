package com.jdc.mkt.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(SaleDetails.class)
public abstract class SaleDetails_ {

	public static final String TOTAL = "total";
	public static final String PRODUCT = "product";
	public static final String QTY = "qty";
	public static final String ID = "id";
	public static final String SALES = "sales";

	
	/**
	 * @see com.jdc.mkt.entity.SaleDetails#total
	 **/
	public static volatile SingularAttribute<SaleDetails, Double> total;
	
	/**
	 * @see com.jdc.mkt.entity.SaleDetails#product
	 **/
	public static volatile SingularAttribute<SaleDetails, Product> product;
	
	/**
	 * @see com.jdc.mkt.entity.SaleDetails#qty
	 **/
	public static volatile SingularAttribute<SaleDetails, Integer> qty;
	
	/**
	 * @see com.jdc.mkt.entity.SaleDetails#id
	 **/
	public static volatile SingularAttribute<SaleDetails, Integer> id;
	
	/**
	 * @see com.jdc.mkt.entity.SaleDetails
	 **/
	public static volatile EntityType<SaleDetails> class_;
	
	/**
	 * @see com.jdc.mkt.entity.SaleDetails#sales
	 **/
	public static volatile SingularAttribute<SaleDetails, Sales> sales;

}

