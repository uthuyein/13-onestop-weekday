package com.jdc.mkt.entity;

import com.jdc.mkt.entity.Payments.PaymentType;
import com.jdc.mkt.listeners.Times;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Payments.class)
public abstract class Payments_ {

	public static final String AMOUNT = "amount";
	public static final String TIMES = "times";
	public static final String PAYMENT_ID = "paymentId";
	public static final String PAYMENT_TYPE = "paymentType";

	
	/**
	 * @see com.jdc.mkt.entity.Payments#amount
	 **/
	public static volatile SingularAttribute<Payments, Double> amount;
	
	/**
	 * @see com.jdc.mkt.entity.Payments#times
	 **/
	public static volatile SingularAttribute<Payments, Times> times;
	
	/**
	 * @see com.jdc.mkt.entity.Payments#paymentId
	 **/
	public static volatile SingularAttribute<Payments, Integer> paymentId;
	
	/**
	 * @see com.jdc.mkt.entity.Payments
	 **/
	public static volatile EntityType<Payments> class_;
	
	/**
	 * @see com.jdc.mkt.entity.Payments#paymentType
	 **/
	public static volatile SingularAttribute<Payments, PaymentType> paymentType;

}

