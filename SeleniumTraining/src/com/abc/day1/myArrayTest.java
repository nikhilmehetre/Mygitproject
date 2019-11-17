package com.abc.day1;

public class myArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] numbers;
		//numbers = {2,3,4,5}
		/*int [] numbers = {2,7,9,5};
		for (int i=0; i<numbers.length; i++ ) {
			System.out.println(numbers[i]);
		}
	
		String [] names = {"nikhil", "shreya", "ruksar", "rajnish"};
		for (int i=0; i<names.length; i++ ) {
		System.out.println(names[i]);
		{21,45,67,6}
		
	}*/
		
		//2d array 
		int [][] numbers = { {2,3,5}, {1,9,7,4,70}, {32,20,10,0}};
		for (int i=0; i<numbers.length; i++ ) {
			System.out.println(numbers[1][2]);
			System.out.println(numbers.length);
		}
			for (int row= 0; row < numbers.length; row++) {
				System.out.println();
				for (int col =0; col < numbers[row].length; col++) {
					System.out.print("\t" + numbers[row][col]);
				}
			}
		

	}
	

}
