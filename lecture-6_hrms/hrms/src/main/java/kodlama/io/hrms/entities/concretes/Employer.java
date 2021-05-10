package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employers")
public class Employer {
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="company_name")
	private String company_name;
	
	@Column(name="web_sites")
	private String web_sites;
	
	@Column(name="phone")
	private String phone;

	public Employer() {

	}

	public Employer(int user_id, String company_name, String web_sites, String phone) {
		super();
		this.user_id = user_id;
		this.company_name = company_name;
		this.web_sites = web_sites;
		this.phone = phone;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getWeb_sites() {
		return web_sites;
	}

	public void setWeb_sites(String web_sites) {
		this.web_sites = web_sites;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
