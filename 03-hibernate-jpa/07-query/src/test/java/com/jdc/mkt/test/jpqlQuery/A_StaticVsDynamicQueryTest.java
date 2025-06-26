package com.jdc.mkt.test.jpqlQuery;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Passengers;
import com.jdc.mkt.test.A_JpaFactory;

public class A_StaticVsDynamicQueryTest extends A_JpaFactory {

	
	@Test
	@Disabled
	void dynamicQueryTest() {
		var query = em.createQuery("select p from Passengers p",Passengers.class);
		List<Passengers> list =  query.getResultList();
		show(list);
		
	}
	
	@Test
	void staticQueryTest() {
		var query = em.createNamedQuery("Passengers.selectAllPassengers",Passengers.class);
		List<Passengers> list = query.getResultList();
		show(list);
		
	}
	
	
}
