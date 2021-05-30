package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	DataResult<List<JobAdvertisement>> findByActivityStatus();

	DataResult<List<JobAdvertisement>> findByActivityStatusAndApplicationDeadline();

	DataResult<List<JobAdvertisement>> findByActivityStatusAndCompanyName(String companyName);
	
	Result add(JobAdvertisement jobAdvertisement);

	Result delete(JobAdvertisement jobAdvertisement);

}