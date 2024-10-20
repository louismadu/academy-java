package com.bptn.course._24_junit_books;

public class Books {
	private String title;
	private double price;

	public Books(String title, double price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getBookInfo() {
		return title + "-" + price;
	}

}