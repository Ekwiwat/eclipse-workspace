package com.ekwiwat.javaPart1Ex22;

class Exercise22 {
	
	public static void main(String[] args) {
		bark();
//		ข้อ 2.2.2 a.
		float myFloat = 2.16f;
		int myInt = (int) myFloat;
		System.out.println("myFloat value = " + myFloat);
		System.out.println("myInt value = " + myInt);
		
//		ข้อ 2.2.2 b
		int newInt = 3;
		float newFloat = newInt;
		System.out.println("newInt value = " + newInt);
		System.out.println("newFloat value = " + newFloat);
		
//		ข้อ 2.2.2 c
		double cDouble = 3.323;
		float cFloat = (float) cDouble;
		System.out.println("cDouble value = " + cDouble);
		System.out.println("cFloat value = " + cFloat);
		
//		ข้อ 2.2.2 d
		char dChar = 'a';
		int dInt = dChar;
		System.out.println("dChar value = " + dChar);
		System.out.println("dInt value = " + dInt);
		
//		ข้อ 2.2.3
		final String hello = "Hello";
//		hello = "World";
		
		
	}
	
//	ข้อ 2.2.1
	public static void bark() {
		String dogName = "Emma";
		System.out.println("The Dog name = " + dogName + " bark");
	}
	
}