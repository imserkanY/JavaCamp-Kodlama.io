package Concrate;

import Abstract.SalesService;
import Entities.Discount;
import Entities.Game;
import Entities.User;

public class SalesManager implements SalesService{
	private double discountPercent;
	private double gamePrice;
	
	
	@Override
	public void sale(Game[] games, User user,Discount discount) {
		for(Game game:games) {
			discountPercent = discount.getDiscountPercent();
			gamePrice = game.getGamePrice();
			gamePrice = gamePrice - (gamePrice * discountPercent / 100);
			System.out.println(game.getGameName() + " oyunu " + discount.getInfo() + " uygulanarak "+ user.getFirstName() + 
			" taraf�ndan " + gamePrice + "TL'ye al�nm��t�r");
		}
	}


	@Override
	public void addToList(Game[] games, User user) {
		for(Game game:games) {
			System.out.println(game.getGameName() + " Al��veri� Sepetine " + game.getGamePrice() + "TL'ye eklenmi�tir." );
		}
		
	}

}
