package Concrate;

import Abstract.DiscountService;
import Entities.Discount;

public class DiscountManager implements DiscountService{

	@Override
	public void add(Discount discount) {
		System.out.println(discount.getInfo() + " sisteme %" + discount.getDiscountPercent() + " indirim oran�yla " + "eklenmi�tir.");
		
	}

	@Override
	public void update(Discount discount) {
		System.out.println(discount.getInfo() + " g�ncellenmi�tir.");
		
	}

	@Override
	public void delete(Discount discount) {
		System.out.println(discount.getInfo() + " sistemden kald�r�lm��t�r");
		
	}

}
