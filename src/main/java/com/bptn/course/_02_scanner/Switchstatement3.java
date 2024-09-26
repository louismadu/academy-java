package com.bptn.course._02_scanner;

import java.util.Scanner;

public class Switchstatement3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number (1-3): ");
		int[] plan = [10, 30, 50, 70];
		
		
		do {
		    System.out.println("Welcome to the Mobile Data Plan Selectior!");
		    System.out.println("Please choose an item from the list: ");
		    System.out.println("1. 1GB - plan[0]");
		    System.out.println("2. 5GB = plan[1]");
		    System.out.println("3. 10GB = plan[2]");
		    System.out.println("4. Unlimited = plan[3]");
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
}
