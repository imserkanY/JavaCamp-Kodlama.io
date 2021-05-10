package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.entities.concretes.User;

public interface UserService {
	List<User> getAll();
}
