package com.jdc.mkt.entity;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.jdc.mkt.listeners.EnableTimesEntity;
import com.jdc.mkt.listeners.Times;
import com.jdc.mkt.listeners.TimesListener;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@RequiredArgsConstructor
//@EntityListeners(TimesListener.class)
public class Member implements EnableTimesEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	@Column(nullable = false,length = 45,unique = true)
	private String username;
	
	/*
	 * password must hv at least one capital letter ,small letter and digit 
	 * and also character length must between 8 - 20
	 */
	@NonNull
	@Check(constraints = "password regexp '^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,20}$'")
	private String password;
	
	@Column(columnDefinition = "tinyint(1) default 1")
	private Boolean active;
	
	@Embedded
	private Times times;
	
//	@PrePersist
//	void prePersist() {	
//		System.err.println("This is prePersist ");
//	}
//	@PostPersist
//	void postPersist() {
//		System.err.println("This is postPersist");
//	}
//	@PreUpdate
//	void preUpdate() {
//		System.err.println("This is preUpdate");
//	}
//	@PostUpdate
//	void postUpdate() {
//		System.err.println("This is postUpdate");
//	}
	
	
	
	
	
	
	
	
	
	
	
	
}
