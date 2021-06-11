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
@Table(name ="educations")
@AllArgsConstructor
@NoArgsConstructor
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name ="school_name")
	private String schoolName;
	
	@Column(name ="branch_name")
	private String branchName;
	
	@Column(name ="entry_date")
	private Date entryDate;
	
	@Column(name ="graduation_date")
	private Date graduationDate;

    @ManyToOne()
    @JoinColumn(name="resume_id")
    @JsonIgnore
    private EmployeeResume employeeResumes;
}
