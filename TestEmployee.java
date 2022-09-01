package com.oops.bll;

public class TestEmployee {

	public static void main(String[] args) {
		Employee E1 = new Employee(101,"aryan","raj",35000);
		System.out.println(E1.toString());
		
		
	//test set and get
		//E1.setSalary(70000);
		//System.out.println("new set salary="+70000);
		System.out.println("Annual Salary="+E1.getAnnualSalary());
		System.out.println("raise salary="+E1.raiseSalary(20));
		
		
	}

}
