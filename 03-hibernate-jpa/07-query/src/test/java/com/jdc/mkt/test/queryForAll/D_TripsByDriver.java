package com.jdc.mkt.test.queryForAll;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Drivers;
import com.jdc.mkt.test.A_JpaFactory;

public class D_TripsByDriver extends A_JpaFactory{

	@Order(1)
	@Test
	void useJpqlSearchByTripsAt() {
		var query = em.createQuery("""
				select d from Drivers d
				""",Drivers.class);
		//query.setParameter("pId", 1);
		var list = query.getResultList();
		System.out.println(list.size());
	}
	
	@Order(2)	
	void useCriteriaSearchByDriverName(String name,int result) {}
	
	@Order(3)
	void useNativeSearchByDriverName(String name,int result) {
		
		
	}
}



