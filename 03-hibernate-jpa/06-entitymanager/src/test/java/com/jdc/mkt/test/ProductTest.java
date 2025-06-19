package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.mkt.entity.Category;
import com.jdc.mkt.entity.Product;

public class ProductTest extends JpaFactory{
	

	
	@Order(3)
	@Test
	void productDetachedTest() {
		//To be managed state
		var product = em.find(Product.class, 1);
		assertTrue(em.contains(product));
		
		//To be detached
		em.detach(product);
		assertFalse(em.contains(product));
		product.setName("Durain");
		em.getTransaction().begin();
		//To be managed
		var newProduct = em.merge(product);
		assertFalse(em.contains(product));
		assertTrue(em.contains(newProduct));
		em.getTransaction().commit();
	}

	@Order(2)
	@ParameterizedTest
	@CsvSource(value = {
			"1:Apple"			
			},delimiter = ':')
	void productFindVsGetReferenceTest(int id,String nameResult) {
		var pFind = em.find(Product.class, id);
		em.close();
		assertNotNull(pFind.getName());
		
		//assertThrows(NullPointerException.class, () -> pFind.getName());
		
//		Product pRef = em.getReference(Product.class, id);
//		em.close();
//		assertNotNull(pRef.getName());
		//assertThrows(EntityNotFoundException.class, () -> pRef.getName());
	}
	
	@Test
	@Order(1)
	void productPersistTest() {
		
		// To Be Transient State or New State
		var cat = new Category("Fruits");
		var product = new Product("Orange",2000.00);
		product.setCategory(cat);
		
		assertFalse(em.contains(cat));
		
		//To Be Manage State
		em.getTransaction().begin();
		em.persist(product);		
		em.persist(cat);
		
		assertTrue(em.contains(cat));
		product.setName("Apple");
		em.getTransaction().commit();
		
		
	}
}
