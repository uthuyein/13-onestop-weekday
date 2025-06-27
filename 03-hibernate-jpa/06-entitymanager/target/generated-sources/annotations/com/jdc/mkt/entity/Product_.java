package com.jdc.mkt.entity;

import com.jdc.mkt.listeners.Times;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static final String TIMES = "times";
	public static final String PRICE = "price";
	public static final String NAME = "name";
	public static final String ACTIVE = "active";
	public static final String ID = "id";
	public static final String CATEGORY = "category";

	
	/**
	 * @see com.jdc.mkt.entity.Product#times
	 **/
	public static volatile SingularAttribute<Product, Times> times;
	
	/**
	 * @see com.jdc.mkt.entity.Product#price
	 **/
	public static volatile SingularAttribute<Product, Double> price;
	
	/**
	 * @see com.jdc.mkt.entity.Product#name
	 **/
	public static volatile SingularAttribute<Product, String> name;
	
	/**
	 * @see com.jdc.mkt.entity.Product#active
	 **/
	public static volatile SingularAttribute<Product, Boolean> active;
	
	/**
	 * @see com.jdc.mkt.entity.Product#id
	 **/
	public static volatile SingularAttribute<Product, Integer> id;
	
	/**
	 * @see com.jdc.mkt.entity.Product#category
	 **/
	public static volatile SingularAttribute<Product, Category> category;
	
	/**
	 * @see com.jdc.mkt.entity.Product
	 **/
	public static volatile EntityType<Product> class_;

}

