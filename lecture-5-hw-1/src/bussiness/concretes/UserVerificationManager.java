package bussiness.concretes;

import java.util.regex.Pattern;

import bussiness.abstracts.UserVerificationService;
import core.utils.RunRules;
import entities.concretes.User;

public class UserVerificationManager implements UserVerificationService{

	public static final Pattern mailRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	@Override
	public boolean checkPerson(User user) {
		 boolean result = RunRules.run(
				 checkFirstName(user.getFirstName()),
				 checkLastName(user.getLastName()),
				 checkPassword(user.getPassword()),
				 checkIfEmailExist(user.getEmail())
				 );
		 return result;
	}

	@Override
	public boolean checkIfEmailExist(String email) {
		return mailRegex.matcher(email).find();
	}

	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length()>=2) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length()>=2) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkPassword(String password) {
		if(password.length()>=6) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void sendMail(String email) {
		System.out.println("Lütfen " + email +" adresinize yollanan doðrulama linkine týklayýnýz.");
	}

	@Override
	public void verificate(User user) {
		user.setUserVerification(true);
		System.out.println(user.getEmail() + " Mail adresiniz baþarýyla doðrulandý artýk giriþ yapabilirsiniz.");
	}

	@Override
	public boolean checkEmailPassword(String email, String password) {
		if(email !="" && password!="") {
			return true;
		}else {
			return false;
		}
	}
	
	

}
