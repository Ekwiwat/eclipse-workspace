package com.ekwiwat.javaPart1Ex3;
class exercise3 {
	public static void main(String[] args) {
//	ข้อ 3.1 a 
	int i = 20;
	i++;
	System.out.println(i);
	i++;
	System.out.println(i);
	i++;
	System.out.println(i);
	i++;
	System.out.println(i);
	i++;
	System.out.println(i);
	
//	ข้อ 3.1 b
	--i;
	System.out.println(i);
	--i;
	System.out.println(i);
	--i;
	System.out.println(i);
	--i;
	System.out.println(i);
	--i;
	System.out.println(i);
	
//	ข้อ 3.2
	float float_1 = 2.01f;
	float float_2 = 3.01f;
	
	if ((float_1 == 2.01f) && (float_2 == 3.01f))
		System.out.println("float1 is 2.01f AND float2 is 3.01f");
	
//	ข้อ 3.3
	char char_1 = 'a';
	char char_2 = 'b';
	
	if ((char_1 == 'a') || (char_2 == 'b'))
		System.out.println("char1 is 'a' OR char2 is 'b'");
	
	}
}
