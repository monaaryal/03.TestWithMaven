package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.dao.Cityrepository;
import com.fanniemae.payroll.model.City;

public class DriverCityRepository {

	public static void main(String[] args) {
		Cityrepository dao =new Cityrepository();
		//to get out of 200 lines.
		//dao.findAll().forEach(System.out:: println);
		//we did just to got one line.
		
		City city =dao.findBykey("100");
		System.out.println(city);

	}

}
