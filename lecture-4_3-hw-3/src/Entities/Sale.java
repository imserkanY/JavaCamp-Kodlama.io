package Entities;

import Abstract.Entity;

public class Sale implements Entity{
	private Game[] games;
	private User user;
	
	public Sale() {

	}
	
	public Sale(Game[] games, User user) {
		super();
		this.games = games;
		this.user = user;
	}
	
	public Game[] getGames() {
		return games;
	}
	public void setGames(Game[] games) {
		this.games = games;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}	
}
