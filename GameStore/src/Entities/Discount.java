package Entities;

import Abstract.Entity;

public class Discount implements Entity{
	private int discountPercent;
	private String info;
	
	
	public Discount() {

	}
	
	public Discount(int discountPercent, String info) {
		super();
		this.discountPercent = discountPercent;
		this.info = info;
	}
	public int getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
