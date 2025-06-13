package com.jdc.mkt.test;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import jakarta.persistence.Persistence;

@TestMethodOrder(OrderAnnotation.class)
public class JpaFactory {

	@Test
	void test() {
		var emf = Persistence.createEntityManagerFactory("inheritance-mappings");
	}
}
