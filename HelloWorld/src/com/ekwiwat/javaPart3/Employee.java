package com.ekwiwat.javaPart3;

public class Employee {
	public String firstname;
	public String lastname;
	private int salary;
//	Exercise 13.2.1
	public String position;
	
//	Exercise 13.2.3
	public static void main(String[] args) {
		Employee em1 = new Employee("Ekwiwat", "Patworachakul", 10000, "Programmer");
		em1.checkPosition();
		
	}
	

	public Employee(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
	
		firstname = firstnameInput;
		lastname = lastnameInput;
		salary = salaryInput;
		position = positionInput;
	}
	public void hello() {
		System.out.println("Hello " + firstname);
		
	}
	public int getSalary() {
		return salary;
	}
//	Exercise 13.2.2
	public void checkPosition() {
		System.out.println("My position is " + position);
	}
}