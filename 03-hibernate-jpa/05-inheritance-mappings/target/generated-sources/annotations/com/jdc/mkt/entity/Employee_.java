package com.jdc.mkt.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Employee.class)
public abstract class Employee_ extends com.jdc.mkt.entity.Account_ {

	public static final String DEPARTMENT = "department";

	
	/**
	 * @see com.jdc.mkt.entity.Employee#department
	 **/
	public static volatile SingularAttribute<Employee, Department> department;
	
	/**
	 * @see com.jdc.mkt.entity.Employee
	 **/
	public static volatile EntityType<Employee> class_;

}

