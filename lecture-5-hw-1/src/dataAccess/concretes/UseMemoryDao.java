package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UseMemoryDao implements UserDao{
	ArrayList<User> users = new ArrayList<User>();
	
	@Override
	public void save(User user) {
		users.add(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcýsý veri tabanýna eklendi.");
	}

	@Override
	public User listEmail(String email) {
		for(User user : users) {
			if(user.getEmail() == email)
				return user;
		}
		return null;
	}
	
	@Override
	public User checkMailPassword(String email, String password) {
		for(User user : users) {
			if(user.getEmail() == email && user.getPassword() == password)
				return user;
		}
		return null;
	}
}
