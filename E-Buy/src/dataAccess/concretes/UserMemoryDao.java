package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserMemoryDao implements UserDao{
	private ArrayList<User> users = new ArrayList<User>();
	@Override
	public void saveMemory(User user) {
		users.add(user);
		System.out.println(user.getFirstName() + " kullanýcýsý sisteme eklendi.");
	}
	
	@Override
	public ArrayList<User> readMemory() {
		return users;
	}
}
