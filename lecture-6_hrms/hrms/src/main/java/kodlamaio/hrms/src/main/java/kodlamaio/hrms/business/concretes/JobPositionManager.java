package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

	@Override
	public JobPosition getByPositionName(String positionName) {
		return this.jobPositionDao.findByPositionName(positionName);
	}

	@Override
	public Result add(JobPosition jobPosition) {
		if(jobPosition.getPositionName() == null || jobPosition.getPositionName() == "")
			return new ErrorResult("İş pozisyon ismi boş bırakılamaz.");
		if(getByPositionName(jobPosition.getPositionName()) != null)
			return new ErrorResult("Aynı isimde iki adet iş pozisyonu oluşturulamaz.");
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("İş pozisyonu başarıyla eklendi.");
	}
	
	

}