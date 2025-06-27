package com.jdc.mkt.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Sales.class)
public abstract class Sales_ {

	public static final String TOTAL = "total";
	public static final String DISCOUNT = "discount";
	public static final String TAX = "tax";
	public static final String ID = "id";
	public static final String SUB_TOTAL = "subTotal";

	
	/**
	 * @see com.jdc.mkt.entity.Sales#total
	 **/
	public static volatile SingularAttribute<Sales, Double> total;
	
	/**
	 * @see com.jdc.mkt.entity.Sales#discount
	 **/
	public static volatile SingularAttribute<Sales, Double> discount;
	
	/**
	 * @see com.jdc.mkt.entity.Sales#tax
	 **/
	public static volatile SingularAttribute<Sales, Double> tax;
	
	/**
	 * @see com.jdc.mkt.entity.Sales#id
	 **/
	public static volatile SingularAttribute<Sales, SalesPk> id;
	
	/**
	 * @see com.jdc.mkt.entity.Sales#subTotal
	 **/
	public static volatile SingularAttribute<Sales, Double> subTotal;
	
	/**
	 * @see com.jdc.mkt.entity.Sales
	 **/
	public static volatile EntityType<Sales> class_;

}

