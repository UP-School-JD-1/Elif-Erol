package Homework8;

import java.util.Date;

public class FoodProduct extends Product implements Locatable, Priceable {

	Date productionDate;
	int life;

	public FoodProduct(String sku, String description, double price, double tax, Date productionDate, int life) {
		super(description, sku, price, tax);
		this.productionDate = productionDate;
		this.life = life;
	}

	@Override
	public void getDepot() {
		System.out.println("This product " + super.getDescription() + " is in stock");

	}

	@Override
	public void getPlace() {
		System.out.println("This product " + super.getDescription() + " has been placed");
	}

}
