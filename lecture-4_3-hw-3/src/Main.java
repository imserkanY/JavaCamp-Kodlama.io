import Adapter.MernisManagerAdapter;
import Concrate.DiscountManager;
import Concrate.GameManager;
import Concrate.SalesManager;
import Concrate.UserManager;
import Entities.Discount;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager(new MernisManagerAdapter());
		User serkan = new User(1,"Serkan", "YAZLI", 52072778042L, 2002);
		User okan = new User(1,"Okan", "YAZLI", 71419133054L, 1994);
		
		System.out.println("|________________<Kullanýcýlar>______________|");
		System.out.println("|                                            |");
		userManager.add(okan);
		userManager.add(serkan);
		userManager.delete(okan);
		
		System.out.println("");
		System.out.println("|__________________<Oyunlar>_________________|");
		System.out.println("|                                            |");
		GameManager gameManager = new GameManager();
		Game Rust = new Game(1,"RUST",59.50);
		Game Mc = new Game(2,"Minecraft",159.60);
		Game Vlh = new Game(3,"Valheim",29.30);
		Game CS = new Game(4,"Cs:GO",107);
		Game[] games = {Mc,Rust,Vlh,CS};
		Game[] gamesB = {Mc,CS,Vlh};
 		gameManager.addMultiple(games);
 		gameManager.delete(Rust);
 		
 		System.out.println("");
 		System.out.println("|_________________<Ýndirimler>_______________|");
 		System.out.println("|                                            |");
 		DiscountManager discountManager = new DiscountManager();
 		Discount Yaz = new Discount(30,"Yaz Ýndirimi");
 		Discount Kýþ = new Discount(10,"Kýþ Ýndirimi");
 		discountManager.add(Kýþ);
 		discountManager.add(Yaz);
 		discountManager.delete(Kýþ);

 		System.out.println("");
 		System.out.println("|___________________<Satýþ___________________|");
 		System.out.println("|                                            |");
		SalesManager salesManager = new SalesManager();
		salesManager.addToList(gamesB, serkan);
		System.out.println("");
		salesManager.sale(gamesB, serkan,Yaz);
	}
}
