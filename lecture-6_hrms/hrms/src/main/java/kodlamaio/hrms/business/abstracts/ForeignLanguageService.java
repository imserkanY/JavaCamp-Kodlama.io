package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ForeignLanguage;

public interface ForeignLanguageService {
	
	Result add(ForeignLanguage foreignLanguage);
	
	DataResult<List<ForeignLanguage>> getAll();

}