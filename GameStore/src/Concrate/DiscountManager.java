package Concrate;

import Abstract.DiscountService;
import Entities.Discount;

public class DiscountManager implements DiscountService{

	@Override
	public void add(Discount discount) {
		System.out.println(discount.getInfo() + " sisteme %" + discount.getDiscountPercent() + " indirim oranýyla " + "eklenmiþtir.");
		
	}

	@Override
	public void update(Discount discount) {
		System.out.println(discount.getInfo() + " güncellenmiþtir.");
		
	}

	@Override
	public void delete(Discount discount) {
		System.out.println(discount.getInfo() + " sistemden kaldýrýlmýþtýr");
		
	}

}
