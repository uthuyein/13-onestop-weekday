package com.jdc.mkt.services;

import com.jdc.mkt.entity.Address;
import static com.jdc.mkt.services.MyConnection.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AddressServiceImpl implements DbServiceInt<Address>,UseProcedure{

	
	@Override
	public void getStreetByStateAndTownship(String state, String township) {
		String query = "{call getStreetByStateAndTownship(?,?)}";
		try {
			var con = getConnection();
			var stmt = con.prepareCall(query);
			stmt.setString(1, state);
			stmt.setString(2, township);
			
			var rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("Street : %s".formatted(rs.getString("street")));
			}
			
			stmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void save(Address p) {
		String query = "insert into address_tbl(state,township,street)values(?,?,?)";
		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, p.getState());
			stmt.setString(2, p.getTownship());
			stmt.setString(3, p.getStreet());
			int result = stmt.executeUpdate();
			
			var rs = stmt.getGeneratedKeys();
			
			while(rs.next()) {
				System.out.println("Result primary key :"+rs.getInt(1));
			}
			
			
			
			stmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		String query = "delete from address_tbl where id = ?";
		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			
			stmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Address a) {
		String query = "update address_tbl set state = ? ,township = ? ,street = ? where id = ?";
		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, a.getState());
			stmt.setString(2, a.getTownship());
			stmt.setString(3, a.getStreet());
			stmt.setInt(4, a.getId());
			stmt.executeUpdate();
			
			stmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Address[] select(Address address) {
		String query = "select * from address_tbl where 1=1";
		List<Object> list = new ArrayList<Object>();
		
		if(null != address.getState() && !address.getState().isBlank()) {
			query = query+" and state = ?";
			list.add(address.getState());
		}
		
		if(null != address.getTownship() && !address.getTownship().isBlank()) {
			query = query+" and township = ?";
			list.add(address.getTownship());
		}
		if(null != address.getStreet() && !address.getStreet().isBlank()) {
			query = query+" and street  = ?";
			list.add(address.getStreet());
		}
		
		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement(query);
			
			for(int i = 0 ;i < list.size();i ++) {
				stmt.setObject(i+1, list.get(i));
			}
			
			var rs =  stmt.executeQuery();
			
			while(rs.next()) {
				
				System.out.println("Id :%d\tstate :%s\ttownship :%s\tstreet :%s"
						.formatted(
								rs.getInt("id"),
								rs.getString("state"),
								rs.getString("township"),
								rs.getString("street")
								));		
						
			}
			
			stmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	

}
