package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.EmployeeResume;

public interface EmployeeResumeService {
	
	EmployeeResume add(EmployeeResume employeeResume);
	
	EmployeeResume addImg(int id,MultipartFile file);
	
	DataResult<List<EmployeeResume>> getByEmployee_EmployeeId(int employeeId);
	
	DataResult<List<EmployeeResume>> getAll();

}
