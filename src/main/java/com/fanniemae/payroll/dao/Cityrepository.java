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

}
