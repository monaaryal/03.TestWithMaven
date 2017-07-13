package com.fanniemae.payroll.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.fanniemae.payroll.model.EmployeeType;

public class EmployeeRepository {
	public int getsize(){
		return 3;
	}
	
	public ArrayList<EmployeeType> findAll(){
		String fileName="/data/employees.txt";
		boolean isEmpty =true;
		
			FileReader fr;
			
			ArrayList<EmployeeType> list =new ArrayList<>();
			
			try {
				fr = new FileReader(fileName);
				BufferedReader br =new BufferedReader(fr);
				String row ="";
				
				br.readLine();// to read first line,is header
				
				while ((row =br.readLine()) != null  ){
					isEmpty = false;
					
					String[]columns =row.split(",");
					if(columns.length<3){
						
						continue;
						//create a report
						
					}
					String type= columns [0];
					float salary=Float.parseFloat( columns[1]);
					
					float hoursWorked=Float.parseFloat( columns[2]);
					
					EmployeeType empType = new EmployeeType(type, salary, hoursWorked);
					System.out.println(empType);
					
					list.add(empType);
					
				}
				
				System.out.println("The file is empty");
				
				if (isEmpty) {
				System.out.println("the file is empty");	
				}
				
				System.out.println("Size of the list "+ list.size());
				
				br.close();

		
			}
			catch(Exception e){ //handles everything.
				System.out.println("wow!,this is good");
				
				e.printStackTrace();
			}
		return list;
	}

}
