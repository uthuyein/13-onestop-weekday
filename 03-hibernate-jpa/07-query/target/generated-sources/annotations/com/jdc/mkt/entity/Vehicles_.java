package com.jdc.mkt.entity;

import com.jdc.mkt.entity.Vehicles.Size;
import com.jdc.mkt.listeners.Times;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.UUID;

@StaticMetamodel(Vehicles.class)
public abstract class Vehicles_ {

	public static final String VEHICLES_ID = "vehiclesId";
	public static final String TIMES = "times";
	public static final String SIZE = "size";
	public static final String CAR_LICENCE = "carLicence";
	public static final String CAR_MODEL = "carModel";

	
	/**
	 * @see com.jdc.mkt.entity.Vehicles#vehiclesId
	 **/
	public static volatile SingularAttribute<Vehicles, UUID> vehiclesId;
	
	/**
	 * @see com.jdc.mkt.entity.Vehicles#times
	 **/
	public static volatile SingularAttribute<Vehicles, Times> times;
	
	/**
	 * @see com.jdc.mkt.entity.Vehicles#size
	 **/
	public static volatile SingularAttribute<Vehicles, Size> size;
	
	/**
	 * @see com.jdc.mkt.entity.Vehicles
	 **/
	public static volatile EntityType<Vehicles> class_;
	
	/**
	 * @see com.jdc.mkt.entity.Vehicles#carLicence
	 **/
	public static volatile SingularAttribute<Vehicles, String> carLicence;
	
	/**
	 * @see com.jdc.mkt.entity.Vehicles#carModel
	 **/
	public static volatile SingularAttribute<Vehicles, String> carModel;

}

