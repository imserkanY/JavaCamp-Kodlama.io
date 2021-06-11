package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name ="employers")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class Employer {

	@Id
	@Column(name ="user_id")
	private int userId;
	
	@Column(name ="company_name")
	private String companyName;
	
	@Column(name ="web_site")
	private String webSite;
	
	@Column(name ="phone")
	private String phone;
	
	@Column(name ="verified_system")
	private boolean verifiedSystem;
	
	@OneToMany(mappedBy="employer")
	private List<JobAdvertisement> jobAdvertisements;
	
	public Employer(int userId, String companyName, String phone, String webSite, boolean verifiedSystem) {
		this.userId = userId;
		this.companyName = companyName;
		this.phone = phone;
		this.verifiedSystem = verifiedSystem;
		this.webSite = webSite;
	}
}
