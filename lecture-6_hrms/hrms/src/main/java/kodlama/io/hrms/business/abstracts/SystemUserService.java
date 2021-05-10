package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.entities.concretes.SystemUser;

public interface SystemUserService {
	List<SystemUser> getAll();
}
