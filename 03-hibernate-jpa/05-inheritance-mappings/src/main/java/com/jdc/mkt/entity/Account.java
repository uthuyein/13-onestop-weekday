package com.jdc.mkt.entity;

import java.awt.Image;
import java.time.LocalDate;
import java.time.LocalTime;

import com.jdc.mkt.entity.converters.StringConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
//@MappedSuperclass
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
					name = "entityName",
					discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("1")
public abstract class Account {
	@Id
	@Column(length = 30)
	private String email;
	
	@Column(nullable = false,unique = true,length = 30)
	private String username;
	
	@Column(nullable = false,length = 30)
	private String password;
	
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	
	@Convert(converter = StringConverter.class)
	private String value;
	
	private LocalDate createDateAt;
	private LocalTime createTimeAt;
	
	
	public enum AccountType{
		EMPLOYEE,MANAGER,CUSTOMER
	}
	
}







