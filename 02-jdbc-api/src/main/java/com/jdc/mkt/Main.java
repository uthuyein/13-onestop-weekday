package com.jdc.mkt;

import com.jdc.mkt.entity.Address;
import com.jdc.mkt.services.AddressServiceImpl;
import com.jdc.mkt.services.DbServiceInt;
import com.jdc.mkt.services.UseProcedure;

public class Main {

	public static void main(String[] args) {
		//DbServiceInt db = new PersonServiceImpl();
		//Person p = new Person(2,"Phyo thaw", 45, "9/554234");
		//db.save(p);
		//db.delete(1);
		//db.select();
		
		DbServiceInt<Address> db = new AddressServiceImpl();
		Address a = new Address("Yangon", "Kamaryut", "Htantapin");
		db.save(a);
		a = new Address("Yangon", "Innsein", "Htantapin");
		db.save(a);
		
		
		//db.update(new Address(2,"Yangon", "Innsein", "payami street"));
		//db.select(new Address("Yangon","Kamaryut",""));
		
		UseProcedure p = new AddressServiceImpl();
		p.getStreetByStateAndTownship("Yangon", "Innsein");
		
	}
}









