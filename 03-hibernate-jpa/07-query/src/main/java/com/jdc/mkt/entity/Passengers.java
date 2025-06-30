package com.jdc.mkt.entity;

import com.jdc.mkt.listeners.Times;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.Data;

@Data
@Entity
@Table(name = "passengers_tbl")
@NamedQuery(name = "Passengers.selectAllPassengers",query = "select p from Passengers p")
@NamedQuery(name = "Passengers.selectAllPassengersByNameLike",query = "select p from Passengers p where lower(name) like lower(:name)")
@NamedNativeQuery(
		name = "Passengers.selectAllPassengerByNameEqual",
		query = "select * from passengers_tbl where lower(name) = lower(:name) ",
		resultClass = Passengers.class)
public class Passengers {

	@Id
	@GeneratedValue(generator = "table_gen_passenger_tbl")
	@TableGenerator(name = "table_gen_passenger_tbl",initialValue = 5,allocationSize = 1)
	@Column(name = "passengers_id")
	private int passengersId;
	
	@Column(nullable = false,length = 45)
	private String name;
	
	@Embedded
	private Contact contact;
	
	@Embedded
	private Times times;
}
