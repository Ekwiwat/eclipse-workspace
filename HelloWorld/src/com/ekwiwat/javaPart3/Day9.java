package com.ekwiwat.javaPart3;

public class Day9 {
	public static void main(String[] args) {
		Employee dang = new Employee("Dang","Red",10000);
		System.out.println(dang.firstname); // Dang System.out.println(dang.lastname); // Red
		dang.hello(); // Hello Dang
		Employee marvel = new Employee("Captain","Marvel", 20000); System.out.println(marvel.firstname); // Captain
		marvel.hello(); // Hello Captain
	}

}
