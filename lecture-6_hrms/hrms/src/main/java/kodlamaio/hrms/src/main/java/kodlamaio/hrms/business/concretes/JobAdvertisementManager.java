package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}
	

	@Override
	public DataResult<List<JobAdvertisementDto>> findByActivityStatus() {
		return new SuccessDataResult<List<JobAdvertisementDto>>(this.jobAdvertisementDao.findByActivityStatus(true));
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> findByActivityStatusAndApplicationDeadline() {
		return new SuccessDataResult<List<JobAdvertisementDto>>(this.jobAdvertisementDao.findByActivityStatusOrderByApplicationDeadline(true));
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> findByActivityStatusAndCompanyName(String companyName) {
		return new SuccessDataResult<List<JobAdvertisementDto>>(this.jobAdvertisementDao.findByActivityStatusAndEmployer_CompanyName(true,companyName));
	}
	
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı ekleme başarılı");
	}

	@Override
	public Result delete(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.delete(jobAdvertisement);
		return new SuccessResult("İş ilani silme başarılı");
	}

}