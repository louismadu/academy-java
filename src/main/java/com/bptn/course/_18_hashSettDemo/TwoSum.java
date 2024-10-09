package com.bptn.course._18_hashSettDemo;

import java.util.HashMap;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int sums = target - nums[i];
			if (map.containsKey(sums)) {
				return new int[] { map.get(sums), i }; // Return the indices
			}
			map.put(nums[i], i); // Store the index of the current number
		}

		throw new IllegalArgumentException("No two sum solution"); // If no solution found
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = twoSum(nums, target);

		System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
	}
}

class TwoSum2 {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int sums = target - nums[i];
			if (map.containsKey(sums)) {
				return new int[] { map.get(sums), i }; // Return the indices
			}
			map.put(nums[i], i); // Store the index of the current number
		}

		throw new IllegalArgumentException("No two sum solution"); // If no solution found
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 4 };
		int target = 6;
		int[] result = twoSum(nums, target);

		System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
	}
}

class TwoSum3 {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int sums = target - nums[i];
			if (map.containsKey(sums)) {
				return new int[] { map.get(sums), i }; // Return the indices
			}
			map.put(nums[i], i); // Store the index of the current number
		}

		throw new IllegalArgumentException("No two sum solution"); // If no solution found
	}

	public static void main(String[] args) {
		int[] nums = { 3, 3 };
		int target = 6;
		int[] result = twoSum(nums, target);

		System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
	}
}