package kodlamaio.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name ="employees")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employeeResumes"})
public class Employee{
	
	@Id
	@GeneratedValue
	@Column(name ="user_id")
	private int userId;
	
	@Column(name ="first_name")
	private String firstName;
	
	@Column(name ="last_name")
	private String lastName;
	
	@Column(name ="national_id")
	private String nationalId;
	
	@Column(name ="birth_of_date")
	private Date birthOfDate;
	
	@OneToMany(mappedBy="employee")
	private List<EmployeeResume> employeeResumes;

	public Employee(int userId, String firstName, String lastName, String nationalId, Date birthOfDate) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.birthOfDate = birthOfDate;
	}
}
