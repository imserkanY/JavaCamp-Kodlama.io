package googleMailApi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import entities.concretes.User;

public class GoogleMailManager {
	public boolean CheckIfTrueMail(User user) {
		Pattern pattern = Pattern.compile("@gmail.com", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(user.getEmail());
	    return matcher.find();
	}
}
