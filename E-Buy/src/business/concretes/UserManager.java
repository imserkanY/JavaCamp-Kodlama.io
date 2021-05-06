package business.concretes;

import business.abstracts.UserMailCheckService;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	private UserMailCheckService userMailCheckService;
	private UserDao userDao;
	
	public UserManager(UserMailCheckService userMailCheckService,UserDao userDao) {
		super();
		this.userMailCheckService = userMailCheckService;
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		if(userMailCheckService.CheckIfTrueMail(user)) {
			if(user.getPassword().length()>=6 && user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
				userDao.saveMemory(user);
				
			}else {
				System.out.println("Kullan�c� eklenemedi parola en az 6 haneli ad ve soyad en az 2 haneli olmal�d�r.");
			}
		}else {
			System.out.println("Girilen e-mail yanl��.");
		}
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

}
