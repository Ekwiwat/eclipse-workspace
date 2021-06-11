package com.ekwiwat.javaPart1Ex4_3;

class exercise4_3 {
	public static void main(String[] args) {
		int score = 80;
		String grade = "";
		
		switch (score) {
		case 80:
			grade = "Grade A"; break;
		case 70:
			grade = "Grade B"; break;
		case 60:
			grade = "Grade C"; break;
		case 50:
			grade = "Grade D"; break;
		case 40:
			grade = "Grade F"; break;
		default:
			System.out.println("Grade E");
		}
		System.out.println(grade);
	}
}