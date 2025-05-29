package com.jdc.mkt.services;

import com.jdc.mkt.entity.Address;
import static com.jdc.mkt.services.MyConnection.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddressServiceImpl implements DbServiceInt<Address>{

	@Override
	public void save(Address p) {
		String query = "insert into address_tbl(state,township,street)values(?,?,?)";
		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement(query);
			
			stmt.setString(1, p.getState());
			stmt.setString(2, p.getTownship());
			stmt.setString(3, p.getStreet());
			int result = stmt.executeUpdate();
			
			System.out.println("Result :"+result);
			
			stmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		String query = "";
		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Address p) {
		String query = "";
		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Address[] select() {
		String query = "";
		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
