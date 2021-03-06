package Concrate;

import Abstract.DiscountService;
import Entities.Discount;

public class DiscountManager implements DiscountService{

	@Override
	public void add(Discount discount) {
		System.out.println(discount.getInfo() + " sisteme %" + discount.getDiscountPercent() + " indirim oranıyla " + "eklenmiştir.");
		
	}

	@Override
	public void update(Discount discount) {
		System.out.println(discount.getInfo() + " güncellenmiştir.");
		
	}

	@Override
	public void delete(Discount discount) {
		System.out.println(discount.getInfo() + " sistemden kaldırılmıştır");
		
	}

}
