package com.abc.day1;

import java.util.Date;

public class MyfirstPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		/*int sum = firstnum + secondnum;
		System.out.println("sum is \t"+ sum);
		int difference = firstnum - secondnum;
		System.out.println("difference is \t" + difference);
		int multi = firstnum * secondnum;
		System.out.println("product is \t" + multi);
		int division = firstnum / secondnum;
		System.out.println("division is \t" + division);
		int radius = 3;
		double area = 3.14 * radius * radius;
		System.out.println("area of circle is \t" + area);
		*/
		arithmatic artops = new arithmatic();
		System.out.println(artops.addNumbers(num1, num2));
		System.out.println(artops.subtractNumbers(num1, num2));
		System.out.println(artops.multiplyNumbers(num1, num2));
		System.out.println(new Date());
		System.out.println("i said \"hello world.\"");
		System.out.println("first argument is : " +args[0] ); //command line argument passing and calling
		System.out.println("second argument is " +args[1]);

		
	}

}
