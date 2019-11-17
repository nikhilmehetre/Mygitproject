package com.abc.day1;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user;
		Scanner in = new Scanner(System.in);
		System.out.println("enter name\n");
		user = in.nextLine();
		System.out.println("welcome "+user);
		
	}

}
