package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name ="employee_resumes")
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResume {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="resume_id")
	private int resumeId;
	
	@Column(name = "github_url")
	private String githubUrl;
	
	@Column(name = "linkedin_url")
	private String linkedinUrl;	
	
	@Column(name = "image_url")
	private String imageUrl;
	
	@ManyToOne()
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	@OneToMany(mappedBy = "employeeResumes")
	private List<CoverLetter> coverLetter;
	
	@OneToMany(mappedBy = "employeeResumes")
	private List<Education> education;
	
	@OneToMany(mappedBy = "employeeResumes")
	private List<ForeignLanguage> foreignLanguage;
	
	@OneToMany(mappedBy = "employeeResumes")
	private List<JobExperience> jobExperience;
	
	@OneToMany(mappedBy = "employeeResumes")
	private List<TechSkill> techSkill;
	
}
