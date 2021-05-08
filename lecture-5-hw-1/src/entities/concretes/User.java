package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity{
	private int Id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private boolean userVerification;
	
	public boolean isUserVerification() {
		return userVerification;
	}
	public void setUserVerification(boolean userVerification) {
		this.userVerification = userVerification;
	}
	public User(int id, String firstName, String lastName, String email, String password) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
