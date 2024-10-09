package com.bptn.course._20_myProject;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Questionnaire questionnaire = new Questionnaire();
		Scanner scanner = new Scanner(System.in);
		String filename = "participants.dat";

		// Load existing participants
		questionnaire.loadFromFile(filename);

		while (true) {
			System.out.println("Enter participant ID (or -1 to exit): ");
			long id = scanner.nextLong();
			if (id == -1)
				break;

			scanner.nextLine(); // Consume newline
			System.out.println("Enter name: ");
			String name = scanner.nextLine();

			System.out.println("Enter age: ");
			int age = scanner.nextInt();

			System.out.println("Enter blood group: ");
			String bloodGroup = scanner.next();

			System.out.println("Enter genotype: ");
			String genotype = scanner.next();

			System.out.println("Enter gender: ");
			String gender = scanner.next();

			System.out.println("Enter race: ");
			String race = scanner.next();

			try {
				Participant participant = new Participant(id, name, age, bloodGroup, genotype, gender, race);
				questionnaire.addParticipant(participant);
				System.out.println("Participant added successfully!");
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}

		// Save participants to file
		questionnaire.saveToFile(filename);
		System.out.println("Participants saved successfully!");
	}
}
