package com.bptn.course._15_arrayListDemo;

import java.util.ArrayList;

public class BookList {



	public static void main(String[] args) {
		// Create a new ArrayList called "myBooks"
		int counter = 1;
		ArrayList<String> myBooks = new ArrayList<>();
		
		//Add 3 books to the List
		myBooks.add("Book1".toLowerCase());
		myBooks.add("Book2".toLowerCase());
		myBooks.add("Book3".toLowerCase());
		
		//Display All Books
		System.out.println("My Favorite books are:" + myBooks);
		for(String book : myBooks) {
			System.out.println("My Favorite books are:" + counter + book);
			counter++;
			
			
		//Display the first book
		System.out.println(myBooks.get(0));
		System.out.println(myBooks.getFirst());
		}
		
		//Delete the second book
		myBooks.remove(1);
		System.out.println("My Favorite books are:" + myBooks);
		
		
		//Search for a book
		if(myBooks.contains("Book1".toLowerCase())) {
			System.out.println("Book found");
		}else {
			System.out.println("Book Not Found");
		}
		
		System.out.println("The Size of My Favorite books is:" + myBooks.size());
		System.out.println("The Last book of my Favorite books is : " + myBooks.get(myBooks.size()-1));

	}

}
