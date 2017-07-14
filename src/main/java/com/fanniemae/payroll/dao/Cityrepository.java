package com.fanniemae.payroll.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fanniemae.payroll.model.City;

public  class Cityrepository extends AbstractSQLDAO 

	implements IQuery<City> {
	 ArrayList<City> list =new ArrayList<>();

	@Override
	protected void result(ResultSet rs) throws SQLException {
		
	int id = rs.getInt("id");
	String name =rs.getString("name");
	int population =rs.getInt("population");
	list.add(new City(id,name,population));
		}


	@Override
	public ArrayList<City> findAll() {
		String sql = "select id,name,population from  city";
		super.process(sql);
		return list;
	}
//after to print just one line

	@Override
	public City findBykey(String key) {
		String sql = "select id,name,population from  city where id = "+ key;
		System.out.println(sql);
		
		
		super.process(sql);
		City city =list.get(0);
		return city ;
	}

}
