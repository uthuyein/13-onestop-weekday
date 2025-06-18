package com.jdc.mkt.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("4")
public class Manager extends Account{

	public Manager() {
		setAccountType(AccountType.MANAGER);
	}
}
