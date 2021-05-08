package bussiness.concretes;

import bussiness.abstracts.MailService;
import bussiness.abstracts.UserService;
import bussiness.abstracts.UserVerificationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	UserDao userDao;
	UserVerificationService userVerificationService;
	MailService mailCheckService;
	
	
	public UserManager(UserDao userDao,UserVerificationService userVerificationService,MailService mailCheckService) {
		super();
		this.userDao = userDao;
		this.userVerificationService=userVerificationService;
		this.mailCheckService = mailCheckService;
	}

	@Override
	public void add(User user) {
		if(!checkIfUserExists(user.getEmail())){
			System.out.println("Bu mail adresi daha �nce kullan�lm��t�r.");
			return;
		}
		
		if(!mailCheckService.CheckIfTrueMail(user)) {
			System.out.println("Mail adresiniz google taraf�ndan do�rulanamad�.");
			return;
		}
		
		if(!userVerificationService.checkPerson(user)) {
			System.out.println("Ad ve soyad k�sm� 2 karakterden fazla,parolan�z ise 6 karakterden fazla olmal�d�r.");
			return;
		}
		
		userDao.save(user);
		userVerificationService.sendMail(user.getEmail());
	}
	
	@Override
	public void login(String email, String password) {
		if(!userVerificationService.checkEmailPassword(email, password)) {
			System.out.println("Giri� ba�ar�s�z email ve �ifre alan� bo� olamaz.");
			return;
		}
		
		User loginUser= userDao.checkMailPassword(email, password);
		if(loginUser != null && loginUser.isUserVerification()) {
			System.out.println(loginUser.getFirstName() + " " + loginUser.getLastName() + " kullan�c�s� i�in giri� ba�ar�l�." );
		}else {
			System.out.println("Hatal� giri� veya do�rulanmam�� mail adresi.");
		}
	}
	
	private boolean checkIfUserExists(String email) {
		return userDao.listEmail(email) == null;
	}
}
