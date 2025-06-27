package com.jdc.mkt.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.awt.Color;

@StaticMetamodel(Department.class)
public abstract class Department_ {

	public static final String COLOR = "color";
	public static final String NAME = "name";
	public static final String ID = "id";

	
	/**
	 * @see com.jdc.mkt.entity.Department#color
	 **/
	public static volatile SingularAttribute<Department, Color> color;
	
	/**
	 * @see com.jdc.mkt.entity.Department#name
	 **/
	public static volatile SingularAttribute<Department, String> name;
	
	/**
	 * @see com.jdc.mkt.entity.Department#id
	 **/
	public static volatile SingularAttribute<Department, Integer> id;
	
	/**
	 * @see com.jdc.mkt.entity.Department
	 **/
	public static volatile EntityType<Department> class_;

}

