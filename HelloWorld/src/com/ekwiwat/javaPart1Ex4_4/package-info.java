package com.ekwiwat.javaPart1Ex4_4;

import java.util.Scanner;

class exercise4_4 {
	public static void main(String[] args) {
//		ข้อ 4.4 Lab6.1
		int i = 0;
		while (i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
//		ข้อ 4.4 Lab6.2
		int sum = 0;
		for(int j = 1; j <= 10; j++) {
			sum += j;
		}
		System.out.println("Sum = " + sum);
		
//		ข้อ 4.4 Lab6.3
		
		for(int k = 1; k <= 100; k++) {

			if (k%12 == 0) {
				System.out.println(k);
			}			
		}
//		ข้อ 4.4 Lab6.4
		int myArray[] = {1,2,3,4,5};
		for(int l : myArray) {
			System.out.println(l);
		}
		
//		ข้อ 4.4 lab7.1
		int counter = 20;
		do {
			System.out.println("counter : " + counter);
			counter--;
		} while (counter >= 0);
		
//		ข้อ 4.4 lab7.2
		Scanner input = new Scanner(System.in);
		int number;
		
		do {
			System.out.println("Enter a number: ");
			number = input.nextInt();
		} while (number%2 == 0);
		
//		ข้อ 4.4 lab8.1 a
		for(int count = 0; count <=20; count++) {
			if(count == 11) {
				System.out.println(count);
				break;
			}
		}
		
		
	}
}