
package com.fanniemae.payroll.driver;

public class DriverCountryRepository {

	public static void main(String[] args) {
		Countryrepository dao = new Countryrepository();
		dao.findAll().forEach(System.out::println);

	}
}
