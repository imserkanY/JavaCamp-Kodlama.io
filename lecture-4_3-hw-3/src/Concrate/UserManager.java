package Concrate;

import Abstract.UserCheckService;
import Abstract.UserSersivice;
import Entities.User;

public class UserManager implements UserSersivice{
	private UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if(userCheckService.ChekIfRealPerson(user)) {
			System.out.println(user.getFirstName() + " kullan�c�s� eklendi.");
		} else {
			System.out.println("Hatal� kullan�c�.");
		}
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " kullan�c�s� g�ncellendi.");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " kullan�c�s� silindi.");
	}
	
}
