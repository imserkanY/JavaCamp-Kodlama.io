package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementService {

	DataResult<List<JobAdvertisementDto>> findByActivityStatus();

	DataResult<List<JobAdvertisementDto>> findByActivityStatusAndApplicationDeadline();

	DataResult<List<JobAdvertisementDto>> findByActivityStatusAndCompanyName(String companyName);
	
	Result add(JobAdvertisement jobAdvertisement);

	Result delete(JobAdvertisement jobAdvertisement);

}