package com.bptn.course._20_myProject;

import java.io.Serializable;

public class Participant implements Serializable {
	private long id;
	private String name;
	private int age;
	private String bloodGroup;
	private String genotype;
	private String gender;
	private String race;

	// Constructor
	public Participant(long id, String name, int age, String bloodGroup, String genotype, String gender, String race) {
		this.id = id;
		this.name = name;
		setAge(age);
		this.bloodGroup = bloodGroup;
		this.genotype = genotype;
		this.gender = gender;
		this.race = race;
	}

	// Getters and Setters
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 18 || age > 50)
			throw new IllegalArgumentException("Invalid age");
		this.age = age;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public String getGenotype() {
		return genotype;
	}

	public String getGender() {
		return gender;
	}

	public String getRace() {
		return race;
	}

	@Override
	public String toString() {
		return "Participant{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", bloodGroup='" + bloodGroup
				+ '\'' + ", genotype='" + genotype + '\'' + ", gender='" + gender + '\'' + ", race='" + race + '\''
				+ '}';
	}
}
