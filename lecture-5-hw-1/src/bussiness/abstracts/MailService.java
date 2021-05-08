package bussiness.abstracts;

import entities.concretes.User;

public interface MailService {
	boolean CheckIfTrueMail(User user);
}
