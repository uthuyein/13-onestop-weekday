package com.jdc.mkt.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(
		name = "account_tbl",
		indexes = {
				@Index(columnList = "username,email")
		},
		uniqueConstraints = {
				@UniqueConstraint(columnNames = {"username","email"})
		}
		)
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String email;
	private String password;
	private boolean active;
}
