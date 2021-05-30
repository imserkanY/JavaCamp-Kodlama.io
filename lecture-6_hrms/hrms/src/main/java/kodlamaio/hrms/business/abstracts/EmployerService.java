package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.dtos.EmployerDto;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result register(EmployerDto employer);
}