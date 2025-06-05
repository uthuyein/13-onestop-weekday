package com.jdc.mkt.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

import com.jdc.mkt.entity.Person;
import static com.jdc.mkt.services.MyConnection.getConnection;
public class PersonServiceImpl implements DbServiceInt<Person> {

	static Person[] persons = new Person[0];

	@Override
	public void save(Person p) {
		
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("""
					insert into person_tbl(name,age,nrc) 
					values('%s',%d,'%s')
					""".formatted(p.getName(),p.getAge(),p.getNrc()));
			
			System.out.println("Result :"+result);
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(
					"delete from person_tbl where id = %d".formatted(id));
			System.out.println("Result :"+result);
			con.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(Person p) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(
					"update person_tbl set name = '%s',age = %d ,nrc = '%s' where id = %d"
					.formatted(p.getName(),p.getAge(),p.getNrc(),p.getId()));
			
			System.out.println("Result :"+result);
			con.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Person[] select(Person person) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from person_tbl");
			
			while(rs.next()) {
				Person p = new Person(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getInt("age"), 
						rs.getString("nrc"));
				addPersonToArray(p);
			}
			showPersons();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void showPersons() {
		for(int i = 0 ;i <persons.length ; i++) {
			System.out.println(
					"Name : "+persons[i].getName()+
					" Age :"+persons[i].getAge()+
					" Nrc :"+persons[i].getNrc());
		}
	}
	
	
	public void addPersonToArray(Person p) {
		persons = Arrays.copyOf(persons, persons.length+1);
		persons[persons.length-1] = p;
	}

}











