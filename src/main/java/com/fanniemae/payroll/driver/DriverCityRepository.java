package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.dao.Cityrepository;

public class DriverCityRepository {

	public static void main(String[] args) {
		Cityrepository dao =new Cityrepository();
		dao.findAll().forEach(System.out:: println);

	}

}
