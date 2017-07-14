package com.fanniemae.payroll.dao;

import java.util.ArrayList;
import java.util.Map;

public interface IQuery<T> {
	
	public ArrayList<T> findAll();
	default public Map<String,Double> findMaps()	
	{
		return null;
	}
	
	//added method return back  database in key
	default public T findBykey (String key) {
	return null;	
	} 

}
