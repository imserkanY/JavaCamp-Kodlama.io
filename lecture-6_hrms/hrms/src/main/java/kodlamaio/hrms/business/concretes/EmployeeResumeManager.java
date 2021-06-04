package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.EmployeeResumeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.EmployeeResume;

public class EmployeeResumeManager implements EmployeeResumeService{

	@Override
	public EmployeeResume add(EmployeeResume employeeResume) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeResume addImg(int id, MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<EmployeeResume>> getByEmployee_EmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<EmployeeResume>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
