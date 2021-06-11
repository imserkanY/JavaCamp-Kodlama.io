package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmployeeResume;

public interface EmployeeResumeService {
	
	Result add(EmployeeResume employeeResume);
	
	DataResult<List<EmployeeResume>> getByEmployee_EmployeeId(int employeeId);
	
	DataResult<List<EmployeeResume>> getAll();

}
