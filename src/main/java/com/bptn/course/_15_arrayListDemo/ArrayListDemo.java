package com.bptn.course._15_arrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//C-> Create
		//Reserve storage for 10 items
		ArrayList<String> groceries = new ArrayList<>();
		groceries.add("Milk");
		groceries.add("Bread");
		groceries.add("Eggs");
		
		//R-> Read
		System.out.println("Grocery List" + groceries);
		System.out.println(groceries.get(2));
		System.out.println(groceries.getLast());
		System.out.println(groceries.getFirst());
		
		//U->Update
		groceries.set(1,"Coffee");
		System.out.println("Grocery List:" + groceries);
		

	}

}
