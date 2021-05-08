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
			System.out.println(user.getFirstName() + " kullanýcýsý eklendi.");
		} else {
			System.out.println("Hatalý kullanýcý.");
		}
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " kullanýcýsý güncellendi.");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " kullanýcýsý silindi.");
	}
	
}
