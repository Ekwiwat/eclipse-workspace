package com.ekwiwat.javaPart1Ex5;

class exercise5 {
	public static void main(String[] args) {
//	No return method
		String greeting = "Hello World";
		sayHello(greeting);
	}
	public static void sayHello(String word) {
		System.out.println(word);
	}
	
}

// return Method

class returnEx {
	public static void main(String[] args) {
		int a = 11, b = 10;
		String c = "Hello", d = "world";
		int addedInt = addition(a, b);
		String addedString = addition(c, d); 
		System.out.println("addedInt: " + addedInt); 
		System.out.println("addedString: " + addedString);
		}
	
		public static int addition(int n1, int n2) {
		return n1 + n2; 
		}
		
		public static String addition(String n1, String n2) {
		return n1 + " " + n2; 
		}	
	
}