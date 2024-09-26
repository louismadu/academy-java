package com.bptn.course._02_scanner;

import java.util.Scanner;

public class SwitchStatement11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		double sum = 0.0;
		
		do {
		    System.out.println("Welcome to the menu!");
		    System.out.println("Please choose an item from the list: ");
		    System.out.println("1. Pizza - $12.99");
		    System.out.println("2. Burger - $8.99");
		    System.out.println("3. Pasta - $9.99");
		    System.out.println("4. Salad - $6.99");
		    System.out.println("5. Exit");
		

		

			switch(choice) {
			case 1: System.out.println("You ordered Pizza!");
					break;
					sum += 12.99;
			case 2: System.out.println("You ordered Burger!");
					break;
					sum += 8.99;
			case 3: System.out.println("You ordered Pasta!");
					break;
					sum += 9.99;
			case 4: System.out.println("You ordered Salad!");
					break;
					sum += 6.99;
			case 5: System.out.println("Thank you for stopping by!");
			        System.out.println("Your bill is: " + sum);
					break;
			default:System.out.println("Invalid Choice!");
		    }
		}while(choice!=5);
		

		
		
		// 1. Allow multiple selections	
		// 2. Calculate total price for the order
		// 3. While exiting, show the total price	


	}

}
