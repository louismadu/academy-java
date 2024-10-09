package com.bptn.course._11_TeachbackCode2;

import java.util.ArrayList;

public class Stock {
	 public static void main(String[] args) {
	        // Instantiate an ArrayList of Strings
	        ArrayList<String> names = new ArrayList<String>();
	        String[] friends = {"Sam", "Jessica", "Mark", "Alexis"};
	        
	        // Fill the ArrayList with Strings from the friends array
	        for (int i = 0; i < friends.length; i++) {
	            names.add(friends[i]);
	        }
	        
	        // Print out names
	        System.out.println(names);
	    }
	}
