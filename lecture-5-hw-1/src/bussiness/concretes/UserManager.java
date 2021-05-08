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
			System.out.println("Bu mail adresi daha önce kullanýlmýþtýr.");
			return;
		}
		
		if(!mailCheckService.CheckIfTrueMail(user)) {
			System.out.println("Mail adresiniz google tarafýndan doðrulanamadý.");
			return;
		}
		
		if(!userVerificationService.checkPerson(user)) {
			System.out.println("Ad ve soyad kýsmý 2 karakterden fazla,parolanýz ise 6 karakterden fazla olmalýdýr.");
			return;
		}
		
		userDao.save(user);
		userVerificationService.sendMail(user.getEmail());
	}
	
	@Override
	public void login(String email, String password) {
		if(!userVerificationService.checkEmailPassword(email, password)) {
			System.out.println("Giriþ baþarýsýz email ve þifre alaný boþ olamaz.");
			return;
		}
		
		User loginUser= userDao.checkMailPassword(email, password);
		if(loginUser != null && loginUser.isUserVerification()) {
			System.out.println(loginUser.getFirstName() + " " + loginUser.getLastName() + " kullanýcýsý için giriþ baþarýlý." );
		}else {
			System.out.println("Hatalý giriþ veya doðrulanmamýþ mail adresi.");
		}
	}
	
	private boolean checkIfUserExists(String email) {
		return userDao.listEmail(email) == null;
	}
}
