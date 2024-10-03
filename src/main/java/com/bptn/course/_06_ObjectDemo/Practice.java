package com.bptn.course._06_ObjectDemo;

class Car { 
    private String color;
    private String brand; 
    private double price; 
    
    public Car(String color, String brand, double price){
         //assign constructor argument to instance variables 
         this.color = color; 
         this.brand = brand; 
         this.price = price; 
    } 
//
//         this.printCarDetails() = printCarDetails;
         
    
    //Define printCarDetails
    public void printCarDetail() { 
      System.out.println("color: " + color + ", brand: " + brand + " , Price: " + price); 
    }


}

class Main{ 
    public static void main(String args[]) {
        Car car1 = new Car("white", "BMW", 70000);                                
        car1.printCarDetails();
   } 
}