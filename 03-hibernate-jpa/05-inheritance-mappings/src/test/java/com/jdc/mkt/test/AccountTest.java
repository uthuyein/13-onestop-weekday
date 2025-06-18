package com.jdc.mkt.test;

import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Customer;
import com.jdc.mkt.entity.Customer.MemberType;
import com.jdc.mkt.entity.Department;
import com.jdc.mkt.entity.Employee;

public class AccountTest extends JpaFactory {
	
	@Test
	@Order(3)
	void customerTest() {
		
		Customer cu = new Customer(MemberType.GOLD);
		cu.setCreateDateAt(LocalDate.now());
		cu.setCreateTimeAt(LocalTime.now());
		cu.setEmail("aungaung@gmail.com");
		cu.setUsername("aungaung");
		cu.setPassword("123");
		cu.setValue("50");
		
		em.getTransaction().begin();
		em.persist(cu);
		em.getTransaction().commit();
	}
	@Test
	@Order(2)
	void employeeTest() {
		
		Employee emp = new Employee();
		emp.setCreateDateAt(LocalDate.now());
		emp.setCreateTimeAt(LocalTime.now());
		emp.setDepartment(new Department(1));
		emp.setEmail("andrew@gmail.com");
		emp.setUsername("andrew");
		emp.setPassword("222");
		emp.setValue("34");
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
	}
	
	@Test
	@Order(1)
	void DepartmentTest() {
		Department dep = new Department();
		dep.setName("Services Team");
		dep.setColor(Color.DARK_GRAY);
		
		em.getTransaction().begin();
		em.persist(dep);
		em.getTransaction().commit();
	}
}






