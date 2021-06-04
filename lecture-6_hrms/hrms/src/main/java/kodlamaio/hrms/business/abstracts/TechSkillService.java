package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.TechSkill;

public interface TechSkillService {
	
	Result add(TechSkill techSkill);
	
	DataResult<List<TechSkill>> getAll();

}