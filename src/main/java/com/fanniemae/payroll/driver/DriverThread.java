package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.EmailProcess;

public class DriverThread {

	public static void main(String[] args) {
		
		EmailProcess e =new EmailProcess();
		//e.sendEmail();
		Thread t2 =new Thread(e);
		t2.start();
		
		Thread t = new Thread(){
		
		public void run() {for (int i =0; i<20; i++){
			System.out.println("Loop 2" + i);
		}
			
		}
		};
		t.start();
		
		for (int i = 0; i < 20; i++) {
			
			System.out.println("Loo 1 "+ i);
			
		}

	}

}
