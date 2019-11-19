package com.venkat;

public class Employee {
	//instance variables
	int id;
	String name;
	float salary;
	static String company= "FaceBook";  //classes data
	//Instance methods
	
	public void readEmp(int id, String name, float Salary) {
		//logical to assign inputs to instance variables
		this.id=id;
		this.name=name;
		this.salary=Salary;
		
	}
	
	public void showEmp() {
		//logic to show emp details
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.salary);
		System.out.println(this.company);
		
	}

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.readEmp(1001, "Scott", 5000);
		emp1.showEmp();
		
		
		System.out.println("*********************");
		
		Employee emp2 = new Employee();
		emp2.readEmp(1002, "Teddy", 6000);
		emp2.showEmp();
		
		
System.out.println("*********************");
		
		Employee emp3 = new Employee();
		emp3.readEmp(1003, "Venkateswara Rao", 9000);
		emp3.showEmp();
		
		System.out.println("*****************");
		
		Employee emp4 = new Employee();
		emp4.readEmp(1004, "Udaya", 7500);
		emp4.showEmp();
		
		
		
		
		
		
	}

}
