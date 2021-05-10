package kodlama.io.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_seekers")
public class JobSeeker {
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="national_id")
	private long national_id;
	
	@Column(name="birth_of_date")
	private Date birth_of_date;

	public JobSeeker() {

	}

	public JobSeeker(int user_id, String first_name, String last_name, Long national_id, Date birth_of_date) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.national_id = national_id;
		this.birth_of_date = birth_of_date;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Long getNational_id() {
		return national_id;
	}

	public void setNational_id(Long national_id) {
		this.national_id = national_id;
	}

	public Date getBirth_of_date() {
		return birth_of_date;
	}

	public void setBirth_of_date(Date birth_of_date) {
		this.birth_of_date = birth_of_date;
	}

}