package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.TechSkillService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.TechSkillDao;
import kodlamaio.hrms.entities.concretes.TechSkill;

@Service
public class TechSkillManager implements TechSkillService{
	
	private TechSkillDao techSkillDao;

	public TechSkillManager(TechSkillDao techSkillDao) {
		super();
		this.techSkillDao = techSkillDao;
	}

	@Override
	public Result add(TechSkill techSkill) {
		this.techSkillDao.save(techSkill);
		return new SuccessResult("Yetenek eklendi");
	}

	@Override
	public DataResult<List<TechSkill>> getAll() {
		return new SuccessDataResult<List<TechSkill>>(this.techSkillDao.findAll(),"Yetenekler listelendi");
	}

}
