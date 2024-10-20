package com.bptn.course._28_file_handling_basics;

import java.io.FileWriter;
import java.io.IOException;

class FileCreateDemo {
	int studentID;
	String studentName;

	public String getStudentName() {
		return studentName;
	}

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("sample.txt");
			writer.write("This is a new file! ");
			System.out.println("File created!");
			writer.close();
		} catch (IOException e) {
			System.out.println("Something went wrong while creating the file.");
			e.printStackTrace();
		}

	}

}
