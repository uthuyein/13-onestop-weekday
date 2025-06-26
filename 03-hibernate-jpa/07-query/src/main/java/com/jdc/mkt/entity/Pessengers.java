package com.jdc.mkt.entity;

import com.jdc.mkt.listeners.EnableTimesListener;
import com.jdc.mkt.listeners.Times;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.Data;

@Data
@Entity
@Table(name = "pessengers_tbl")
public class Pessengers implements EnableTimesListener{

	@Id
	@GeneratedValue(generator = "table_gen_pessenger_tbl")
	@TableGenerator(name = "table_gen_pessenger_tbl",initialValue = 1,allocationSize = 1)
	private int id;
	@Column(nullable = false,length = 45)
	private String name;
	
	@Embedded
	private Contact contact;
	
	@Embedded
	private Times times;
}
