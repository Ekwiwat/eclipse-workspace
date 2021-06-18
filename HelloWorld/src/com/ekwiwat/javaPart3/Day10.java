package com.ekwiwat.javaPart3;

public class Day10 {
	public static void main(String[] args) {
		Employee dang = new Employee("Dang","Red", 10000, "Admin");
		System.out.println(dang.getSalary());
		dang.hello();
		
		CEO ceo = new CEO("Sonchai","Sudlor",30000, "CEO");
		System.out.println(ceo.getSalary());
		ceo.hello();
		ceo.fire(dang);
		
		Programmer programmer = new Programmer("Ekwiwat","Patworachakul", 15000, "Programmer");
		System.out.println(programmer.getSalary());
		
	}

}
