package Abstract;

import Entities.Discount;
import Entities.Game;
import Entities.User;

public interface SalesService {

	void sale(Game[] games, User user, Discount discount);
	void addToList(Game[] gamess, User user);
}
