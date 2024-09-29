package com.bptn.course._02_scanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
System.out.println("What is your name?");
		String name = scan.next();
		
		System.out.println("What is your age?");
		int age = scan.nextInt();
	
		
		System.out.println("Thank you for your input " + "your name is " + name + " your age is " + age);
		
		
		

	}
}
