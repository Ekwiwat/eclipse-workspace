package com.ekwiwat.javaPart1Ex4_4;

class exercise4_4 {
	public static void main(String[] args) {
//		ข้อ 4.4.1
		int i = 0;
		while (i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
//		ข้อ 4.4.2
		int sum = 0;
		for(int j = 1; j <= 10; j++) {
			sum += j;
		}
		System.out.println("Sum = " + sum);
		
//		ข้อ 4.4.3
		
		for(int k = 1; k <= 100; k++) {

			if (k%12 == 0) {
				System.out.println(k);
			}			
		}
//		ข้อ 4.4.4
		int myArray[] = {1,2,3,4,5};
		for(int l : myArray) {
			System.out.println(l);
		}
	}
}