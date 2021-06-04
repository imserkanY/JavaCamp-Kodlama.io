package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name ="tech_skills")
@AllArgsConstructor
@NoArgsConstructor
public class TechSkill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name = "programming_language_name")
	private String programmingLanguageName;
	
	@Column(name = "programming_technologie_name")
	private String programmingTechnologieName;
	
    @ManyToOne()
    @JoinColumn(name="resume_id")
    @JsonIgnore
    private EmployeeResume employeeResumes;
}
