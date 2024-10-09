package com.bptn.course._20_myProject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Questionnaire {
	private List<Participant> participants;

	public Questionnaire() {
		this.participants = new ArrayList<>();
	}

	public void addParticipant(Participant participant) {
		participants.add(participant);
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public void saveToFile(String filename) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(participants);
		} catch (IOException e) {
			System.err.println("Error saving to file: " + e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	public void loadFromFile(String filename) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			participants = (List<Participant>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Error loading from file: " + e.getMessage());
		}
	}

	public Participant getParticipantById(long id) {
		for (Participant p : participants) {
			if (p.getId() == id)
				return p;
		}
		return null;
	}
}
