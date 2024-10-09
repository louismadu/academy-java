package com.bptn.course._21_hashMap;

import java.util.HashMap;

public class HashMap11 {

	public static void main(String[] args) {
		HashMap<Integer, String> numbers = new HashMap<>();

		numbers.put(1, "one");
		numbers.put(2, "two");
		numbers.put(3, "three");
		numbers.put(4, "four");
		numbers.put(5, "five");
		numbers.put(6, "six");
		numbers.put(7, "seven");
		numbers.put(8, "eight");
		numbers.put(9, "nine");
		numbers.put(10, "ten");

		for (Integer key : numbers.keySet()) {
			System.out.println(key + " : " + numbers.get(key));
		}

		numbers.remove(7);

		numbers.put(11, "eleven");

		for (Integer key : numbers.keySet()) {
			System.out.println(key + " : " + numbers.get(key));
		}

	}
}

class HashMapDemo2 {

	public static void main(String[] args) {
		HashMap<String, Integer> people = new HashMap<>();

		people.put("Angie", 33);
		people.put("Steve", 30);
		people.put("John", 32);

		for (String name : people.keySet()) {
			System.out.println("Name: " + name + ", Age: " + people.get(name));
		}
	}
}