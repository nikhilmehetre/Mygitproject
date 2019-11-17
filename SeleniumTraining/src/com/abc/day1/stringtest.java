package com.abc.day1;

public class stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Nikhil";
		String LastName = "Meh";
		
		/*System.out.println(firstName.concat(" ").concat(LastName));
		System.out.println(firstName.toLowerCase());
		System.out.println(firstName.toUpperCase());
		System.out.println(firstName.charAt(2));
		System.out.println(firstName.length());
		System.out.println(firstName.replace('i', 'u'));
		System.out.println(firstName.replace("nik", "jyo"));
		System.out.println(firstName + LastName);
		System.out.println(firstName.substring(3));
		System.out.println(firstName.substring(2,3));
		*/
		System.out.println(firstName.equals(LastName));
		String names = "Weather is nice in mumbai";
		String [] substr = names.split("i");
		System.out.println(substr[1]);

	}

}
