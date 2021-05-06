package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserMailCheckService;
import entities.concretes.User;

public class GoogleMailManagerAdapter implements UserMailCheckService{

	@Override
	public boolean CheckIfTrueMail(User user) {
		Pattern pattern = Pattern.compile("@gmail.com", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(user.geteMail());
	    boolean matchFound = matcher.find();
	    return matchFound;
	}

}
