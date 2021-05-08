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
		User okan = new User(1,"Okan","Yazlý","okanyazli@gmail.com","12345x");
		User serkan = new User(2,"Serkan","Yazlý","serkanyazli@gmail.com","asdasfx");//Serkan Yazlý kullanýcýsý veri tabanýna eklendi.
		User x1 = new User(3,"Ali","Yazlý","serkanyazli@gmail.com","asdasfx");//Bu mail adresi daha önce kullanýlmýþtýr.
		User x2 = new User(4,"Veli","Yazlý","ssserkanyazli@gmail.com","asdas");//Ad ve soyad kýsmý 2 karakterden fazla,parolanýz ise 6 karakterden fazla olmalýdýr.
		User x3 = new User(5,"TelAli","Yazlý","telali@mail.com","asdasfx");//Mail adresiniz google tarafýndan doðrulanamadý.
		System.out.println("");
		System.out.println("|____________<Veri Tabaný>_____________|");
		System.out.println("|                                      |");
		userManager.add(okan);
		userManager.add(serkan);
		userManager.add(x1);
		userManager.add(x2);
		userManager.add(x3);
		System.out.println("");
		System.out.println("|__________<Hesap Doðrulama>___________|");
		System.out.println("|                                      |");
		userVerificationService.verificate(okan);
		userVerificationService.verificate(serkan);
		userVerificationService.verificate(x3);
		System.out.println("");
		System.out.println("|____<Giriþ ve Bilgilendirme Ekraný>___|");
		System.out.println("|                                      |");
		userManager.login("okanyazli@gmail.com","12345x");//Okan Yazlý kullanýcýsý için giriþ baþarýlý.
		userManager.login("","");//Giriþ baþarýsýz email ve þifre alaný boþ olamaz.
		userManager.login("s","ss");//Hatalý giriþ veya doðrulanmamýþ mail adresi.
		userManager.login("serkanyazli@gmail.com", "asdasfx");
	}
}
