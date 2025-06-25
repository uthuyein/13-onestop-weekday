package com.jdc.mkt.entity;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import com.jdc.mkt.listeners.EnableTimesEntity;
import com.jdc.mkt.listeners.Times;
import com.jdc.mkt.listeners.TimesListener;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.ExcludeDefaultListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@DynamicInsert
@RequiredArgsConstructor
//@EntityListeners(TimesListener.class)
@ExcludeDefaultListeners
public class Product implements EnableTimesEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	@Column(nullable = false,unique = true)
	private  String name;
	
	@NonNull
	@Check(constraints = "price > 0")
	@Column(nullable = false)
	private  Double price;
	
	@ManyToOne(fetch = FetchType.LAZY,
			cascade = {
						CascadeType.PERSIST,
						CascadeType.MERGE})
	private Category category;
	
	@Embedded
	private Times times;
	
	@Column(columnDefinition = "boolean default true")
	private Boolean active;
	
	public void addCategory(Category c) {
		this.setCategory(c);
	}
}
