package com.fanniemae.payroll.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public  class CarRepository implements IQuery<String> {
	
public CarRepository() {
	

System.out.println("I am alive");

}	
	@Override
	public ArrayList<String> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	




	@Override
	public Map<String, Double> findMaps() {
		Map<String,Double> carMap = new HashMap<>();
		carMap.put("Toyota",100_000d);
		carMap.put("Honda",200_000d);
		carMap.put("Mazda",300_000d);
		carMap.put("Lexus",400_000d);
		carMap.put("Nissan",500_000d);
		carMap.put("Hundai",600_000d);
		carMap.put("Sonata",700_000d);
		carMap.put("Infinity",800_000d);
		carMap.put("Acura",900_000d);
		carMap.put("BMW",1_000_000d);
		
		return carMap;
		
		
	
		
		}





	

	
		


	

}
