package com.jdc.mkt.test;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import com.jdc.mkt.entity.Passengers;

import org.junit.jupiter.api.TestMethodOrder;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@TestMethodOrder(OrderAnnotation.class)
public class A_JpaFactory {

	protected static EntityManagerFactory emf;
	protected EntityManager em;
	
	@BeforeAll
	protected static void createEmf() {
		emf = Persistence.createEntityManagerFactory("query");
	}
	@AfterAll
	protected static void closeEmf() {
		if(null != emf && emf.isOpen())
			emf.close();
	}
	@BeforeEach
	protected void createEm() {
		em = emf.createEntityManager();
		System.out.println("\n ================================================ \n");
	}
	@AfterEach
	protected void closeEm() {
		if(null != em && em.isOpen())
			em.close();
		System.out.println("\n ================================================ \n");
	}
	
	protected void show(List<?> list) {
		list.forEach(p ->  System.out.println("Object :\t"+p));
	}
	
//	@Test
//	void test() {
//		var contact = new Contact();
//		contact.setEmail("test@gmail.com");
//		contact.setPhone("0923234234");
//		var passenger = new Passengers();
//		passenger.setName("Test");
//		passenger.setContact(contact);
//		em.getTransaction().begin();
//		em.persist(passenger);
//		em.getTransaction().commit();
//	}
}
