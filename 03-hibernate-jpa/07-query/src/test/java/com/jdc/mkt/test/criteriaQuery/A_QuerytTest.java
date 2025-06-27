package com.jdc.mkt.test.criteriaQuery;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Passengers;
import com.jdc.mkt.test.A_JpaFactory;

public class A_QuerytTest extends A_JpaFactory{
	
	 
	@Test
	void searchCountPassengersTest() {
		var cb = em.getCriteriaBuilder();
		
		var cq = cb.createQuery(Long.class);
		var root = cq.from(Passengers.class);
		
		cq.select(cb.count(root));
		
		var query = em.createQuery(cq);
		System.out.println(query.getSingleResult());
	}
	
	@Test
	@Disabled
	void searchByNameLikeTest() {
		//select p from Passengers p where name like :name
		var cb = em.getCriteriaBuilder();	
		var cq = cb.createQuery(Passengers.class);
		
		//from p
		var root = cq.from(Passengers.class);
		
		//select p from Passengers p
		cq.select(root);
		
		//where
		cq.where(cb.like(root.get("name"),
				"a".toLowerCase().concat("%")));
		
		var query = em.createQuery(cq);
		show(query.getResultList());
	
	}
}







