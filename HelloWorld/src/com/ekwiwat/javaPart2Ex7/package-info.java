package com.ekwiwat.javaPart2Ex7;

class exercise7 {
	public static void main(String[] args) {
//		ข้อ 1
		String string_1 = "You and Me", string_2 = "you and me";
		if(string_1.equals(string_2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
		
//		ข้อ 2
		if(string_1.contains("Me")) {
			System.out.println("This String contains Me");
		} else {
			System.out.println("This String doesn't contain Me");
		}
		
//		ข้อ 3
		System.out.println("string_1 length : " + string_1.length());
		System.out.println("string_2 length : " + string_2.length());
		
//		ข้อ 4 
		System.out.println(string_1.substring(1,5));
		
//		ข้อ 5
		String mySpaceToTrim = "  Covid-19 2020  ";
		System.out.println(mySpaceToTrim);
		System.out.println(mySpaceToTrim.trim());
		
//		ข้อ 6
		String myString_6 = "hello world";
		System.out.println(myString_6.toUpperCase());
		
//		ข้อ 7
		String myString_7 = "   hello world ";
		System.out.println(myString_7.toUpperCase().trim());
		
	}
}