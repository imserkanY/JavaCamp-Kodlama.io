package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.EmployeeResume;

public interface EmployeeResumeDao extends JpaRepository<EmployeeResume,Integer>{
	
	List<EmployeeResume> getByEmployee_UserId(int employeeId);
	
}
