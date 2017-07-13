package com.fanniemae.payroll;

public class UnionEmployee extends Employee {
	float hoursWorked = 40f;

	public UnionEmployee(float yearlySalary) {
		super(yearlySalary);

	}

	public UnionEmployee(float yearlySalary, float hoursWorked) {
		super(yearlySalary);

		this.hoursWorked = hoursWorked;

	}
	//code=new,code ==season 
	public UnionEmployee(String code, float yearlySalary, float hoursWorked) throws Exception {
		super(yearlySalary);

		this.hoursWorked = hoursWorked;
		
		if (hoursWorked > 40 && code.equals("new")){
			
		Exception e = new Exception();
		throw e;
			
		}

	}
	
	@Override
	public float getOverTimeHourlyWage() {
		float OverTimeHourlyWage = super.getHourlywage() * 1.5f;

		return OverTimeHourlyWage;
	}

	@Override
	public float getWeeklySalary() {
		float otHours = 0;
		float otpay = 0;
		float weeklySalary = 0;

		if (hoursWorked > 40) {
			otHours = this.hoursWorked - 40;
			otpay = otHours * this.getOverTimeHourlyWage();
			
			weeklySalary = 40 * super. getHourlywage() + otpay;
			

		}
		else{
		 weeklySalary = super.getHourlywage() 
				* this.hoursWorked;
		}

		return weeklySalary;
	}

	@Override
	public String toString() {
		return "I am employee that makes " + this.getYearlySalary() + " yearly";
	}
}
