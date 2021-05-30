package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name ="employees")
@AllArgsConstructor
@NoArgsConstructor
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
}
