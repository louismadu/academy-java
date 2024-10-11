package com.bptn.course._04_arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grades = { { 85, 90, 75 }, { 88, 92, 60 }, { 70, 65, 75 }

		};

		System.out.println(grades[2][1]);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grades[i][j] += 2;
			}
		}
		System.out.println("/n");
		System.out.println();

	}

}
