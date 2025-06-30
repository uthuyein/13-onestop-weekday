package com.jdc.mkt.test.queryForAll;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.mkt.entity.Drivers;
import com.jdc.mkt.test.A_JpaFactory;

public class D_TripsByDriver extends A_JpaFactory{

	@Order(1)
	@Disabled
	@Test
	void useJpqlSearchByTripsAt() {
		var query = em.createQuery("""
				select d from Drivers d
				""",Drivers.class);
		//query.setParameter("pId", 1);
		var list = query.getResultList();
		System.out.println(list.size());
	}
	
	@Disabled
	@Order(2)	
	void useCriteriaSearchByDriverName(String name,int result) {}
	
	@ParameterizedTest
	@Order(3)
	@CsvSource({
		"Andrew,1"
	})
	void useNativeSearchByDriverName(String name,int result) {
		var query = em.createNativeQuery("""
				select * from drivers_tbl d
				join trips_tbl t on t.drivers_id = d.drivers_id 
				join passengers_tbl p on t.passengers_id = p.passengers_id
				where p.name = :name
				""");
		query.setParameter("name", name);
		List<Drivers> list =(List<Drivers>) query.getResultList();
		System.out.println(list);
		
	}
}











