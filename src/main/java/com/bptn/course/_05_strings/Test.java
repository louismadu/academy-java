package com.bptn.course._05_strings;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		
		System.out.println("Press 1 for cookies is 1.99");
		System.out.println("Press 2 for coke is 2.99");
		System.out.println("Press 3 for pepse is 2.49");
		System.out.println("Press 4 for water is 1.49");
		
		Scanner scan = new Scanner(System.in);
		int product = scan.nextInt();
	    
//		double[] price = {1.99, 2.99, 2.49, 1.49};
		
		System.out.println("You Chose: " + product + " How much do you have?");
		int price = scan.nextInt();
		

		
		

	}

}
