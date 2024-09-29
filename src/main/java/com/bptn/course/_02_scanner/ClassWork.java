package com.bptn.course._02_scanner;

import java.util.Scanner;

public class ClassWork {

	public static void main(String[] args) {
		// scanner and variables
		
		Scanner scan = new Scanner(System.in);
		double price = 0.0;
		int choice;
		boolean isRestart = false;
		
		
		double[] price = {2.55, 1.99, 1.49, 2.99};
	
		//Create scanner object
		double price = scan.nextDouble(); 
		
		//Display Listof Products
		
		//
	    System.out.println("Welcome to the vending machine. what will you like to have?");
	    System.out.println("1. Coke - $2.55");
	    System.out.println("2. Pepsi - $1.99");
	    System.out.println("3. water - $1.49");
	    System.out.println("4. cookies - $2.99");
	    
	    
	   do {
		   System.out.println("What will you like to have?");
		   choice= scan.nextInt();
		   
		   switch(choice) {
		       case 1 : System.out.println("How much do you want to pay?");
		               amountToPay = scan.nextDouble();
		       if(amountToPay >= 1.49) {
		    	   System.out.println("Your Change is: " + (amountToPay_1.49));
		       } else {
		    	   System.out.println("Insufficient Fund");
		    	   isRestart = true;
		       }
		   case 1 : System.out.println("How much do you want to pay?");
	           amountToPay = scan.nextDouble();
	           if(amountToPay >= 1.99) {
	    	       System.out.println("Your Change is: " + (amountToPay_1.49));
	           } else {
	    	      System.out.println("Insufficient Fund");
	    	      isRestart = true;
	           }	
	       case 1 : System.out.println("How much do you want to pay?");
	       amountToPay = scan.nextDouble();
	       if(amountToPay >= 2.99) {
	    	   System.out.println("Your Change is: " + (amountToPay_1.49));
	       } else {
	    	   System.out.println("Insufficient Fund");
	    	   isRestart = true;
	       }
		   }
	   }


	}

}
