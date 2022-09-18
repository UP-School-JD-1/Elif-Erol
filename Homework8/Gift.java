package Homework8;

public class Gift extends AbstractProduct implements Locatable {

	public Gift(String description, String sku) {
		super(description, sku);

	}

	public void specialDay(Product product) {
		System.out.println("This product is a gift: " + super.getDescription());

	}

	@Override
	public void getDepot() {
		System.out.println("This product " + super.getDescription() + " in stock");

	}

	@Override
	public void getPlace() {
		System.out.println("This product " + super.getDescription() + " has been placed.");

	}

}