package com.jdc.mkt.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
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
