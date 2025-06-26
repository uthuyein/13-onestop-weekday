package com.jdc.mkt.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class A_JpaFactory {

	protected static EntityManagerFactory emf;
	protected EntityManager em;
	
	@BeforeAll
	static void createEmf() {
		emf = Persistence.createEntityManagerFactory("query");
	}
	@AfterAll
	static void closeEmf() {
		if(null != emf && emf.isOpen())
			emf.close();
	}
	@BeforeEach
	void createEm() {
		em = emf.createEntityManager();
	}
	@AfterEach
	void closeEm() {
		if(null != em && em.isOpen())
			em.close();
	}
	@Test
	void test() {}
}
