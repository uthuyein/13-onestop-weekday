package com.jdc.mkt.entity;

import com.jdc.mkt.entity.Licences.BloodType;
import com.jdc.mkt.entity.Licences.LicenceType;
import com.jdc.mkt.listeners.Times;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import java.util.UUID;

@StaticMetamodel(Licences.class)
public abstract class Licences_ {

	public static final String TIMES = "times";
	public static final String LICENCES_ID = "licencesId";
	public static final String DOB = "dob";
	public static final String VALID_DATE = "validDate";
	public static final String LICENCE_NUMBER = "licenceNumber";
	public static final String LICENCE_TYPE = "licenceType";
	public static final String ISSUE_DATE = "issueDate";
	public static final String BLOOD_TYPE = "bloodType";
	public static final String DRIVERS = "drivers";

	
	/**
	 * @see com.jdc.mkt.entity.Licences#times
	 **/
	public static volatile SingularAttribute<Licences, Times> times;
	
	/**
	 * @see com.jdc.mkt.entity.Licences#licencesId
	 **/
	public static volatile SingularAttribute<Licences, UUID> licencesId;
	
	/**
	 * @see com.jdc.mkt.entity.Licences#dob
	 **/
	public static volatile SingularAttribute<Licences, LocalDate> dob;
	
	/**
	 * @see com.jdc.mkt.entity.Licences#validDate
	 **/
	public static volatile SingularAttribute<Licences, LocalDate> validDate;
	
	/**
	 * @see com.jdc.mkt.entity.Licences#licenceNumber
	 **/
	public static volatile SingularAttribute<Licences, String> licenceNumber;
	
	/**
	 * @see com.jdc.mkt.entity.Licences#licenceType
	 **/
	public static volatile SingularAttribute<Licences, LicenceType> licenceType;
	
	/**
	 * @see com.jdc.mkt.entity.Licences#issueDate
	 **/
	public static volatile SingularAttribute<Licences, LocalDate> issueDate;
	
	/**
	 * @see com.jdc.mkt.entity.Licences#bloodType
	 **/
	public static volatile SingularAttribute<Licences, BloodType> bloodType;
	
	/**
	 * @see com.jdc.mkt.entity.Licences
	 **/
	public static volatile EntityType<Licences> class_;
	
	/**
	 * @see com.jdc.mkt.entity.Licences#drivers
	 **/
	public static volatile SingularAttribute<Licences, Drivers> drivers;

}

