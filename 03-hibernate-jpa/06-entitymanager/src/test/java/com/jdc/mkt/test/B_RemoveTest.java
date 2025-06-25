package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Category;
import com.jdc.mkt.entity.Product;

public class B_RemoveTest extends JpaFactory {

	@Test
	//@Disabled
	@Order(3)
	void productListRemoveTest() {
		// To be managed	
		em.getTransaction().begin();
		
		var cat = em.find(Category.class, 1);
		assertTrue(em.contains(cat));
		
		var list = cat.getProducts();
		list.remove(2);
		
		em.getTransaction().commit();

	}
	
	@Test
	@Disabled
	@Order(2)
	void categoryRemoveTest() {
		// To be managed
		var cat = em.find(Category.class, 1);
		assertTrue(em.contains(cat));
		em.getTransaction().begin();
		em.remove(cat);
		em.getTransaction().commit();

	}
	
	@Test
	@Disabled
	@Order(1)
	void productRemoveTest() {
		// To be managed
		var prod = em.find(Product.class, 1);
		assertTrue(em.contains(prod));
		em.getTransaction().begin();
		em.remove(prod);
		em.getTransaction().commit();

	}
}
