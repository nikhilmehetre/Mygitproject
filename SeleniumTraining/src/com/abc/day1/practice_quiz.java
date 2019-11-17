package com.abc.day1;
import java.util.Scanner;

public class practice_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("enter username:");
				
		String userName = myObj.nextLine();
		System.out.println("username is " + userName);
		System.out.println("enter radius:");
		double radius = myObj.nextDouble();
		double area = (3.14*radius*radius);
		System.out.println("area is " + area);
		
		
	}

}
