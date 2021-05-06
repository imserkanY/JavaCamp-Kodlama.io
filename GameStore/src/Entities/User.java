package Entities;

import Abstract.Entity;

public class User implements Entity{
	private int Id;
	private String firstName;
	private String lastName;
	private Long nationalId;
	private int birthYear;
	
	public User() {

	}
	
	public User(int id, String firstName, String lastName, Long nationalId, int birthYear) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.birthYear = birthYear;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getNationalId() {
		return nationalId;
	}
	public void setNationalId(Long nationalId) {
		this.nationalId = nationalId;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
}
