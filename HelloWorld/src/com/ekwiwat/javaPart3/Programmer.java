package com.ekwiwat.javaPart3;

public class Programmer extends Employee{
	public Programmer(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
	super(firstnameInput, lastnameInput, salaryInput, positionInput);		
}

	@Override
	public void hello() {
		System.out.println("Hello World?, " +this.firstname);
	}


	public int getSalary() {
		return super.getSalary();
	} 
	public void createWebsite(String template, String titleName) {}
	public void installWindows(String version, String productKey) {}
	
}