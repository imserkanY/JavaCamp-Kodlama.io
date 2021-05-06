import business.concretes.UserManager;
import core.GoogleMailManagerAdapter;
import dataAccess.concretes.UserMemoryDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager(new GoogleMailManagerAdapter(), new UserMemoryDao());
		User serkan = new User(1,"Serkan","YAZLI","serkanyazli@gmail.com","12345*");
		User okan = new User(2,"Okan","YAZLI","serksanyazli@gail.com","asdasd32*");
		User mahmut = new User(3,"mahmut","s","serksanyazli@gmail.com","asdasd32*");
		userManager.add(serkan);
		userManager.add(okan);
		userManager.add(mahmut);
	}

}
