package com.heinrich24;

import java.util.Scanner;

public class MyMain {
	
	public static void main(String[] args) {
		System.out.println("Please enter string value and press enter to contiue");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		// Eliminates leading and trailing spaces
		s = s.trim();

		// if length is 0
		if (s == null || s.length() == 0) {
			System.out.println(0);
			return;
		}

		// Split the Input String into tokens based on regex pattern defined
		String[] arrOfSplitStr = s.split("[ !,?._'@]+");
		System.out.println(arrOfSplitStr.length);
		// Loop through the array of Split String items and print items out
		for (String a : arrOfSplitStr) {
			System.out.println(a);
		}
	}

}
