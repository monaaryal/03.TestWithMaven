package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.UnionEmployee;

public class DriverUnionEmployee {

	public static void main(String[] args) {
		
		try {
			UnionEmployee ue =new UnionEmployee("new", 50_000,42);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
