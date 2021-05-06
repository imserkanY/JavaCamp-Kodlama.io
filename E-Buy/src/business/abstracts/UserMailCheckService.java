package business.abstracts;

import entities.concretes.User;

public interface UserMailCheckService {
	boolean CheckIfTrueMail(User user);
}
