package dataAccess.abstracts;

import java.util.ArrayList;

import entities.concretes.User;

public interface UserDao {
	void saveMemory(User user);
	ArrayList<User> readMemory();
}
