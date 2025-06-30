package com.jdc.mkt.test.queryForAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.mkt.entity.Addresses_;
import com.jdc.mkt.entity.Drivers;
import com.jdc.mkt.entity.Drivers_;
import com.jdc.mkt.test.A_JpaFactory;

public class B_DriverTestByAddress extends A_JpaFactory{

	@Order(1)
	@ParameterizedTest
	@CsvSource({
		"mandalay,3",
		"Yankin,1"
	})
	void useNativeSearchByAddress(String name,int result) {
		var query = em.createNativeQuery("""
				select * from drivers_tbl d join addresses_tbl a 
				on d.addresses_id = a.id 
				where a.state = :name or a.township = :name
				""");
		query.setParameter("name", name);
		var list = query.getResultList();
		assertEquals(result, list.size());
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
		"mandalay,3",
		"Yankin,1"
	})
	void useCriteriaSearchByAddress(String name,int result) {
		var cb = em.getCriteriaBuilder();
		var cq = cb.createQuery(Drivers.class);
		
		var root = cq.from(Drivers.class);
		
		cq.select(root);
		var address = root.get(Drivers_.addresses);
		var pState = cb.equal(address.get(Addresses_.state), name);
		var pRegion = cb.equal(address.get(Addresses_.township), name);
		
		cq.where(cb.or(pState,pRegion));
		
		var query = em.createQuery(cq);
		var list = query.getResultList();
		assertEquals(result, list.size());
	}
}










