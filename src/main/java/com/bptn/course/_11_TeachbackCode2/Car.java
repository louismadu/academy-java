package com.bptn.course._11_TeachbackCode2;

//public class Car {
//	void drive() {
//		System.out.println("Driving the car");
//	}
//
//	void refuel() {
//		System.out.println("Refueling the car");
//	}
//}
//
//class Sedan extends Car {
//	@Override
//	void drive() {
//		System.out.println("Driving the sedan");
//	}
//	@Override
//	void refuel() {
//		System.out.println("Refueling the car");
//	}
//}
//
//class ElectricCar extends Car {
//	@Override
//	void drive() {
//		System.out.println("Driving the electric car");
//	}
//
//	@Override
//	void refuel() {
//		// Problem: Electric cars do not refuel in the traditional sense
//		throw new UnsupportedOperationException("Electric cars do not refuel. They need to be recharged.");
//	}
//}

// Correct Implementation of LSP (Refactored Class Hierarchy)

//interface Car {
//    void drive();
//}
//
//class GasCar implements Car {
//    @Override
//    public void drive() {
//        System.out.println("Driving a gas car");
//    }
//
//    public void refuel() {
//        System.out.println("Refueling the gas car");
//    }
//}
//
//class ElectricCar implements Car {
//    @Override
//    public void drive() {
//        System.out.println("Driving an electric car");
//    }
//
//    public void recharge() {
//        System.out.println("Recharging the electric car");
//    }
//}
