package core;

import bussiness.abstracts.MailService;
import entities.concretes.User;
import googleMailApi.GoogleMailManager;

public class GoogleMailApiAdapter implements MailService{
	public boolean CheckIfTrueMail(User user) {
	    GoogleMailManager googleMailManager = new GoogleMailManager();
	    return googleMailManager.CheckIfTrueMail(user);
	}
}
