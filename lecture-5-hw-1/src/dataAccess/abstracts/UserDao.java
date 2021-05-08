package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {
	void save(User user);
	User listEmail(String email);
	User checkMailPassword(String email,String password);
}
