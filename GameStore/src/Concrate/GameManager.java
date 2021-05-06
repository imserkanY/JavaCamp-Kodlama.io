package Concrate;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " oyunu markete eklenmiþtir.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " oyunu güncellenmiþtir.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " oyunu marketten kaldýrýlmýþtýr.");
	}

	@Override
	public void addMultiple(Game[] games) {
		for(Game game:games) {
			System.out.println(game.getGameName() + " oyunu markete eklenmiþtir.");
		}
	}

}
