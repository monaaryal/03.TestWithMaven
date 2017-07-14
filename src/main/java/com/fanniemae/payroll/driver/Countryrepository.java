package com.fanniemae.payroll.driver;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fanniemae.payroll.dao.AbstractSQLDAO;
import com.fanniemae.payroll.dao.IQuery;
import com.fanniemae.payroll.model.City;
import com.fanniemae.payroll.model.Country;

public class Countryrepository extends AbstractSQLDAO implements IQuery<Country>{
	 ArrayList<Country> list =new ArrayList<>();
	
	 @Override
	protected void result(ResultSet rs) throws SQLException {
			
			String code = rs.getString("code");
			String name =rs.getString("name");
			int population =rs.getInt("population");
			list.add(new Country(code,name,population));
				}


			@Override
			public ArrayList<Country> findAll() {
				String sql = "select code,name,population from  Country";
				super.process(sql);
				return list;
				
				
			}
			
			//after to print just one line

			@Override
			public Country findBykey(String key) {
				String sql = "select code,name,population from  Country where code = '"+ key + "'";
				System.out.println(sql);
				
				
				super.process(sql);
				Country country =list.get(0);
				return country ;

				
				}

			}


	


