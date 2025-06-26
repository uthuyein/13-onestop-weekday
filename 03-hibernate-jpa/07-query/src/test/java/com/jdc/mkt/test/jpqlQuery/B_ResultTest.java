package com.jdc.mkt.test.jpqlQuery;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Passengers;
import com.jdc.mkt.test.A_JpaFactory;

public class B_ResultTest extends A_JpaFactory{
	
	
	
	@Test
	@Order(3)
	void resultStreamWithNameParamTest() {
		//var query = em.createQuery("select p from Passengers p where lower(name) like lower(:name)", Passengers.class);
		var query = em.createNamedQuery("Passengers.selectAllPassengersByNameLike",Passengers.class);
		
		query.setParameter("name", "w".concat("%"));
		show(query.getResultStream().toList());
	}
	
	@Test
	@Order(2)
	void resultListWithIndexParamTest() {
		var query = em.createQuery("select p from Passengers p where lower(name) like lower(?1)", Passengers.class);
		query.setParameter(1, "a".concat("%"));
		show(query.getResultList());
	}

	@Test
	@Order(1)
	void singleResultTest() {
		var query = em.createQuery("select count(p) from Passengers p", Long.class);
		var result = query.getSingleResult();
		System.out.println("Count :"+result);
	}
	
	
}
