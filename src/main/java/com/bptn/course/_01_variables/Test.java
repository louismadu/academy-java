package com.bptn.course._01_variables;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Skyler", "skyler@sky.com", 123456);
        System.out.println("Name: " +  s1.getName());

        // Fix the bug here!
        System.out.println("Email: " +  s1.getEmail());
        System.out.println("ID: " + s1.getId());

	}

}
