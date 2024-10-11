package com.bptn.course._11_TeachbackCode2;

//public abstract class Bird {
//
//	void fly() {
//		System.out.println("Flyng");
//
//	}
//}
//
//class Duck extends Bird {
//
//	@Override
//	void fly() {
//
//	}
//}
//
//class Penguin extends Bird {
//
//	@Override
//	void fly() {
//		throw new UnsupportedOperationException("Penguins can't fly!");
//	}
//}

// Correct Implementation of LSP

//interface Flyable {
//	void fly();
//}
//
//class Bird {
//	void eat() {
//		System.out.println("Eating");
//	}
//}
//
//class Duck extends Bird implements Flyable {
//	@Override
//	public void fly() {
//		System.out.println("Duck is flying");
//	}
//}
//
//class Penguin extends Bird {
//	// No fly method, behaves correctly
//}
