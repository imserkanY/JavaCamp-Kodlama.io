package Entities;


public class Customer {
	private int Id;
	private String Firstname;
	private String Lastname;
	private int DateOfBirth;
	private Long NationalityId;
	
	public Customer(int id, String firstname, String lastname, int dateOfBirth, Long nationalityId) {
		super();
		Id = id;
		Firstname = firstname;
		Lastname = lastname;
		DateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public int getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public Long getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(Long nationalityId) {
		NationalityId = nationalityId;
	}
	
	
}
