package com.jdc.mkt.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.MapKeyEnumerated;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Entity
@Table(name ="person_tbl")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false,length = 45)
	private String name;
	private int age;
	
	@ElementCollection
	@CollectionTable(name = "jobs_tbl",
					joinColumns = {
							@JoinColumn(name = "id")
					})
	@Column(name = "valueCol")
	private Set<Registration> jobs;
	
	@ElementCollection
	@CollectionTable(name = "hobbies_tbl",
					joinColumns = {
							@JoinColumn(name = "id")
					})
	private List<Registration> hobbies;	
	
	@ElementCollection
	@CollectionTable(name = "history_tbl",
					joinColumns = {
							@JoinColumn(name = "id")
						})
	@MapKeyColumn(name = "his_key")
	@MapKeyEnumerated(EnumType.STRING)
	private Map<Worker, Registration> histories;
	
	@ElementCollection
	@Enumerated(EnumType.STRING)
	private List<Worker> workers;
	
}
