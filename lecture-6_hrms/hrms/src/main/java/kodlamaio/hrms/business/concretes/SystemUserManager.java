package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SystemUserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.dataAccess.abstracts.SystemUserDao;
import kodlamaio.hrms.entities.concretes.SystemUser;

@Service
public class SystemUserManager implements SystemUserService {
	
	private SystemUserDao systemUserDao;
	
	@Autowired
	public SystemUserManager(SystemUserDao systemuUserDao) {
		super();
		this.systemUserDao = systemuUserDao;
	}

	@Override
	public DataResult<List<SystemUser>> getAll() {
		return new SuccesDataResult<List<SystemUser>>( systemUserDao.findAll(),"Data eklendi");
	}

}
