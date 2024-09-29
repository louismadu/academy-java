package com.bptn.course._05_strings;

public class BigCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Example usage of searchInsert method
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int position = searchInsert(nums, target);
        System.out.println("Position to insert: " + position);
	
    // Testing with another target
    target = 2;
    position = searchInsert(nums, target);
    System.out.println("Position to insert: " + position);
    
    target = 7;
    position = searchInsert(nums, target);
    System.out.println("Position to insert: " + position);
    
    target = 0;
    position = searchInsert(nums, target);
    System.out.println("Position to insert: " + position);
	}
}
