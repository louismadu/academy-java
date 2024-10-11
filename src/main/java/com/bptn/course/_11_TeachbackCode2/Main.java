package com.bptn.course._11_TeachbackCode2;

//public class Main {
//
//	public static void main(String[] args) {
//		Bird duck = new Duck();
//		Bird penguin = new Penguin();
//
//		duck.fly(); // Works Fine
//		penguin.fly(); // Throws exception
//
//	}
//}

// Correct Implementation of LSP

//public class Main {
//	public static void main(String[] args) {
//		Flyable duck = new Duck();
//		duck.fly(); // Works fine
//
//		Bird penguin = new Penguin();
//		penguin.eat(); // Works fine
//		// ostrich.fly(); // No fly method, hence no violation
//	}
//}

// CAR

//public class Main {
//	public static void main(String[] args) {
//		Car sedan = new Sedan();
//		sedan.drive(); // Works fine
//		sedan.refuel(); // Works fine
//
//		Car electricCar = new ElectricCar();
//		electricCar.drive(); // Works fine
//		electricCar.refuel(); // Throws exception, violating LSP
//	}
//}

// Correct Implementation of LSP (Refactored Class Hierarchy)
//public class Main {
//    public static void main(String[] args) {
//        Car gasCar = new GasCar();
//        gasCar.drive(); // Works fine
//        ((GasCar) gasCar).refuel(); // Works fine
//
//        Car electricCar = new ElectricCar();
//        electricCar.drive(); // Works fine
//        ((ElectricCar) electricCar).recharge(); // Works fine
//    }
//}
