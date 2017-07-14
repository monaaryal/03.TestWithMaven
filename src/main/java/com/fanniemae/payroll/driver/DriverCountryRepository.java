
package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.model.Country;

public class DriverCountryRepository {

	public static void main(String[] args) {
		Countryrepository dao = new Countryrepository();
		
		
		//to get out of 200 lines.
				//dao.findAll().forEach(System.out:: println);
				//we did just to got one line.
				
				Country country = dao.findBykey("USA");
				System.out.println(country);
				

			}

		

	}

