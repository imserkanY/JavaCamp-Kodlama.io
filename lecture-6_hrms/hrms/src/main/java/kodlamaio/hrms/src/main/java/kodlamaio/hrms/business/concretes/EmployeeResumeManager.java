package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeeResumeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeResumeDao;
import kodlamaio.hrms.entities.concretes.EmployeeResume;

@Service
public class EmployeeResumeManager implements EmployeeResumeService{
	
	private EmployeeResumeDao employeeResumeDao;
	
	@Autowired
	public EmployeeResumeManager(EmployeeResumeDao employeeResumeDao) {
		super();
		this.employeeResumeDao = employeeResumeDao;
	}

	@Override
	public Result add(EmployeeResume employeeResume) {
		this.employeeResumeDao.save(employeeResume);
		return new SuccessResult("Özgeçmiş eklendi!");
	}

	@Override
	public DataResult<List<EmployeeResume>> getByEmployee_EmployeeId(int employeeId) {
		return new SuccessDataResult<List<EmployeeResume>>(this.employeeResumeDao.getByEmployee_UserId(employeeId),"Özgeçmişler çalışanlara göre listelendi");
	}

	@Override
	public DataResult<List<EmployeeResume>> getAll() {
		return new SuccessDataResult<List<EmployeeResume>>(this.employeeResumeDao.findAll(),"Özgeşmişler Listelendi");
	}

}
