package com.jdc.mkt.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static final String CREATED_AT = "createdAt";
	public static final String SIZE = "size";
	public static final String DOB = "dob";
	public static final String NAME = "name";
	public static final String ID = "id";

	
	/**
	 * @see com.jdc.mkt.entity.Product#createdAt
	 **/
	public static volatile SingularAttribute<Product, LocalDateTime> createdAt;
	
	/**
	 * @see com.jdc.mkt.entity.Product#size
	 **/
	public static volatile SingularAttribute<Product, Size> size;
	
	/**
	 * @see com.jdc.mkt.entity.Product#dob
	 **/
	public static volatile SingularAttribute<Product, Date> dob;
	
	/**
	 * @see com.jdc.mkt.entity.Product#name
	 **/
	public static volatile SingularAttribute<Product, String> name;
	
	/**
	 * @see com.jdc.mkt.entity.Product#id
	 **/
	public static volatile SingularAttribute<Product, UUID> id;
	
	/**
	 * @see com.jdc.mkt.entity.Product
	 **/
	public static volatile EntityType<Product> class_;

}

