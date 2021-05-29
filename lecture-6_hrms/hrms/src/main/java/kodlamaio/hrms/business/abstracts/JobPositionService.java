package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
    JobPosition getByPositionName(String positionName);
    Result add(JobPosition jobPosition);
}