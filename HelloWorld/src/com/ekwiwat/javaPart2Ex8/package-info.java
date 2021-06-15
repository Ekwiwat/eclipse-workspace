package com.ekwiwat.javaPart2Ex8;

// ข้อ 8 lab 13.1
class Loop2DimensionArray_2 {
	
public static void main(String[] args) {
int[][] twoD_Array = {
{1, 2, 3},{4, 5, 6, 7},{8, 9}
};
for (int[] row : twoD_Array) { 
	for (int element: row) {
	System.out.println(element);	
}
}

//ข้อ 8 lab 13.2
int sumLast = sumOfElementsInLastColumn(twoD_Array);
System.out.println(sumLast);		
	}
public static int sumOfElementsInLastColumn(int[][] arr)
{
    int sum = 0;

    for (int i = 0; i < arr.length; i++)
    {
        int [] row = arr[i];

        sum += row[row.length - 1];
    }
    return sum;
}

}

