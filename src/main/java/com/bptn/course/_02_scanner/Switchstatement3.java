package com.bptn.course._02_scanner;

import java.util.Scanner;

public class Switchstatement3 {
	// Adding a new comment
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		double billAmount = 0.0;
		double[] priceList = {19.99, 8.99, 9.99, 6.99};
		
		do {
			System.out.println("Welcome to the menu!");
			System.out.println("Please choose an item from the list: ");
			System.out.println("1. Pizza - $"+priceList[0]);
			System.out.println("2. Burger - $8.99");
			System.out.println("3. Pasta - $9.99");
			System.out.println("4. Salad - $6.99");
			System.out.println("5. Exit");
			
			choice = scanner.nextInt();
			
			switch(choice) {
				case 1: System.out.println("You ordered Pizza!");
						billAmount += priceList[0];
						break;
				case 2: System.out.println("You ordered Burger!");
						billAmount += 8.99;
						break;
				case 3: System.out.println("You ordered Pasta!");
						billAmount += 9.99;
						break;
				case 4: System.out.println("You ordered Salad!");
						billAmount += 6.99;
						break;
				case 5: if(billAmount>0) {
					System.out.println("Thank you for stopping by! Your bill is: "+billAmount);
				} else{
					System.out.println("Thank you for stopping by!");
				}
					break;
				default:System.out.println("Invalid Choice!");
			}
		}while(choice!=5);
		
		
		scanner.close();
		// 1. Allow multiple selections	
		// 2. Calculate total price for the order
		// 3. While exiting, show the total price	

	}

}
