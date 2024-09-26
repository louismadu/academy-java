package com.bptn.course._02_scanner;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Switch Case : when we have more than one variable to compare
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number (2-7): ");
		
		//we use switch case and do-while together
		switch("day of the week") {
			case 1: System.out.println("Today is Sunday");
			        break;
			case 2: System.out.println("Today is Monday");
	                break;			
			case 3: System.out.println("Today is tuesday");
			        break;
			case 4: System.out.println("Today is Wednesday");
					break;
			case 5: System.out.println("Today is Thursday");
			        break;
			case 6: System.out.println("Today is Friday");
			        break;
			case 7: System.out.println("Today is Saturday");
			        break;
			default : System.out.println("Today is Sunday");
		
		}

	}

}
