package Concrate;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " oyunu markete eklenmi�tir.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " oyunu g�ncellenmi�tir.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " oyunu marketten kald�r�lm��t�r.");
	}

	@Override
	public void addMultiple(Game[] games) {
		for(Game game:games) {
			System.out.println(game.getGameName() + " oyunu markete eklenmi�tir.");
		}
	}

}
