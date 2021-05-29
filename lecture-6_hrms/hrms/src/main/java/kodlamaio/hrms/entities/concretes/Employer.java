package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name ="employers")
@AllArgsConstructor
@NoArgsConstructor
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
}
