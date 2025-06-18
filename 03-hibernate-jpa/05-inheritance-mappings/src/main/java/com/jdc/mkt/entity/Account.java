package com.jdc.mkt.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
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
	
	private LocalDate createDateAt;
	private LocalTime createTimeAt;
	
	
	public enum AccountType{
		EMPLOYEE,MANAGER,CUSTOMER
	}
	
}
