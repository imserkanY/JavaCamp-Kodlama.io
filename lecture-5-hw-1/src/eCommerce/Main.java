package eCommerce;

import bussiness.abstracts.UserService;
import bussiness.abstracts.UserVerificationService;
import bussiness.concretes.UserManager;
import bussiness.concretes.UserVerificationManager;
import core.GoogleMailApiAdapter;
import dataAccess.concretes.UseMemoryDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userManager = new UserManager(new UseMemoryDao(),new UserVerificationManager(),new GoogleMailApiAdapter());
		UserVerificationService userVerificationService = new UserVerificationManager();
		User okan = new User(1,"Okan","Yazl�","okanyazli@gmail.com","12345x");
		User serkan = new User(2,"Serkan","Yazl�","serkanyazli@gmail.com","asdasfx");//Serkan Yazl� kullan�c�s� veri taban�na eklendi.
		User x1 = new User(3,"Ali","Yazl�","serkanyazli@gmail.com","asdasfx");//Bu mail adresi daha �nce kullan�lm��t�r.
		User x2 = new User(4,"Veli","Yazl�","ssserkanyazli@gmail.com","asdas");//Ad ve soyad k�sm� 2 karakterden fazla,parolan�z ise 6 karakterden fazla olmal�d�r.
		User x3 = new User(5,"TelAli","Yazl�","telali@mail.com","asdasfx");//Mail adresiniz google taraf�ndan do�rulanamad�.
		System.out.println("");
		System.out.println("|____________<Veri Taban�>_____________|");
		System.out.println("|                                      |");
		userManager.add(okan);
		userManager.add(serkan);
		userManager.add(x1);
		userManager.add(x2);
		userManager.add(x3);
		System.out.println("");
		System.out.println("|__________<Hesap Do�rulama>___________|");
		System.out.println("|                                      |");
		userVerificationService.verificate(okan);
		userVerificationService.verificate(serkan);
		userVerificationService.verificate(x3);
		System.out.println("");
		System.out.println("|____<Giri� ve Bilgilendirme Ekran�>___|");
		System.out.println("|                                      |");
		userManager.login("okanyazli@gmail.com","12345x");//Okan Yazl� kullan�c�s� i�in giri� ba�ar�l�.
		userManager.login("","");//Giri� ba�ar�s�z email ve �ifre alan� bo� olamaz.
		userManager.login("s","ss");//Hatal� giri� veya do�rulanmam�� mail adresi.
		userManager.login("serkanyazli@gmail.com", "asdasfx");
	}
}
