package com.fanniemae.payroll.dao;

public interface Imodify <T,k>{
	public void insert(T t);
	
	//for delete
default void delete(k key){};
}
