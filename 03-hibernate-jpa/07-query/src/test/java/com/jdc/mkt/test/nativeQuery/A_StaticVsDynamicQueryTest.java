package com.jdc.mkt.test.nativeQuery;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Passengers;
import com.jdc.mkt.test.A_JpaFactory;

public class A_StaticVsDynamicQueryTest extends A_JpaFactory{

	
	@Test
	@Order(2)
	void staticQueryTest() {
		var query = em.createNamedQuery("Passengers.selectAllPassengerByNameEqual", Passengers.class);
		query.setParameter("name", "andrew");
		var list = query.getResultList();
		show(list);
	}
	@Test
	@Order(1)
	void dynamicQueryTest() {
		var query = em.createNativeQuery("select * from passengers_tbl where createAt is Null ", Passengers.class);
		var list = query.getResultList();
		show(list);
	}
}
