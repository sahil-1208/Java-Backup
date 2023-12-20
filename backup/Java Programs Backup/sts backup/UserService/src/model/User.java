package model;

import java.time.LocalDate;

import enums.Gender;

public class User {

	private int id;
	private String name;
	private LocalDate dob;
	private Gender gender;


	public User(int id, String name, LocalDate dob, Gender gender) {
		
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dob=" + dob + ", gender=" + gender + "]";
	}

}
