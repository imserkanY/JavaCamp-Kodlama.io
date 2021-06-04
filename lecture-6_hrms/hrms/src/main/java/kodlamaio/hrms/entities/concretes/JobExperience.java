package kodlamaio.hrms.entities.concretes;

import java.util.Date;

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
@Table(name ="job_experiences")
@AllArgsConstructor
@NoArgsConstructor
public class JobExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name ="company_name")
	private String companyName;

	@Column(name ="position_name")
	private String positionName;
	
	@Column(name ="entry_date")
	private Date entryDate;
	
	@Column(name ="quit_date")
	private Date quitDate;

    @ManyToOne()
    @JoinColumn(name="resume_id")
    @JsonIgnore
    private EmployeeResume employeeResumes;

}
