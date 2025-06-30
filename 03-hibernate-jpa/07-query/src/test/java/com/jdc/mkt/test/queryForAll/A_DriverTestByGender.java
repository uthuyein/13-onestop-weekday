package com.jdc.mkt.test.queryForAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.mkt.entity.Drivers;
import com.jdc.mkt.entity.Drivers.Gender;
import com.jdc.mkt.entity.Drivers_;
import com.jdc.mkt.test.A_JpaFactory;

public class A_DriverTestByGender extends A_JpaFactory{

	@Order(1)
	@ParameterizedTest
	@CsvSource({
		"MALE,4",
		"FEMALE,1"
	})
	void useNativeSearchByGender(String gender,int result) {
		var query = em.createNativeQuery("select count(name) from drivers_tbl where gender = :gender ",Integer.class);
		query.setParameter("gender", gender);
		var res = query.getSingleResult();
		assertEquals(result, res);
	}
	
	@Order(2)
	@ParameterizedTest
	@CsvSource({
		"MALE,4",
		"FEMALE,1"
	})
	void useJpqlSearchByGender(String gender,long result) {
		var query = em.createQuery("select count(d) from Drivers d where gender = :gender ",Long.class);
		query.setParameter("gender", Gender.valueOf(gender));
		var res = query.getSingleResult();
		assertEquals(result, res);
	}
	
	@Order(3)
	@ParameterizedTest
	@CsvSource({
		"MALE,4",
		"FEMALE,1"
	})
	void useCriteriaSearchByGender(String gender,long result) {
		var cb = em.getCriteriaBuilder();
		var cq = cb.createQuery(Long.class);
		
		var root = cq.from(Drivers.class);
		
		cq.select(cb.count(root));
		
		cq.where(cb.equal(root.get(Drivers_.gender), Gender.valueOf(gender)));
		
		var query = em.createQuery(cq);
		
		assertEquals(result, query.getSingleResult());
		
	}
}










