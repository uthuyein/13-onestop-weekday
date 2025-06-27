package com.jdc.mkt.dto;

import jakarta.persistence.metamodel.EmbeddableType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Contact.class)
public abstract class Contact_ {

	public static final String PHONE = "phone";
	public static final String EMAIL = "email";

	
	/**
	 * @see com.jdc.mkt.dto.Contact#phone
	 **/
	public static volatile SingularAttribute<Contact, String> phone;
	
	/**
	 * @see com.jdc.mkt.dto.Contact
	 **/
	public static volatile EmbeddableType<Contact> class_;
	
	/**
	 * @see com.jdc.mkt.dto.Contact#email
	 **/
	public static volatile SingularAttribute<Contact, String> email;

}

