package com.fanniemae.payroll;

public abstract  class Employee {
	
	
	


	protected float yearlySalary = 0;
	
	public float getYearlySalary(){
		return yearlySalary;
	}
	public Employee(float yearlySalary){
		
		this.yearlySalary = yearlySalary;
	}

	public float getWeeklySalary(){
		return yearlySalary/52;
	}
	
	public float getMonthlySalary(){
		return yearlySalary/12;
	}
		public float getHourlywage(){
			return     (yearlySalary /52)/40;
	}
	
		
		public float getOverTimeHourlyWage(){
			return 0;
		}
	/* the objectives is to find the monthly salary
	 * create method call getMethonly Salary
	 */
		
		
		
		
} 
