package com.jdc.mkt.test.queryForAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.mkt.entity.Drivers;
import com.jdc.mkt.test.A_JpaFactory;

public class B_DriverTestByAddress extends A_JpaFactory{

	@Order(1)
	@ParameterizedTest
	@CsvSource({
		"mandaly,3",
		"Yankin,1"
	})
	void useNativeSearchByAddress(String name,int result) {
		
	}
	@Order(2)
	@ParameterizedTest
	@CsvSource({
		"mandalay,3",
		"Yankin,1"
	})
	void useJpqlSearchByAddress(String name,int result) {
		var query = em.createQuery("""
				select d from Drivers d 
				where d.addresses.state = :name or 
				d.addresses.township = :name
				""",Drivers.class);
		query.setParameter("name", name);
		var list = query.getResultList();
		assertEquals(result, list.size());
	}
	
	@Order(3)
	@ParameterizedTest
	@CsvSource({
		"mandaly,3",
		"Yankin,1"
	})
	void useCriteriaSearchByAddress(String name,int result) {}
}
