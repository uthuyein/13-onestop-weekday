package com.jdc.mkt.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Member;
import com.jdc.mkt.entity.Product;

public class D_CallbackTest extends JpaFactory{
	
	@Test
	void persistProductTest() {
		var product = new Product("Lemon",500.00);
		em.getTransaction().begin();
		em.persist(product);
		product.setPrice(200.00);
		em.getTransaction().commit();
	}

	@Test
	@Disabled
	void persistMemberTest() {
		var member = new Member("William","aaA2ffff");
	
		em.getTransaction().begin();
	
		em.persist(member);
		member.setUsername("John");
		em.getTransaction().commit();
	}
}
