package bussiness.abstracts;

import entities.concretes.User;

public interface UserService {
	void add(User user);
	void login(String email,String password);
}
