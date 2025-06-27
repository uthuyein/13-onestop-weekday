package com.jdc.mkt.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.MapAttribute;
import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Person.class)
public abstract class Person_ {

	public static final String HOBBIES = "hobbies";
	public static final String JOBS = "jobs";
	public static final String NAME = "name";
	public static final String HISTORIES = "histories";
	public static final String ID = "id";
	public static final String WORKERS = "workers";
	public static final String AGE = "age";

	
	/**
	 * @see com.jdc.mkt.entity.Person#hobbies
	 **/
	public static volatile ListAttribute<Person, Registration> hobbies;
	
	/**
	 * @see com.jdc.mkt.entity.Person#jobs
	 **/
	public static volatile SetAttribute<Person, Registration> jobs;
	
	/**
	 * @see com.jdc.mkt.entity.Person#name
	 **/
	public static volatile SingularAttribute<Person, String> name;
	
	/**
	 * @see com.jdc.mkt.entity.Person#histories
	 **/
	public static volatile MapAttribute<Person, Worker, Registration> histories;
	
	/**
	 * @see com.jdc.mkt.entity.Person#id
	 **/
	public static volatile SingularAttribute<Person, Integer> id;
	
	/**
	 * @see com.jdc.mkt.entity.Person
	 **/
	public static volatile EntityType<Person> class_;
	
	/**
	 * @see com.jdc.mkt.entity.Person#workers
	 **/
	public static volatile ListAttribute<Person, Worker> workers;
	
	/**
	 * @see com.jdc.mkt.entity.Person#age
	 **/
	public static volatile SingularAttribute<Person, Integer> age;

}

